package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuario_rol")
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario_rol")
    private Long id_usuario_rol;

    @Column(name = "nombre_rol", nullable = false)
    private String nombre_rol;

    @Column(name = "activo")
    private Integer activo;

    @PrePersist
    public void prePersist() {
        if (activo == null) {
            activo = 1;
        }
    }

    @Column(name = "creado_por")
    private Integer creado_por;

    @Column(name = "creado_el")
    private LocalDate creado_el;

    @Column(name = "actualizado_por")
    private Integer actualizado_por;

    @Column(name = "actualizado_el")
    private LocalDate actualizado_el;

    public UsuarioRol() {}

    public UsuarioRol(String nombreRol, Integer activo, Integer creadoPor, LocalDate creadoEl,
                       Integer actualizadoPor, LocalDate actualizadoEl) {
        this.nombre_rol = nombreRol;
        this.activo = activo;
        this.creado_por = creadoPor;
        this.creado_el = creadoEl;
        this.actualizado_por = actualizadoPor;
        this.actualizado_el = actualizadoEl;
    }

    public Long getIdUsuarioRol() { return id_usuario_rol; }
    public void setIdUsuarioRol(Long idUsuarioRol) { this.id_usuario_rol = idUsuarioRol; }

    public String getNombreRol() { return nombre_rol; }
    public void setNombreRol(String nombreRol) { this.nombre_rol = nombreRol; }

    public Integer getActivo() { return activo; }
    public void setActivo(Integer activo) { this.activo = activo; }

    public Integer getCreadoPor() { return creado_por; }
    public void setCreadoPor(Integer creadoPor) { this.creado_por = creadoPor; }

    public LocalDate getCreadoEl() { return creado_el; }
    public void setCreadoEl(LocalDate creadoEl) { this.creado_el = creadoEl; }

    public Integer getActualizadoPor() { return actualizado_por; }
    public void setActualizadoPor(Integer actualizadoPor) { this.actualizado_por = actualizadoPor; }

    public LocalDate getActualizadoEl() { return actualizado_el; }
    public void setActualizadoEl(LocalDate actualizadoEl) { this.actualizado_el = actualizadoEl; }
}
