// package com.pmjrs.backend_reservas_auditorios.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;
// import java.time.LocalTime;

// @Entity
// @Table(name = "reservacion_horas_disponibles")
// public class EventoCatalogoHorasDisponibles {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_reservacion_hora_disponible")
//     private Long id_reservacion_hora_disponible;

//     @Column(name = "hora", nullable = false)
//     private LocalTime hora;

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

//     public EventoCatalogoHorasDisponibles() {}

//     public EventoCatalogoHorasDisponibles(
//         LocalTime hora,
//         Integer activo,
//         Integer creado_por,
//         LocalDate creado_el,
//         Integer actualizado_por,
//         LocalDate actualizado_el
//     ) {
//         this.hora = hora;
//         this.activo = activo;
//         this.creado_por = creado_por;
//         this.creado_el = creado_el;
//         this.actualizado_por = actualizado_por;
//         this.actualizado_el = actualizado_el;
//     }

//     public Long getId_reservacion_hora_disponible() { return id_reservacion_hora_disponible; }
//     public void setId_reservacion_hora_disponible(Long id_reservacion_hora_disponible) { this.id_reservacion_hora_disponible = id_reservacion_hora_disponible; }

//     public LocalTime getHora() { return hora; }
//     public void setHora(LocalTime hora) { this.hora = hora; }

//     public Integer getActivo() { return activo; }
//     public void setActivo(Integer activo) { this.activo = activo; }

//     public Integer getCreado_por() { return creado_por; }
//     public void setCreado_por(Integer creado_por) { this.creado_por = creado_por; }

//     public LocalDate getCreado_el() { return creado_el; }
//     public void setCreado_el(LocalDate creado_el) { this.creado_el = creado_el; }

//     public Integer getActualizado_por() { return actualizado_por; }
//     public void setActualizado_por(Integer actualizado_por) { this.actualizado_por = actualizado_por; }

//     public LocalDate getActualizado_el() { return actualizado_el; }
//     public void setActualizado_el(LocalDate actualizado_el) { this.actualizado_el = actualizado_el; }
// }
