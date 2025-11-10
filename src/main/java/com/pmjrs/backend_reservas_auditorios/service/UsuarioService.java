package com.pmjrs.backend_reservas_auditorios.service;

import com.pmjrs.backend_reservas_auditorios.dto.UsuarioDTO;
import com.pmjrs.backend_reservas_auditorios.mapper.UsuarioMapper;
import com.pmjrs.backend_reservas_auditorios.model.Usuario;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
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
}
