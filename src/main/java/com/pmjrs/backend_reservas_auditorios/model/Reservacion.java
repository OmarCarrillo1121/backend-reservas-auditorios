package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "reservacion")
public class Reservacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_auditorio")
    private Auditorio auditorio;

    @ManyToOne
    @JoinColumn(name = "id_solicitante")
    private Usuario solicitante;

    private LocalDate fechaReservacion;
    private LocalTime horaInicio;
    private LocalTime horaTermino;
    private String status;

    public Reservacion() {}

    public Reservacion(Auditorio auditorio, Usuario solicitante, LocalDate fechaReservacion,
                       LocalTime horaInicio, LocalTime horaTermino, String status) {
        this.auditorio = auditorio;
        this.solicitante = solicitante;
        this.fechaReservacion = fechaReservacion;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.status = status;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Auditorio getAuditorio() { return auditorio; }
    public void setAuditorio(Auditorio auditorio) { this.auditorio = auditorio; }

    public Usuario getSolicitante() { return solicitante; }
    public void setSolicitante(Usuario solicitante) { this.solicitante = solicitante; }

    public LocalDate getFechaReservacion() { return fechaReservacion; }
    public void setFechaReservacion(LocalDate fechaReservacion) { this.fechaReservacion = fechaReservacion; }

    public LocalTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalTime horaInicio) { this.horaInicio = horaInicio; }

    public LocalTime getHoraTermino() { return horaTermino; }
    public void setHoraTermino(LocalTime horaTermino) { this.horaTermino = horaTermino; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
