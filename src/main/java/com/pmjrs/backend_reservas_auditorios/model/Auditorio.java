package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;

@Entity
@Table(name = "auditorio")
public class Auditorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ubicacion;
    private String edificio;
    private Integer capacidad;

    public Auditorio() {}

    public Auditorio(String nombre, String ubicacion, String edificio, Integer capacidad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.edificio = edificio;
        this.capacidad = capacidad;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getEdificio() { return edificio; }
    public void setEdificio(String edificio) { this.edificio = edificio; }

    public Integer getCapacidad() { return capacidad; }
    public void setCapacidad(Integer capacidad) { this.capacidad = capacidad; }
}
