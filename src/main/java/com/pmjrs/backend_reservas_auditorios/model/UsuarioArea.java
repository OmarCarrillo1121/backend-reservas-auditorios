package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuario_area")
public class UsuarioArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_area")
    private Long id_usuario_area;

    @Column(name = "nombre_area", nullable = false)
    private String nombre_area;

    @Column(name = "activo")
    private Integer activo;

    @Column(name = "creado_por")
    private Integer creado_por;

    @Column(name = "creado_el")
    private LocalDate creado_el;

    @Column(name = "actualizado_por")
    private Integer actualizado_por;

    @Column(name = "actualizado_el")
    private LocalDate actualizado_el;

    public UsuarioArea() {}

    public UsuarioArea(
        String nombre_area,
        Integer activo,
        Integer creado_por,
        LocalDate creado_el,
        Integer actualizado_por,
        LocalDate actualizado_el
    ) {
        this.nombre_area = nombre_area;
        this.activo = activo;
        this.creado_por = creado_por;
        this.creado_el = creado_el;
        this.actualizado_por = actualizado_por;
        this.actualizado_el = actualizado_el;
    }

    public Long getId_usuario_area() { return id_usuario_area; }
    public void setId_usuario_area(Long id_usuario_area) { this.id_usuario_area = id_usuario_area; }

    public String getNombre_area() { return nombre_area; }
    public void setNombre_area(String nombre_area) { this.nombre_area = nombre_area; }

    public Integer getActivo() { return activo; }
    public void setActivo(Integer activo) { this.activo = activo; }

    public Integer getCreado_por() { return creado_por; }
    public void setCreado_por(Integer creado_por) { this.creado_por = creado_por; }

    public LocalDate getCreado_el() { return creado_el; }
    public void setCreado_el(LocalDate creado_el) { this.creado_el = creado_el; }

    public Integer getActualizado_por() { return actualizado_por; }
    public void setActualizado_por(Integer actualizado_por) { this.actualizado_por = actualizado_por; }

    public LocalDate getActualizado_el() { return actualizado_el; }
    public void setActualizado_el(LocalDate actualizado_el) { this.actualizado_el = actualizado_el; }
}
