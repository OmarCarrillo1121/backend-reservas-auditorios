package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservacion_origen")
public class ReservacionOrigen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservacion_origen")
    private Long id_reservacion_origen;

    @Column(name = "nombre_origen", nullable = false)
    private String nombre_origen;

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

    public ReservacionOrigen() {}

    public ReservacionOrigen(String nombre_origen, Integer activo, Integer creado_por, LocalDate creado_el, Integer actualizado_por, LocalDate actualizado_el) {
        this.nombre_origen = nombre_origen;
        this.activo = activo;
        this.creado_por = creado_por;
        this.creado_el = creado_el;
        this.actualizado_por = actualizado_por;
        this.actualizado_el = actualizado_el;
    }

    public Long getId_reservacion_origen() { return id_reservacion_origen; }
    public void setId_reservacion_origen(Long id_reservacion_origen) { this.id_reservacion_origen = id_reservacion_origen; }

    public String getNombre_origen() { return nombre_origen; }
    public void setNombre_origen(String nombre_origen) { this.nombre_origen = nombre_origen; }

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
