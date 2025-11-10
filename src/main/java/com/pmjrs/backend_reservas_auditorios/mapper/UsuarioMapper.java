package com.pmjrs.backend_reservas_auditorios.mapper;

import com.pmjrs.backend_reservas_auditorios.dto.UsuarioDTO;
import com.pmjrs.backend_reservas_auditorios.model.Usuario;

public class UsuarioMapper {

    public static UsuarioDTO toDTO(Usuario usuario) {
        return new UsuarioDTO(
                usuario.getIdUsuario(),
                usuario.getNombreUsuario(),
                usuario.getApellidoPaterno(),
                usuario.getApellidoMaterno(),
                usuario.getCorreo(),
                usuario.getTelefonoFijo(),
                usuario.getTelefonoContacto(),
                usuario.getFotoPerfil(),
                usuario.getRol() != null ? usuario.getRol().getId() : null,
                usuario.getRol() != null ? usuario.getRol().getNombre() : null,
                usuario.getFacultad() != null ? usuario.getFacultad().getId() : null,
                usuario.getFacultad() != null ? usuario.getFacultad().getNombre() : null,
                usuario.getArea() != null ? usuario.getArea().getId() : null,
                usuario.getArea() != null ? usuario.getArea().getNombre() : null,
                usuario.getPuesto() != null ? usuario.getPuesto().getId() : null,
                usuario.getPuesto() != null ? usuario.getPuesto().getNombre() : null,
                usuario.getActivo(),
                usuario.getCreadoPor(),
                usuario.getCreadoEl(),
                usuario.getUltimaActualizacionPor(),
                usuario.getUltimaActualizacionEl()
        );
    }
}
