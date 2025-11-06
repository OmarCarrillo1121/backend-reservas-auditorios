package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservacion_status")
public class ReservacionStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_status")
    private Long id_status;

    @Column(name = "nombre_status", nullable = false)
    private String nombre_status;

    @Column(name = "color_status")
    private String color_status;

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

    public ReservacionStatus() {}

    public ReservacionStatus(
            String nombreStatus,
            String colorStatus,
            Integer activo,
            Integer creadoPor,
            LocalDate creadoEl,
            Integer actualizadoPor,
            LocalDate actualizadoEl
    ) {
        this.nombre_status = nombreStatus;
        this.color_status = colorStatus;
        this.activo = activo;
        this.creado_por = creadoPor;
        this.creado_el = creadoEl;
        this.actualizado_por = actualizadoPor;
        this.actualizado_el = actualizadoEl;
    }

    // Getters y Setters
    public Long getIdStatus() { return id_status; }
    public void setIdStatus( Long idStatus ) { this.id_status = idStatus; }

    public String getNombreStatus() { return nombre_status; }
    public void setNombreStatus( String nombreStatus ) { this.nombre_status = nombreStatus; }

    public String getColorStatus() { return color_status; }
    public void setColorStatus( String colorStatus ) { this.color_status = colorStatus; }

    public Integer getActivo() { return activo; }
    public void setActivo( Integer activo ) { this.activo = activo; }

    public Integer getCreadoPor() { return creado_por; }
    public void setCreadoPor( Integer creadoPor ) { this.creado_por = creadoPor; }
    
    public LocalDate getCreadoEl() { return creado_el; }
    public void setCreadoEl( LocalDate creadoEl ) { this.creado_el = creadoEl;}

    public Integer getActualizadoPor() { return actualizado_por; }
    public void setActualizadoPor( Integer actualizadoPor ) { this.actualizado_por = actualizadoPor; }

    public LocalDate getActualizadoEl() { return actualizado_el; }
    public void setActualizadoEl( LocalDate actualizadoEl ) { this.actualizado_el = actualizadoEl; }
}
