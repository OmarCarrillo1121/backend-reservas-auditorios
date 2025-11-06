package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "recursos_catalogo")
public class RecursosCatalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_recurso", nullable = false)
    private String nombre_recurso;

    @Column(name = "descripcion_recurso")
    private String descripcion_recurso;

    @Column(name = "activo")
    private Integer activo;

    @PrePersist
    public void prePersist() {
        if (activo == null) {
            activo = 1;
        }
    }

    @Column(name = "creado_por")
    private Integer creado_por;

    @Column(name = "creado_el")
    private LocalDate creado_el;

    @Column(name = "actualizado_por")
    private Integer actualizado_por;

    @Column(name = "actualizado_el")
    private LocalDate actualizado_el;

    public RecursosCatalogo() {}

    public RecursosCatalogo(String nombreRecurso, String descripcionRecurso, Integer activo, Integer creadoPor, LocalDate creadoEl, Integer actualizadoPor, LocalDate actualizadoEl) {
        this.nombre_recurso = nombreRecurso;
        this.descripcion_recurso = descripcionRecurso;
        this.activo = activo;
        this.creado_por = creadoPor;
        this.creado_el = creadoEl;
        this.actualizado_por = actualizadoPor;
        this.actualizado_el = actualizadoEl;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombreRecurso() { return nombre_recurso; }
    public void setNombreRecurso(String nombreRecurso) { this.nombre_recurso = nombreRecurso; }

    public String getDescripcionRecurso() { return descripcion_recurso; }
    public void setDescripcionRecurso(String descripcionRecurso) { this.descripcion_recurso = descripcionRecurso; }

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
