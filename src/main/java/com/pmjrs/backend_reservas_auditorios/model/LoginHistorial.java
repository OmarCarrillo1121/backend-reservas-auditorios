package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "login_historial")
public class LoginHistorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_login_historial")
    private Long id_login_historial;

    @Column(name = "id_usuario", nullable = false)
    private Long id_usuario;

    @Column(name = "creado_por")
    private Integer creado_por;

    @Column(name = "creado_el")
    private LocalDateTime creado_el;

    @Column(name = "actualizado_por")
    private Integer actualizado_por;

    @Column(name = "actualizado_el")
    private LocalDateTime actualizado_el;

    public LoginHistorial() {}

    public LoginHistorial(Long id_usuario, Integer creado_por, LocalDateTime creado_el, Integer actualizado_por, LocalDateTime actualizado_el) {
        this.id_usuario = id_usuario;
        this.creado_por = creado_por;
        this.creado_el = creado_el;
        this.actualizado_por = actualizado_por;
        this.actualizado_el = actualizado_el;
    }

    public Long getIdLoginHistorial() { return id_login_historial; }
    public void setIdLoginHistorial(Long id_login_historial) { this.id_login_historial = id_login_historial; }

    public Long getIdUsuario() { return id_usuario; }
    public void setIdUsuario(Long id_usuario) { this.id_usuario = id_usuario; }

    public Integer getCreadoPor() { return creado_por; }
    public void setCreadoPor(Integer creado_por) { this.creado_por = creado_por; }

    public LocalDateTime getCreadoEl() { return creado_el; }
    public void setCreadoEl(LocalDateTime creado_el) { this.creado_el = creado_el; }

    public Integer getActualizadoPor() { return actualizado_por; }
    public void setActualizadoPor(Integer actualizado_por) { this.actualizado_por = actualizado_por; }

    public LocalDateTime getActualizadoEl() { return actualizado_el; }
    public void setActualizadoEl(LocalDateTime actualizado_el) { this.actualizado_el = actualizado_el; }
}
