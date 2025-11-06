package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "recinto_imagen")
public class RecintoImagen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recinto_imagen")
    private Long id_recinto_imagen;

    @ManyToOne
    @JoinColumn(name = "id_recinto", nullable = false)
    private Recinto recinto;

    @Column(name = "ruta_imagen", nullable = false)
    private String ruta_imagen;

    @Column(name = "nombre_archivo", nullable = false)
    private String nombre_archivo;

    @Column(name = "tamanio_archivo", nullable = false)
    private Long tamanio_archivo;

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

    public RecintoImagen() {}

    public RecintoImagen(
            Recinto recinto,
            String rutaImagen,
            String nombreArchivo,
            Long tamanioArchivo,
            Integer activo,
            Integer creadoPor,
            LocalDate creadoEl,
            Integer actualizadoPor,
            LocalDate actualizadoEl
    ) {
        this.recinto = recinto;
        this.ruta_imagen = rutaImagen;
        this.nombre_archivo = nombreArchivo;
        this.tamanio_archivo = tamanioArchivo;
        this.activo = activo;
        this.creado_por = creadoPor;
        this.creado_el = creadoEl;
        this.actualizado_por = actualizadoPor;
        this.actualizado_el = actualizadoEl;
    }

    public Long getIdRecintoImagen() { return id_recinto_imagen; }
    public void setIdRecintoImagen(Long id) { this.id_recinto_imagen = id; }

    public Recinto getRecinto() { return recinto; }
    public void setRecinto(Recinto recinto) { this.recinto = recinto; }

    public String getRutaImagen() { return ruta_imagen; }
    public void setRutaImagen(String rutaImagen) { this.ruta_imagen = rutaImagen; }

    public String getNombreArchivo() { return nombre_archivo; }
    public void setNombreArchivo(String nombreArchivo) { this.nombre_archivo = nombreArchivo; }

    public Long getTamanioArchivo() { return tamanio_archivo; }
    public void setTamanioArchivo(Long tamanioArchivo) { this.tamanio_archivo = tamanioArchivo; }

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
