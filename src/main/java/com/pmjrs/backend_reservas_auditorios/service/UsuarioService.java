package com.pmjrs.backend_reservas_auditorios.service;

import com.pmjrs.backend_reservas_auditorios.dto.UsuarioDTO;
import com.pmjrs.backend_reservas_auditorios.mapper.UsuarioMapper;
import com.pmjrs.backend_reservas_auditorios.model.Usuario;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Usuario crearUsuario(Usuario usuario) {
        usuario.setContrasena(passwordEncoder.encode(usuario.getContrasena()));
        return usuarioRepository.save(usuario);
    }

    public List<UsuarioDTO> getAllUsuarios() {
        return usuarioRepository.findAll()
                .stream()
                .map(UsuarioMapper::toDTO)
                .collect(Collectors.toList());
    }

    public UsuarioDTO getUsuarioById(Long id) {
        return usuarioRepository.findById(id)
                .map(UsuarioMapper::toDTO)
                .orElse(null);
    }

    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
