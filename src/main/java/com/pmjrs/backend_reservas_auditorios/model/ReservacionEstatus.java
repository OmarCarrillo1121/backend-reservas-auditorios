// package com.pmjrs.backend_reservas_auditorios.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;

// @Entity
// @Table(name = "reservacion_status")
// public class ReservacionEstatus {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_reservacion_status")
//     private Long id_reservacion_status;

//     @ManyToOne
//     @JoinColumn(name = "id_reservacion", nullable = false)
//     private Reservacion reservacion;

//     @ManyToOne
//     @JoinColumn(name = "id_status", nullable = false)
//     private EventoCatalogoStatus status;

//     @Column(name = "comentario_reservacion")
//     private String comentario_reservacion;

//     @Column(name = "activo")
//     private Integer activo;

//     @Column(name = "creado_por")
//     private Integer creado_por;

//     @Column(name = "creado_el")
//     private LocalDate creado_el;

//     @Column(name = "actualizado_por")
//     private Integer actualizado_por;

//     @Column(name = "actualizado_el")
//     private LocalDate actualizado_el;

//     public ReservacionEstatus() {}

//     public ReservacionEstatus(
//             Reservacion reservacion,
//             EventoCatalogoStatus status,
//             String comentarioReservacion,
//             Integer activo,
//             Integer creadoPor,
//             LocalDate creadoEl,
//             Integer actualizadoPor,
//             LocalDate actualizadoEl
//     ) {
//         this.reservacion = reservacion;
//         this.status = status;
//         this.comentario_reservacion = comentarioReservacion;
//         this.activo = activo;
//         this.creado_por = creadoPor;
//         this.creado_el = creadoEl;
//         this.actualizado_por = actualizadoPor;
//         this.actualizado_el = actualizadoEl;
//     }

//     public Long getIdReservacionStatus() { return id_reservacion_status; }
//     public void setIdReservacionStatus(Long idReservacionStatus) { this.id_reservacion_status = idReservacionStatus; }

//     public Reservacion getReservacion() { return reservacion; }
//     public void setReservacion(Reservacion reservacion) { this.reservacion = reservacion; }

//     public EventoCatalogoStatus getStatus() { return status; }
//     public void setStatus(EventoCatalogoStatus status) { this.status = status; }

//     public String getComentarioReservacion() { return comentario_reservacion; }
//     public void setComentarioReservacion(String comentarioReservacion) { this.comentario_reservacion = comentarioReservacion; }

//     public Integer getActivo() { return activo; }
//     public void setActivo(Integer activo) { this.activo = activo; }

//     public Integer getCreadoPor() { return creado_por; }
//     public void setCreadoPor(Integer creadoPor) { this.creado_por = creadoPor; }

//     public LocalDate getCreadoEl() { return creado_el; }
//     public void setCreadoEl(LocalDate creadoEl) { this.creado_el = creadoEl; }

//     public Integer getActualizadoPor() { return actualizado_por; }
//     public void setActualizadoPor(Integer actualizadoPor) { this.actualizado_por = actualizadoPor; }

//     public LocalDate getActualizadoEl() { return actualizado_el; }
//     public void setActualizadoEl(LocalDate actualizadoEl) { this.actualizado_el = actualizadoEl; }
// }
