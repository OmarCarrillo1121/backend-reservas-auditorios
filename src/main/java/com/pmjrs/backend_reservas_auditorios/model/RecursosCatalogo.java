package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;

@Entity
@Table(name = "recursos_catalogo")
public class RecursosCatalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_recurso", nullable = false)
    private String nombre_recurso;

    @Column(name = "descripcion_recurso")
    private String descripcion_recurso;

    @Column(name = "activo")
    private Integer activo;

    public RecursosCatalogo() {}

    public RecursosCatalogo(String nombreRecurso, String descripcionRecurso, Integer activo) {
        this.nombre_recurso = nombreRecurso;
        this.descripcion_recurso = descripcionRecurso;
        this.activo = activo;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombreRecurso() { return nombre_recurso; }
    public void setNombreRecurso(String nombreRecurso) { this.nombre_recurso = nombreRecurso; }

    public String getDescripcionRecurso() { return descripcion_recurso; }
    public void setDescripcionRecurso(String descripcionRecurso) { this.descripcion_recurso = descripcionRecurso; }

    public Integer getActivo() { return activo; }
    public void setActivo(Integer activo) { this.activo = activo; }
}
