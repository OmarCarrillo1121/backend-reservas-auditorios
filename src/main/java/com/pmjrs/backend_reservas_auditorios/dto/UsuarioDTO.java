package com.pmjrs.backend_reservas_auditorios.dto;

import java.time.LocalDate;

public record UsuarioDTO(
        Long idUsuario,
        String nombreUsuario,
        String apellidoPaterno,
        String apellidoMaterno,
        String correo,
        String telefonoFijo,
        String telefonoContacto,
        String fotoPerfil,
        Long idRolUsuario,
        String nombreRol,
        Long idFacultadUsuario,
        String nombreFacultad,
        Long idAreaUsuario,
        String nombreArea,
        Long idPuestoUsuario,
        String nombrePuesto,
        Integer activo,
        Integer creadoPor,
        LocalDate creadoEl,
        Integer ultimaActualizacionPor,
        LocalDate ultimaActualizacionEl) {
}