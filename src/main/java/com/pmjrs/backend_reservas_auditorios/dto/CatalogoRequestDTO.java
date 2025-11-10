package com.pmjrs.backend_reservas_auditorios.dto;

public record CatalogoRequestDTO(
    String nombre,
    String descripcion,
    String color,
    Integer creadoPor
) {}
