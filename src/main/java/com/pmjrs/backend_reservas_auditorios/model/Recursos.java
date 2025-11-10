// package com.pmjrs.backend_reservas_auditorios.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;

// @Entity
// @Table(name = "recursos")
// public class Recursos {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_recurso")
//     private Long id_recurso;

//     @ManyToOne
//     @JoinColumn(name = "id_recurso_catalogo", nullable = false)
//     private RecursosCatalogo recurso_catalogo;

//     @ManyToOne
//     @JoinColumn(name = "id_area", nullable = false)
//     private RecursosCatalogoArea area;

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

//     public Recursos() {}

//     public Recursos(RecursosCatalogo recurso_catalogo, RecursosCatalogoArea area, Integer activo,
//                     Integer creado_por, LocalDate creado_el, Integer actualizado_por, LocalDate actualizado_el) {
//         this.recurso_catalogo = recurso_catalogo;
//         this.area = area;
//         this.activo = activo;
//         this.creado_por = creado_por;
//         this.creado_el = creado_el;
//         this.actualizado_por = actualizado_por;
//         this.actualizado_el = actualizado_el;
//     }

//     public Long getId_recurso() { return id_recurso; }
//     public void setId_recurso(Long id_recurso) { this.id_recurso = id_recurso; }

//     public RecursosCatalogo getRecurso_catalogo() { return recurso_catalogo; }
//     public void setRecurso_catalogo(RecursosCatalogo recurso_catalogo) { this.recurso_catalogo = recurso_catalogo; }

//     public RecursosCatalogoArea getArea() { return area; }
//     public void setArea(RecursosCatalogoArea area) { this.area = area; }

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
