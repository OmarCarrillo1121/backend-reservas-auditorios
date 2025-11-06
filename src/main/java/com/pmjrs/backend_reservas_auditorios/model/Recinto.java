package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "recinto")
public class Recinto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recinto")
    private Long id_recinto;

    @Column(name = "nombre_recinto", nullable = false)
    private String nombre_recinto;

    @Column(name = "ubicacion_recinto")
    private String ubicacion_recinto;

    @Column(name = "edificio_recinto")
    private String edificio_recinto;

    @Column(name = "capacidad")
    private Integer capacidad;

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

    public Recinto() {}

    public Recinto(String nombreRecinto, String ubicacionRecinto, String edificioRecinto, Integer capacidad,
                   Integer activo, Integer creadoPor, LocalDate creadoEl, Integer actualizadoPor, LocalDate actualizadoEl) {
        this.nombre_recinto = nombreRecinto;
        this.ubicacion_recinto = ubicacionRecinto;
        this.edificio_recinto = edificioRecinto;
        this.capacidad = capacidad;
        this.activo = activo;
        this.creado_por = creadoPor;
        this.creado_el = creadoEl;
        this.actualizado_por = actualizadoPor;
        this.actualizado_el = actualizadoEl;
    }

    public Long getIdRecinto() { return id_recinto; }
    public void setIdRecinto(Long idRecinto) { this.id_recinto = idRecinto; }

    public String getNombreRecinto() { return nombre_recinto; }
    public void setNombreRecinto(String nombreRecinto) { this.nombre_recinto = nombreRecinto; }

    public String getUbicacionRecinto() { return ubicacion_recinto; }
    public void setUbicacionRecinto(String ubicacionRecinto) { this.ubicacion_recinto = ubicacionRecinto; }

    public String getEdificioRecinto() { return edificio_recinto; }
    public void setEdificioRecinto(String edificioRecinto) { this.edificio_recinto = edificioRecinto; }

    public Integer getCapacidad() { return capacidad; }
    public void setCapacidad(Integer capacidad) { this.capacidad = capacidad; }

    public Integer getActivo() { return activo; }
    public void setActivo(Integer activo) { this.activo = activo; }

    public Integer getCreadoPor() { return creado_por; }
    public void setCreadoPor(Integer creadoPor) { this.creado_por = creadoPor; }

    public LocalDate getCreadoEl() { return creado_el; }
    public void setCreadoEl(LocalDate creadoEl) { this.creado_el = creadoEl; }

    public Integer getActualizadoPor() { return actualizado_por; }
    public void setActualizadoPor(Integer actualizadoPor) { this.actualizado_por = actualizadoPor; }

    public LocalDate getActualizadoEl() { return actualizado_el; }
    public void setActualizadoEl(LocalDate actualizadoEl) { this.actualizado_el = actualizadoEl; }
}
