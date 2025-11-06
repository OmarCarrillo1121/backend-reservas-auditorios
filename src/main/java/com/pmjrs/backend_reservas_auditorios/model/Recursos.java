package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "recursos")
public class Recursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_recurso;

    @ManyToOne
    @JoinColumn(name = "id_recurso_catalogo", nullable = false)
    private RecursosCatalogo id_recurso_catalogo;

    @ManyToOne
    @JoinColumn(name = "id_area", nullable = false)
    private RecursosArea id_area;

    private Integer activo;
    private Integer creado_por;
    private LocalDate creado_el;
    private Integer actualizado_por;
    private LocalDate actualizado_el;

    public Recursos() {}

    public Recursos(RecursosCatalogo id_recurso_catalogo, RecursosArea id_area, Integer activo, Integer creado_por, LocalDate creado_el, Integer actualizado_por, LocalDate actualizado_el) {
        this.id_recurso_catalogo = id_recurso_catalogo;
        this.id_area = id_area;
        this.activo = activo;
        this.creado_por = creado_por;
        this.creado_el = creado_el;
        this.actualizado_por = actualizado_por;
        this.actualizado_el = actualizado_el;
    }

    public Long getId_recurso() { return id_recurso; }
    public void setId_recurso(Long id_recurso) { this.id_recurso = id_recurso; }

    public RecursosCatalogo getId_recurso_catalogo() { return id_recurso_catalogo; }
    public void setId_recurso_catalogo(RecursosCatalogo id_recurso_catalogo) { this.id_recurso_catalogo = id_recurso_catalogo; }

    public RecursosArea getId_area() { return id_area; }
    public void setId_area(RecursosArea id_area) { this.id_area = id_area; }

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
