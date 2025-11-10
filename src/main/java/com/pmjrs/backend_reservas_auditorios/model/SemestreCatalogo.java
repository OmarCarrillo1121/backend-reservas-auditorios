// package com.pmjrs.backend_reservas_auditorios.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;

// @Entity
// @Table(name = "semestre")
// public class SemestreCatalogo {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_semestre")
//     private Long id_semestre;

//     @Column(name = "nombre_semestre", nullable = false)
//     private String nombre_semestre;

//     @Column(name = "anio_semestre", nullable = false)
//     private String anio_semestre;

//     @Column(name = "inicio_actividades", nullable = false)
//     private LocalDate inicio_actividades;

//     @Column(name = "fin_actividades", nullable = false)
//     private LocalDate fin_actividades;

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

//     public SemestreCatalogo() {}

//     public SemestreCatalogo(
//         String nombre_semestre,
//         String anio_semestre,
//         LocalDate inicio_actividades,
//         LocalDate fin_actividades,
//         Integer activo,
//         Integer creado_por,
//         LocalDate creado_el,
//         Integer actualizado_por,
//         LocalDate actualizado_el
//     ) {
//         this.nombre_semestre = nombre_semestre;
//         this.anio_semestre = anio_semestre;
//         this.inicio_actividades = inicio_actividades;
//         this.fin_actividades = fin_actividades;
//         this.activo = activo;
//         this.creado_por = creado_por;
//         this.creado_el = creado_el;
//         this.actualizado_por = actualizado_por;
//         this.actualizado_el = actualizado_el;
//     }

//     public Long getId_semestre() { return id_semestre; }
//     public void setId_semestre(Long id_semestre) { this.id_semestre = id_semestre; }

//     public String getNombre_semestre() { return nombre_semestre; }
//     public void setNombre_semestre(String nombre_semestre) { this.nombre_semestre = nombre_semestre; }

//     public String getAnio_semestre() { return anio_semestre; }
//     public void setAnio_semestre(String anio_semestre) { this.anio_semestre = anio_semestre; }

//     public LocalDate getInicio_actividades() { return inicio_actividades; }
//     public void setInicio_actividades(LocalDate inicio_actividades) { this.inicio_actividades = inicio_actividades; }

//     public LocalDate getFin_actividades() { return fin_actividades; }
//     public void setFin_actividades(LocalDate fin_actividades) { this.fin_actividades = fin_actividades; }

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
