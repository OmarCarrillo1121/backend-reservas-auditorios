package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuario_tipo")
public class UsuarioTipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_tipo")
    private Long id_usuario_tipo;

    @Column(name = "nombre_tipo", nullable = false)
    private String nombre_tipo;

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

    public UsuarioTipo() {}

    public UsuarioTipo(
        String nombre_tipo,
        Integer activo,
        Integer creado_por,
        LocalDate creado_el,
        Integer actualizado_por,
        LocalDate actualizado_el
    ) {
        this.nombre_tipo = nombre_tipo;
        this.activo = activo;
        this.creado_por = creado_por;
        this.creado_el = creado_el;
        this.actualizado_por = actualizado_por;
        this.actualizado_el = actualizado_el;
    }

    public Long getId_usuario_tipo() { return id_usuario_tipo; }
    public void setId_usuario_tipo(Long id_usuario_tipo) { this.id_usuario_tipo = id_usuario_tipo; }

    public String getNombre_tipo() { return nombre_tipo; }
    public void setNombre_tipo(String nombre_tipo) { this.nombre_tipo = nombre_tipo; }

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
