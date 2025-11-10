// package com.pmjrs.backend_reservas_auditorios.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;

// @Entity
// @Table(name = "semestre_tipo_evento")
// public class SemestreCatalogoTipoEvento {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_semestre_tipo_evento")
//     private Long id_semestre_tipo_evento;

//     @Column(name = "nombre_tipo_evento", nullable = false)
//     private String nombre_tipo_evento;

//     @Column(name = "color_evento", nullable = false)
//     private String color_evento;

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

//     public SemestreCatalogoTipoEvento() {}

//     public SemestreCatalogoTipoEvento(
//         String nombre_tipo_evento,
//         String color_evento,
//         Integer activo,
//         Integer creado_por,
//         LocalDate creado_el,
//         Integer actualizado_por,
//         LocalDate actualizado_el
//     ) {
//         this.nombre_tipo_evento = nombre_tipo_evento;
//         this.color_evento = color_evento;
//         this.activo = activo;
//         this.creado_por = creado_por;
//         this.creado_el = creado_el;
//         this.actualizado_por = actualizado_por;
//         this.actualizado_el = actualizado_el;
//     }

//     public Long getId_semestre_tipo_evento() { return id_semestre_tipo_evento; }
//     public void setId_semestre_tipo_evento(Long id_semestre_tipo_evento) { this.id_semestre_tipo_evento = id_semestre_tipo_evento; }

//     public String getNombre_tipo_evento() { return nombre_tipo_evento; }
//     public void setNombre_tipo_evento(String nombre_tipo_evento) { this.nombre_tipo_evento = nombre_tipo_evento; }

//     public String getColor_evento() { return color_evento; }
//     public void setColor_evento(String color_evento) { this.color_evento = color_evento; }

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
