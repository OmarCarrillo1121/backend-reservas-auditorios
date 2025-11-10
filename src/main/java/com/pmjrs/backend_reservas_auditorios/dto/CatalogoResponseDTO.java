package com.pmjrs.backend_reservas_auditorios.dto;

import java.time.LocalDate;

public record CatalogoResponseDTO(
    Long id,
    String nombre,
    String descripcion,
    String color,
    Integer activo,
    Integer creadoPor,
    LocalDate creadoEl,
    Integer ultimaActualizacionPor,
    LocalDate ultimaActualizacionEl
) {}
