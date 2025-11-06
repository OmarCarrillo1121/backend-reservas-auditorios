package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "recurso_reservacion")
public class RecursosReservacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_recurso_reservacion;

    @ManyToOne
    @JoinColumn(name = "id_recurso", nullable = false)
    private Recursos recurso;

    @ManyToOne
    @JoinColumn(name = "id_reservacion", nullable = false)
    private Reservacion reservacion;

    private Integer cantidad_asignada;
    private Integer activo;
    private Integer creado_por;
    private LocalDate creado_el;
    private Integer actualizado_por;
    private LocalDate actualizado_el;

    public RecursosReservacion() {}

    public RecursosReservacion(Recursos recurso, Reservacion reservacion, Integer cantidad_asignada, Integer activo, Integer creado_por, LocalDate creado_el, Integer actualizado_por, LocalDate actualizado_el) {
        this.recurso = recurso;
        this.reservacion = reservacion;
        this.cantidad_asignada = cantidad_asignada;
        this.activo = activo;
        this.creado_por = creado_por;
        this.creado_el = creado_el;
        this.actualizado_por = actualizado_por;
        this.actualizado_el = actualizado_el;
    }

    public Long getId_recurso_reservacion() { return id_recurso_reservacion; }
    public void setId_recurso_reservacion(Long id_recurso_reservacion) { this.id_recurso_reservacion = id_recurso_reservacion; }

    public Recursos getRecurso() { return recurso; }
    public void setRecurso(Recursos recurso) { this.recurso = recurso; }

    public Reservacion getReservacion() { return reservacion; }
    public void setReservacion(Reservacion reservacion) { this.reservacion = reservacion; }

    public Integer getCantidad_asignada() { return cantidad_asignada; }
    public void setCantidad_asignada(Integer cantidad_asignada) { this.cantidad_asignada = cantidad_asignada; }

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
