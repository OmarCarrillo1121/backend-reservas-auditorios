package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "recursos_area")
public class RecursosArea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_recursos_area;

    @Column(nullable = false)
    private String nombre_area;

    private String ubicacion_area;
    private String responsable_area;
    private String correo_contacto;
    private String numero_contacto;

    private Integer activo;
    private Integer creado_por;
    private LocalDate creado_el;
    private Integer actualizado_por;
    private LocalDate actualizado_el;

    public RecursosArea() {}

    public RecursosArea(String nombre_area, String ubicacion_area, String responsable_area,
                        String correo_contacto, String numero_contacto, Integer activo,
                        Integer creado_por, LocalDate creado_el, Integer actualizado_por, LocalDate actualizado_el) {
        this.nombre_area = nombre_area;
        this.ubicacion_area = ubicacion_area;
        this.responsable_area = responsable_area;
        this.correo_contacto = correo_contacto;
        this.numero_contacto = numero_contacto;
        this.activo = activo;
        this.creado_por = creado_por;
        this.creado_el = creado_el;
        this.actualizado_por = actualizado_por;
        this.actualizado_el = actualizado_el;
    }

    public Long getId_recursos_area() { return id_recursos_area; }
    public void setId_recursos_area(Long id_recursos_area) { this.id_recursos_area = id_recursos_area; }

    public String getNombre_area() { return nombre_area; }
    public void setNombre_area(String nombre_area) { this.nombre_area = nombre_area; }

    public String getUbicacion_area() { return ubicacion_area; }
    public void setUbicacion_area(String ubicacion_area) { this.ubicacion_area = ubicacion_area; }

    public String getResponsable_area() { return responsable_area; }
    public void setResponsable_area(String responsable_area) { this.responsable_area = responsable_area; }

    public String getCorreo_contacto() { return correo_contacto; }
    public void setCorreo_contacto(String correo_contacto) { this.correo_contacto = correo_contacto; }

    public String getNumero_contacto() { return numero_contacto; }
    public void setNumero_contacto(String numero_contacto) { this.numero_contacto = numero_contacto; }

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
