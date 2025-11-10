// package com.pmjrs.backend_reservas_auditorios.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;

// @Entity
// @Table(name = "recursos_reservacion")
// public class RecursosReservacion {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_recurso_reservacion")
//     private Long id_recurso_reservacion;

//     @ManyToOne
//     @JoinColumn(name = "id_recurso", nullable = false)
//     private Recursos recurso;

//     @ManyToOne
//     @JoinColumn(name = "id_reservacion", nullable = false)
//     private Reservacion reservacion;

//     @Column(name = "cantidad_asignada")
//     private Integer cantidad_asignada;

//     @Column(name = "activo")
//     private Integer activo;

//     @PrePersist
//     public void prePersist() {
//         if (activo == null) {
//             activo = 1;
//         }
//     }

//     @Column(name = "creado_por")
//     private Integer creado_por;

//     @Column(name = "creado_el")
//     private LocalDate creado_el;

//     @Column(name = "actualizado_por")
//     private Integer actualizado_por;

//     @Column(name = "actualizado_el")
//     private LocalDate actualizado_el;

//     public RecursosReservacion() {}

//     public RecursosReservacion(Recursos recurso, Reservacion reservacion, Integer cantidadAsignada, Integer activo,
//                                Integer creadoPor, LocalDate creadoEl, Integer actualizadoPor, LocalDate actualizadoEl) {
//         this.recurso = recurso;
//         this.reservacion = reservacion;
//         this.cantidad_asignada = cantidadAsignada;
//         this.activo = activo;
//         this.creado_por = creadoPor;
//         this.creado_el = creadoEl;
//         this.actualizado_por = actualizadoPor;
//         this.actualizado_el = actualizadoEl;
//     }

//     public Long getIdRecursoReservacion() { return id_recurso_reservacion; }
//     public void setIdRecursoReservacion(Long idRecursoReservacion) { this.id_recurso_reservacion = idRecursoReservacion; }

//     public Recursos getRecurso() { return recurso; }
//     public void setRecurso(Recursos recurso) { this.recurso = recurso; }

//     public Reservacion getReservacion() { return reservacion; }
//     public void setReservacion(Reservacion reservacion) { this.reservacion = reservacion; }

//     public Integer getCantidadAsignada() { return cantidad_asignada; }
//     public void setCantidadAsignada(Integer cantidadAsignada) { this.cantidad_asignada = cantidadAsignada; }

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
