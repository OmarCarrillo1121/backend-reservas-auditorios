package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "recinto_equipamiento")
public class RecintoEquipamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recinto_equipamiento")
    private Long id_recinto_equipamiento;

    @ManyToOne
    @JoinColumn(name = "id_recinto", nullable = false)
    private Recinto recinto;

    @ManyToOne
    @JoinColumn(name = "id_equipamiento", nullable = false)
    private RecintoEquipamientoCatalogo equipamiento;

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

    public RecintoEquipamiento() {}

    public RecintoEquipamiento(
            Recinto recinto,
            RecintoEquipamientoCatalogo equipamiento,
            Integer activo,
            Integer creadoPor,
            LocalDate creadoEl,
            Integer actualizadoPor,
            LocalDate actualizadoEl
    ) {
        this.recinto = recinto;
        this.equipamiento = equipamiento;
        this.activo = activo;
        this.creado_por = creadoPor;
        this.creado_el = creadoEl;
        this.actualizado_por = actualizadoPor;
        this.actualizado_el = actualizadoEl;
    }

    public Long getIdRecintoEquipamiento() { return id_recinto_equipamiento; }
    public void setIdRecintoEquipamiento(Long id) { this.id_recinto_equipamiento = id; }

    public Recinto getRecinto() { return recinto; }
    public void setRecinto(Recinto recinto) { this.recinto = recinto; }

    public RecintoEquipamientoCatalogo getEquipamiento() { return equipamiento; }
    public void setEquipamiento(RecintoEquipamientoCatalogo equipamiento) { this.equipamiento = equipamiento; }

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
