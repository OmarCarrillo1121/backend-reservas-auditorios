package com.pmjrs.backend_reservas_auditorios.controller;

import com.pmjrs.backend_reservas_auditorios.dto.LoginRequest;
import com.pmjrs.backend_reservas_auditorios.dto.RegisterRequest;
import com.pmjrs.backend_reservas_auditorios.model.Usuario;
import com.pmjrs.backend_reservas_auditorios.model.UsuarioCatalogoRol;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioRepository;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioCatalogoRolRepository;
import com.pmjrs.backend_reservas_auditorios.util.JwtUtil;
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
    private final UsuarioCatalogoRolRepository rolRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthController(
            JwtUtil jwtUtil,
            AuthenticationManager authenticationManager,
            UsuarioRepository usuarioRepository,
            UsuarioCatalogoRolRepository rolRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.jwtUtil = jwtUtil;
        this.authenticationManager = authenticationManager;
        this.usuarioRepository = usuarioRepository;
        this.rolRepository = rolRepository;
        this.passwordEncoder = passwordEncoder;
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
        usuario.setActivo(1);
        usuario.setCreadoEl(LocalDate.now());

        // UsuarioCatalogoRol rol = rolRepository.findById(req.getIdRolUsuario())
        //         .orElseThrow(() -> new RuntimeException("Rol no encontrado"));
        // usuario.setRol(rol);

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
