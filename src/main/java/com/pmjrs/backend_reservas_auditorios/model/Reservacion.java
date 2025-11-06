package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "reservacion")
public class Reservacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservacion")
    private Long id_reservacion;

    @ManyToOne
    @JoinColumn(name = "id_recinto", nullable = false)
    private Recinto recinto;

    @ManyToOne
    @JoinColumn(name = "id_solicitante", nullable = false)
    private Usuario solicitante;

    @Column(name = "fecha_reservacion", nullable = false)
    private LocalDate fecha_reservacion;

    @Column(name = "hora_inicio", nullable = false)
    private LocalTime hora_inicio;

    @Column(name = "hora_termino", nullable = false)
    private LocalTime hora_termino;

    @Column(name = "activo")
    private Integer activo;

    public Reservacion() {}

    public Reservacion(Recinto recinto, Usuario solicitante, LocalDate fechaReservacion,
                       LocalTime horaInicio, LocalTime horaTermino, Integer activo) {
        this.recinto = recinto;
        this.solicitante = solicitante;
        this.fecha_reservacion = fechaReservacion;
        this.hora_inicio = horaInicio;
        this.hora_termino = horaTermino;
        this.activo = activo;
    }

    public Long getId_reservacion() { return id_reservacion; }
    public void setId_reservacion(Long id_reservacion) { this.id_reservacion = id_reservacion; }

    public Recinto getRecinto() { return recinto; }
    public void setRecinto(Recinto recinto) { this.recinto = recinto; }

    public Usuario getSolicitante() { return solicitante; }
    public void setSolicitante(Usuario solicitante) { this.solicitante = solicitante; }

    public LocalDate getFecha_reservacion() { return fecha_reservacion; }
    public void setFecha_reservacion(LocalDate fecha_reservacion) { this.fecha_reservacion = fecha_reservacion; }

    public LocalTime getHora_inicio() { return hora_inicio; }
    public void setHora_inicio(LocalTime hora_inicio) { this.hora_inicio = hora_inicio; }

    public LocalTime getHora_termino() { return hora_termino; }
    public void setHora_termino(LocalTime hora_termino) { this.hora_termino = hora_termino; }

    public Integer getActivo() { return activo; }
    public void setActivo(Integer activo) { this.activo = activo; }
}
