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
                usuario.getRolUsuario(),
                usuario.getFacultadUsuario(),
                usuario.getAreaUsuario(),
                usuario.getPuestoUsuario(),
                usuario.getActivo(),
                usuario.getCreadoPor(),
                usuario.getCreadoEl(),
                usuario.getUltimaActualizacionPor(),
                usuario.getUltimaActualizacionEl()
        );
    }
}
