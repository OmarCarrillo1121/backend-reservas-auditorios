package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.dto.LoginRequest;
import com.pmjrs.backend_reservas_auditorios.dto.RegisterRequest;
import com.pmjrs.backend_reservas_auditorios.model.Usuario;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioRepository;
import com.pmjrs.backend_reservas_auditorios.util.JwtUtil;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthController(
            JwtUtil jwtUtil,
            AuthenticationManager authenticationManager,
            UsuarioRepository usuarioRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.jwtUtil = jwtUtil;
        this.authenticationManager = authenticationManager;
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/me")
    public ResponseEntity<?> getUserInfo(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            return ResponseEntity.status(401).body("No token provided");
        }

        String token = authHeader.substring(7);
        String username = jwtUtil.extractUsername(token);

        var usuario = usuarioRepository.findByCorreo(username);

        if (usuario.isEmpty()) {
            return ResponseEntity.status(404).body("Usuario no encontrado");
        }

        return ResponseEntity.ok(usuario.get());
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest req) {
        if (usuarioRepository.findByCorreo(req.getCorreo()).isPresent()) {
            return ResponseEntity.badRequest().body(Map.of("error", "El correo ya está registrado"));
        }

        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(req.getNombreUsuario());
        usuario.setApellidoPaterno(req.getApellidoPaterno());
        usuario.setApellidoMaterno(req.getApellidoMaterno());
        usuario.setCorreo(req.getCorreo());
        usuario.setContrasena(passwordEncoder.encode(req.getContrasena()));
        usuario.setTelefonoFijo(req.getTelefonoFijo());
        usuario.setTelefonoContacto(req.getTelefonoContacto());
        usuario.setRolUsuario(req.getRolUsuario());
        usuario.setFacultadUsuario(req.getFacultadUsuario());
        usuario.setAreaUsuario(req.getAreaUsuario());
        usuario.setPuestoUsuario(req.getPuestoUsuario());

        usuario.setActivo(1);
        usuario.setCreadoEl(LocalDate.now());

        usuarioRepository.save(usuario);

        return ResponseEntity.ok(Map.of("message", "Usuario registrado exitosamente"));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest req) {
        try {
            Authentication auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(req.getUsername(), req.getPassword())
            );

            String token = jwtUtil.generateToken(req.getUsername());
            return ResponseEntity.ok(Map.of("token", token));

        } catch (BadCredentialsException e) {
            return ResponseEntity.status(401).body(Map.of("error", "Credenciales inválidas"));
        }
    }
}