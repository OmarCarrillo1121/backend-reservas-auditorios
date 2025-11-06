package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ponente_semblanza")
public class PonenteSemblanza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ponente_semblanza")
    private Long id_ponente_semblanza;

    @OneToOne
    @JoinColumn(name = "id_ponente", nullable = false)
    private Ponente ponente;

    @Column(name = "nombre_archivo", nullable = false)
    private String nombre_archivo;

    @Column(name = "ruta_archivo", nullable = false)
    private String ruta_archivo;

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

    public PonenteSemblanza() {}

    public PonenteSemblanza(Ponente ponente, String nombreArchivo, String rutaArchivo,
                            Integer activo, Integer creadoPor, LocalDate creadoEl,
                            Integer actualizadoPor, LocalDate actualizadoEl) {
        this.ponente = ponente;
        this.nombre_archivo = nombreArchivo;
        this.ruta_archivo = rutaArchivo;
        this.activo = activo;
        this.creado_por = creadoPor;
        this.creado_el = creadoEl;
        this.actualizado_por = actualizadoPor;
        this.actualizado_el = actualizadoEl;
    }

    public Long getIdPonenteSemblanza() { return id_ponente_semblanza; }
    public void setIdPonenteSemblanza(Long idPonenteSemblanza) { this.id_ponente_semblanza = idPonenteSemblanza; }

    public Ponente getPonente() { return ponente; }
    public void setPonente(Ponente ponente) { this.ponente = ponente; }

    public String getNombreArchivo() { return nombre_archivo; }
    public void setNombreArchivo(String nombreArchivo) { this.nombre_archivo = nombreArchivo; }

    public String getRutaArchivo() { return ruta_archivo; }
    public void setRutaArchivo(String rutaArchivo) { this.ruta_archivo = rutaArchivo; }

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
