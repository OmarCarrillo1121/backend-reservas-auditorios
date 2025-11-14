package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "correo")
    private String correo;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "rol_usuario")
    private String rolUsuario;

    @Column(name = "facultad_usuario")
    private String facultadUsuario;

    @Column(name = "area_usuario")
    private String areaUsuario;

    @Column(name = "puesto_usuario")
    private String puestoUsuario;

    @Column(name = "telefono_fijo")
    private String telefonoFijo;

    @Column(name = "telefono_contacto")
    private String telefonoContacto;

    @Column(name = "foto_perfil")
    private String fotoPerfil;

    @Column(name = "activo")
    private Integer activo;

    @Column(name = "creado_por")
    private Integer creadoPor;

    @Column(name = "creado_el")
    private LocalDate creadoEl;

    @Column(name = "ultima_actualizacion_por")
    private Integer ultimaActualizacionPor;

    @Column(name = "ultima_actualizacion_el")
    private LocalDate ultimaActualizacionEl;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(String rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public String getFacultadUsuario() {
        return facultadUsuario;
    }

    public void setFacultadUsuario(String facultadUsuario) {
        this.facultadUsuario = facultadUsuario;
    }

    public String getAreaUsuario() {
        return areaUsuario;
    }

    public void setAreaUsuario(String areaUsuario) {
        this.areaUsuario = areaUsuario;
    }

    public String getPuestoUsuario() {
        return puestoUsuario;
    }

    public void setPuestoUsuario(String puestoUsuario) {
        this.puestoUsuario = puestoUsuario;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public Integer getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(Integer creadoPor) {
        this.creadoPor = creadoPor;
    }

    public LocalDate getCreadoEl() {
        return creadoEl;
    }

    public void setCreadoEl(LocalDate creadoEl) {
        this.creadoEl = creadoEl;
    }

    public Integer getUltimaActualizacionPor() {
        return ultimaActualizacionPor;
    }

    public void setUltimaActualizacionPor(Integer ultimaActualizacionPor) {
        this.ultimaActualizacionPor = ultimaActualizacionPor;
    }

    public LocalDate getUltimaActualizacionEl() {
        return ultimaActualizacionEl;
    }

    public void setUltimaActualizacionEl(LocalDate ultimaActualizacionEl) {
        this.ultimaActualizacionEl = ultimaActualizacionEl;
    }
}