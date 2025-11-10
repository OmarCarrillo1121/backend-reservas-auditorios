package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public abstract class CatalogoBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String color;
    private Integer activo;

    @Column(name = "creado_por")
    private Integer creadoPor;

    @Column(name = "creado_el")
    private LocalDate creadoEl;

    @Column(name = "ultima_actualizacion_por")
    private Integer ultimaActualizacionPor;

    @Column(name = "ultima_actualizacion_el")
    private LocalDate ultimaActualizacionEl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(Integer creadoPor) {
        this.creadoPor = creadoPor;
    }

    public LocalDate getCreadoEl() {
        return creadoEl;
    }

    public void setCreadoEl(LocalDate creadoEl) {
        this.creadoEl = creadoEl;
    }

    public Integer getUltimaActualizacionPor() {
        return ultimaActualizacionPor;
    }

    public void setUltimaActualizacionPor(Integer ultimaActualizacionPor) {
        this.ultimaActualizacionPor = ultimaActualizacionPor;
    }

    public LocalDate getUltimaActualizacionEl() {
        return ultimaActualizacionEl;
    }

    public void setUltimaActualizacionEl(LocalDate ultimaActualizacionEl) {
        this.ultimaActualizacionEl = ultimaActualizacionEl;
    }
}
