// package com.pmjrs.backend_reservas_auditorios.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;

// @Entity
// @Table(name = "reservacion_tipo_evento")
// public class EventoCatalogoTipoEvento {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_reservacion_tipo_evento")
//     private Long id_reservacion_tipo_evento;

//     @Column(name = "nombre_tipo_evento", nullable = false)
//     private String nombre_tipo_evento;

//     @Column(name = "descripcion_tipo_evento")
//     private String descripcion_tipo_evento;

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

//     public EventoCatalogoTipoEvento() {}

//     public EventoCatalogoTipoEvento(String nombreTipoEvento, String descripcionTipoEvento, Integer activo, Integer creadoPor, LocalDate creadoEl, Integer actualizadoPor, LocalDate actualizadoEl) {
//         this.nombre_tipo_evento = nombreTipoEvento;
//         this.descripcion_tipo_evento = descripcionTipoEvento;
//         this.activo = activo;
//         this.creado_por = creadoPor;
//         this.creado_el = creadoEl;
//         this.actualizado_por = actualizadoPor;
//         this.actualizado_el = actualizadoEl;
//     }

//     public Long getIdReservacionTipoEvento() { return id_reservacion_tipo_evento; }
//     public void setIdReservacionTipoEvento(Long idReservacionTipoEvento) { this.id_reservacion_tipo_evento = idReservacionTipoEvento; }

//     public String getNombreTipoEvento() { return nombre_tipo_evento; }
//     public void setNombreTipoEvento(String nombreTipoEvento) { this.nombre_tipo_evento = nombreTipoEvento; }

//     public String getDescripcionTipoEvento() { return descripcion_tipo_evento; }
//     public void setDescripcionTipoEvento(String descripcionTipoEvento) { this.descripcion_tipo_evento = descripcionTipoEvento; }

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
