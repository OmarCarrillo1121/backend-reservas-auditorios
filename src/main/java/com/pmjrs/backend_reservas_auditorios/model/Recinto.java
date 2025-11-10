// package com.pmjrs.backend_reservas_auditorios.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;

// @Entity
// @Table(name = "recinto")
// public class Recinto {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_recinto")
//     private Long idRecinto;

//     @Column(name = "nombre_recinto", nullable = false)
//     private String nombre_recinto;

//     @Column(name = "ubicacion_recinto")
//     private String ubicacion_recinto;

//     @Column(name = "edificio_recinto")
//     private String edificio_recinto;

//     @Column(name = "capacidad_recinto")
//     private Integer capacidad_recinto;

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

//     public Recinto() {}

//     public Recinto(String nombreRecinto, String ubicacionRecinto, String edificioRecinto, Integer capacidadRecinto,
//                    Integer activo, Integer creadoPor, LocalDate creadoEl, Integer actualizadoPor, LocalDate actualizadoEl) {
//         this.nombre_recinto = nombreRecinto;
//         this.ubicacion_recinto = ubicacionRecinto;
//         this.edificio_recinto = edificioRecinto;
//         this.capacidad_recinto = capacidadRecinto;
//         this.activo = activo;
//         this.creado_por = creadoPor;
//         this.creado_el = creadoEl;
//         this.actualizado_por = actualizadoPor;
//         this.actualizado_el = actualizadoEl;
//     }

//     public Long getIdRecinto() { return idRecinto; }
//     public void setIdRecinto(Long idRecinto) { this.idRecinto = idRecinto; }

//     public String getNombreRecinto() { return nombre_recinto; }
//     public void setNombreRecinto(String nombreRecinto) { this.nombre_recinto = nombreRecinto; }

//     public String getUbicacionRecinto() { return ubicacion_recinto; }
//     public void setUbicacionRecinto(String ubicacionRecinto) { this.ubicacion_recinto = ubicacionRecinto; }

//     public String getEdificioRecinto() { return edificio_recinto; }
//     public void setEdificioRecinto(String edificioRecinto) { this.edificio_recinto = edificioRecinto; }

//     public Integer getCapacidadRecinto() { return capacidad_recinto; }
//     public void setCapacidadRecinto(Integer capacidadRecinto) { this.capacidad_recinto = capacidadRecinto; }

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
