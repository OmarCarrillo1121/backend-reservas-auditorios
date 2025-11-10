// package com.pmjrs.backend_reservas_auditorios.model;

// import jakarta.persistence.*;
// import java.time.LocalDate;

// @Entity
// @Table(name = "ponente")
// public class EventoPonente {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "id_ponente")
//     private Long id_ponente;

//     @Column(name = "nombre_ponente", nullable = false)
//     private String nombre_ponente;

//     @Column(name = "grado_ponente")
//     private String grado_ponente;

//     @ManyToOne
//     @JoinColumn(name = "tipo_ponente", nullable = false)
//     private EventoPonenteCatalogoTipo tipo_ponente;

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

//     public EventoPonente() {}

//     public EventoPonente(String nombrePonente, String gradoPonente, String semblanzaPonente, EventoPonenteCatalogoTipo tipoPonente,
//                    Integer activo, Integer creadoPor, LocalDate creadoEl, Integer actualizadoPor, LocalDate actualizadoEl) {
//         this.nombre_ponente = nombrePonente;
//         this.grado_ponente = gradoPonente;
//         this.tipo_ponente = tipoPonente;
//         this.activo = activo;
//         this.creado_por = creadoPor;
//         this.creado_el = creadoEl;
//         this.actualizado_por = actualizadoPor;
//         this.actualizado_el = actualizadoEl;
//     }

//     public Long getIdPonente() { return id_ponente; }
//     public void setIdPonente(Long idPonente) { this.id_ponente = idPonente; }

//     public String getNombrePonente() { return nombre_ponente; }
//     public void setNombrePonente(String nombrePonente) { this.nombre_ponente = nombrePonente; }

//     public String getGradoPonente() { return grado_ponente; }
//     public void setGradoPonente(String gradoPonente) { this.grado_ponente = gradoPonente; }

//     public EventoPonenteCatalogoTipo getTipoPonente() { return tipo_ponente; }
//     public void setTipoPonente(EventoPonenteCatalogoTipo tipoPonente) { this.tipo_ponente = tipoPonente; }

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
