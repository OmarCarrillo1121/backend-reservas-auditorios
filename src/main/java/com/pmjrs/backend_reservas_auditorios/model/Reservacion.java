// package com.pmjrs.backend_reservas_auditorios.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;
// import java.time.LocalTime;
// import java.util.ArrayList;

// @Entity
// @Table(name = "reservacion")
// public class Reservacion {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_reservacion")
//     private Long idReservacion;

//     @ManyToOne
//     @JoinColumn(name = "id_recinto", nullable = true)
//     private Recinto recinto;

//     @ManyToOne
//     @JoinColumn(name = "id_solicitante", nullable = true)
//     private Usuario solicitante;

//     @ManyToOne
//     @JoinColumn(name = "id_tipo_evento", nullable = true)
//     private EventoCatalogoTipoEvento tipoEvento;

//     @ManyToOne
//     @JoinColumn(name = "id_origen_evento", nullable = true)
//     private EventoCatalogoOrigen origenEvento;

//     @Column(name = "nombre_evento", nullable = true)
//     private String nombreEvento;

//     @Column(name = "descripcion_evento", nullable = true)
//     private String descripcionEvento;

//     @Column(name = "fecha_evento", nullable = true)
//     private LocalDate fechaEvento;

//     @Column(name = "hora_inicio", nullable = true)
//     private LocalTime horaInicio;

//     @Column(name = "hora_termino", nullable = true)
//     private LocalTime horaTermino;

//     // @OneToMany(mappedBy = "reservacion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//     // private List<ReservacionEstatus> estatusList = new ArrayList<>();

//     @Column(name = "activo")
//     private Integer activo;

//     @Column(name = "creado_por")
//     private Integer creadoPor;

//     @Column(name = "creado_el")
//     private LocalDate creadoEl;

//     @Column(name = "actualizado_por")
//     private Integer actualizadoPor;

//     @Column(name = "actualizado_el")
//     private LocalDate actualizadoEl;

//     public Reservacion() {}

//     public Reservacion(
//             Recinto recinto, 
//             Usuario solicitante, 
//             LocalDate fechaEvento,
//             LocalTime horaInicio, 
//             LocalTime horaTermino, 
//             Integer activo,
//             Integer creadoPor, 
//             LocalDate creadoEl, 
//             Integer actualizadoPor, 
//             LocalDate actualizadoEl
//     ) {
//         this.recinto = recinto;
//         this.solicitante = solicitante;
//         this.fechaEvento = fechaEvento;
//         this.horaInicio = horaInicio;
//         this.horaTermino = horaTermino;
//         this.activo = activo;
//         this.creadoPor = creadoPor;
//         this.creadoEl = creadoEl;
//         this.actualizadoPor = actualizadoPor;
//         this.actualizadoEl = actualizadoEl;
//     }

//     public Long getIdReservacion() {
//         return idReservacion;
//     }

//     public void setIdReservacion(Long idReservacion) {
//         this.idReservacion = idReservacion;
//     }

//     public Recinto getRecinto() {
//         return recinto;
//     }

//     public void setRecinto(Recinto recinto) {
//         this.recinto = recinto;
//     }

//     public Usuario getSolicitante() {
//         return solicitante;
//     }

//     public void setSolicitante(Usuario solicitante) {
//         this.solicitante = solicitante;
//     }

//     public EventoCatalogoTipoEvento getTipoEvento() {
//         return tipoEvento;
//     }

//     public void setTipoEvento(EventoCatalogoTipoEvento tipoEvento) {
//         this.tipoEvento = tipoEvento;
//     }

//     public EventoCatalogoOrigen getOrigenEvento() {
//         return origenEvento;
//     }

//     public void setOrigenEvento(EventoCatalogoOrigen origenEvento) {
//         this.origenEvento = origenEvento;
//     }

//     public String getNombreEvento() {
//         return nombreEvento;
//     }

//     public void setNombreEvento(String nombreEvento) {
//         this.nombreEvento = nombreEvento;
//     }

//     public String getDescripcionEvento() {
//         return descripcionEvento;
//     }

//     public void setDescripcionEvento(String descripcionEvento) {
//         this.descripcionEvento = descripcionEvento;
//     }

//     public LocalDate getFechaReservacion() {
//         return fechaEvento;
//     }

//     public void setFechaReservacion(LocalDate fechaEvento) {
//         this.fechaEvento = fechaEvento;
//     }

//     public LocalTime getHoraInicio() {
//         return horaInicio;
//     }

//     public void setHoraInicio(LocalTime horaInicio) {
//         this.horaInicio = horaInicio;
//     }

//     public LocalTime getHoraTermino() {
//         return horaTermino;
//     }

//     public void setHoraTermino(LocalTime horaTermino) {
//         this.horaTermino = horaTermino;
//     }

//     // public List<ReservacionEstatus> getEstatusList() {
//     //     return estatusList;
//     // }

//     // public void setEstatusList(List<ReservacionEstatus> estatusList) {
//     //     this.estatusList = estatusList;
//     // }

//     public Integer getActivo() {
//         return activo;
//     }

//     public void setActivo(Integer activo) {
//         this.activo = activo;
//     }

//     public Integer getCreadoPor() {
//         return creadoPor;
//     }

//     public void setCreadoPor(Integer creadoPor) {
//         this.creadoPor = creadoPor;
//     }

//     public LocalDate getCreadoEl() {
//         return creadoEl;
//     }

//     public void setCreadoEl(LocalDate creadoEl) {
//         this.creadoEl = creadoEl;
//     }

//     public Integer getActualizadoPor() {
//         return actualizadoPor;
//     }

//     public void setActualizadoPor(Integer actualizadoPor) {
//         this.actualizadoPor = actualizadoPor;
//     }

//     public LocalDate getActualizadoEl() {
//         return actualizadoEl;
//     }

//     public void setActualizadoEl(LocalDate actualizadoEl) {
//         this.actualizadoEl = actualizadoEl;
//     }
// }
