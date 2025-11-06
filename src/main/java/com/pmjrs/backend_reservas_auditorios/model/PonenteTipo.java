package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ponente_tipo")
public class PonenteTipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_ponente")
    private Long id_tipo_ponente;

    @Column(name = "nombre_tipo_ponente", nullable = false)
    private String nombre_tipo_ponente;

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

    public PonenteTipo() {}

    public PonenteTipo(String nombreTipoPonente, Integer activo, Integer creadoPor, LocalDate creadoEl,
                       Integer actualizadoPor, LocalDate actualizadoEl) {
        this.nombre_tipo_ponente = nombreTipoPonente;
        this.activo = activo;
        this.creado_por = creadoPor;
        this.creado_el = creadoEl;
        this.actualizado_por = actualizadoPor;
        this.actualizado_el = actualizadoEl;
    }

    public Long getIdTipoPonente() { return id_tipo_ponente; }
    public void setIdTipoPonente(Long idTipoPonente) { this.id_tipo_ponente = idTipoPonente; }

    public String getNombreTipoPonente() { return nombre_tipo_ponente; }
    public void setNombreTipoPonente(String nombreTipoPonente) { this.nombre_tipo_ponente = nombreTipoPonente; }

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
