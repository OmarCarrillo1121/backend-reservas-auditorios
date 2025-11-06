package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "semestre_eventos")
public class SemestreEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_semestre_eventos")
    private Long id_semestre_eventos;

    @Column(name = "id_semestre", nullable = false)
    private Integer id_semestre;

    @Column(name = "id_evento", nullable = false)
    private Integer id_evento;

    @Column(name = "dia_evento", nullable = false)
    private LocalDate dia_evento;

    @Column(name = "activo")
    private Integer activo;

    @Column(name = "creado_por")
    private Integer creado_por;

    @Column(name = "creado_el")
    private LocalDate creado_el;

    @Column(name = "actualizado_por")
    private Integer actualizado_por;

    @Column(name = "actualizado_el")
    private LocalDate actualizado_el;

    public SemestreEvento() {}

    public SemestreEvento(
        Integer id_semestre,
        Integer id_evento,
        LocalDate dia_evento,
        Integer activo,
        Integer creado_por,
        LocalDate creado_el,
        Integer actualizado_por,
        LocalDate actualizado_el
    ) {
        this.id_semestre = id_semestre;
        this.id_evento = id_evento;
        this.dia_evento = dia_evento;
        this.activo = activo;
        this.creado_por = creado_por;
        this.creado_el = creado_el;
        this.actualizado_por = actualizado_por;
        this.actualizado_el = actualizado_el;
    }

    public Long getId_semestre_eventos() { return id_semestre_eventos; }
    public void setId_semestre_eventos(Long id_semestre_eventos) { this.id_semestre_eventos = id_semestre_eventos; }

    public Integer getId_semestre() { return id_semestre; }
    public void setId_semestre(Integer id_semestre) { this.id_semestre = id_semestre; }

    public Integer getId_evento() { return id_evento; }
    public void setId_evento(Integer id_evento) { this.id_evento = id_evento; }

    public LocalDate getDia_evento() { return dia_evento; }
    public void setDia_evento(LocalDate dia_evento) { this.dia_evento = dia_evento; }

    public Integer getActivo() { return activo; }
    public void setActivo(Integer activo) { this.activo = activo; }

    public Integer getCreado_por() { return creado_por; }
    public void setCreado_por(Integer creado_por) { this.creado_por = creado_por; }

    public LocalDate getCreado_el() { return creado_el; }
    public void setCreado_el(LocalDate creado_el) { this.creado_el = creado_el; }

    public Integer getActualizado_por() { return actualizado_por; }
    public void setActualizado_por(Integer actualizado_por) { this.actualizado_por = actualizado_por; }

    public LocalDate getActualizado_el() { return actualizado_el; }
    public void setActualizado_el(LocalDate actualizado_el) { this.actualizado_el = actualizado_el; }
}
