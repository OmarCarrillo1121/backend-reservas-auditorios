package com.pmjrs.backend_reservas_auditorios.service;

import com.pmjrs.backend_reservas_auditorios.model.Usuario;
import com.pmjrs.backend_reservas_auditorios.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findByActivo(1);
    }

    public Optional<Usuario> getUsuarioById(Long id) {
        return usuarioRepository.findById(id)
                .filter(u -> u.getActivo() == 1);
    }

    public Optional<Usuario> getUsuarioByCorreo(String correo) {
        return usuarioRepository.findByCorreo(correo)
                .filter(u -> u.getActivo() == 1);
    }

    public Usuario createUsuario(Usuario usuario) {
        usuario.setActivo(1);
        usuario.setCreadoEl(LocalDate.now());
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUsuario(Long id, Usuario usuarioDetails) {
        return usuarioRepository.findById(id).map(usuario -> {
            usuario.setNombre(usuarioDetails.getNombre());
            usuario.setApellidoPaterno(usuarioDetails.getApellidoPaterno());
            usuario.setApellidoMaterno(usuarioDetails.getApellidoMaterno());
            usuario.setCorreo(usuarioDetails.getCorreo());
            usuario.setContrasena(usuarioDetails.getContrasena());
            usuario.setTelefonoFijo(usuarioDetails.getTelefonoFijo());
            usuario.setTelefonoContacto(usuarioDetails.getTelefonoContacto());
            usuario.setImagenUsuario(usuarioDetails.getImagenUsuario());
            usuario.setFacultadUsuario(usuarioDetails.getFacultadUsuario());
            usuario.setAreaUsuario(usuarioDetails.getAreaUsuario());
            usuario.setPuestoUsuario(usuarioDetails.getPuestoUsuario());
            usuario.setActualizadoPor(usuarioDetails.getActualizadoPor());
            usuario.setActualizadoEl(LocalDate.now());
            return usuarioRepository.save(usuario);
        }).orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + id));
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.findById(id).ifPresent(usuario -> {
            usuario.setActivo(0);
            usuario.setActualizadoEl(LocalDate.now());
            usuarioRepository.save(usuario);
        });
    }
}
