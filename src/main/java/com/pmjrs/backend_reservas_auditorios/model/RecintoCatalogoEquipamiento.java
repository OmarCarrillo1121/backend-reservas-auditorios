// package com.pmjrs.backend_reservas_auditorios.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;

// @Entity
// @Table(name = "recinto_equipamiento_catalogo")
// public class RecintoCatalogoEquipamiento {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_recinto_equipamiento_catalogo")
//     private Long id_recinto_equipamiento_catalogo;

//     @Column(name = "nombre_equipamiento", nullable = false)
//     private String nombre_equipamiento;

//     @Column(name = "descripcion_equipamiento")
//     private String descripcion_equipamiento;

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

//     public RecintoCatalogoEquipamiento() {}

//     public RecintoCatalogoEquipamiento(
//             String nombreEquipamiento,
//             String descripcionEquipamiento,
//             Integer activo,
//             Integer creadoPor,
//             LocalDate creadoEl,
//             Integer actualizadoPor,
//             LocalDate actualizadoEl
//     ) {
//         this.nombre_equipamiento = nombreEquipamiento;
//         this.descripcion_equipamiento = descripcionEquipamiento;
//         this.activo = activo;
//         this.creado_por = creadoPor;
//         this.creado_el = creadoEl;
//         this.actualizado_por = actualizadoPor;
//         this.actualizado_el = actualizadoEl;
//     }

//     public Long getIdRecintoEquipamientoCatalogo() { return id_recinto_equipamiento_catalogo; }
//     public void setIdRecintoEquipamientoCatalogo(Long id) { this.id_recinto_equipamiento_catalogo = id; }

//     public String getNombreEquipamiento() { return nombre_equipamiento; }
//     public void setNombreEquipamiento(String nombre) { this.nombre_equipamiento = nombre; }

//     public String getDescripcionEquipamiento() { return descripcion_equipamiento; }
//     public void setDescripcionEquipamiento(String descripcion) { this.descripcion_equipamiento = descripcion; }

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
