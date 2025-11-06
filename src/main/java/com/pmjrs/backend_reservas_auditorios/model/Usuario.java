package com.pmjrs.backend_reservas_auditorios.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;

    @Column(name = "id_tipo_usuario")
    private Integer id_tipo_usuario;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido_paterno")
    private String apellido_paterno;

    @Column(name = "apellido_materno")
    private String apellido_materno;

    @Column(name = "correo", unique = true, nullable = false)
    private String correo;

    @Column(name = "contrasena", nullable = false)
    private String contrasena;

    @Column(name = "telefono_fijo")
    private String telefono_fijo;

    @Column(name = "telefono_contacto")
    private String telefono_contacto;

    @Column(name = "imagen_usuario")
    private String imagen_usuario;

    @Column(name = "facultad_usuario")
    private String facultad_usuario;

    @Column(name = "area_usuario")
    private String area_usuario;

    @Column(name = "puesto_usuario")
    private String puesto_usuario;

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

    // Constructor vacío requerido por JPA
    public Usuario() {}

    // Constructor útil para crear un nuevo usuario
    public Usuario(
            String nombre,
            String apellidoPaterno,
            String apellidoMaterno,
            String correo,
            String contrasena,
            Integer idTipoUsuario,
            Integer activo,
            Integer creadoPor,
            LocalDate creadoEl
    ) {
        this.nombre = nombre;
        this.apellido_paterno = apellidoPaterno;
        this.apellido_materno = apellidoMaterno;
        this.correo = correo;
        this.contrasena = contrasena;
        this.id_tipo_usuario = idTipoUsuario;
        this.activo = activo;
        this.creado_por = creadoPor;
        this.creado_el = creadoEl;
    }

    // ==========================
    // Getters y Setters
    // ==========================

    public Long getIdUsuario() { return id_usuario; }
    public void setIdUsuario(Long idUsuario) { this.id_usuario = idUsuario; }

    public Integer getIdTipoUsuario() { return id_tipo_usuario; }
    public void setIdTipoUsuario(Integer idTipoUsuario) { this.id_tipo_usuario = idTipoUsuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidoPaterno() { return apellido_paterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellido_paterno = apellidoPaterno; }

    public String getApellidoMaterno() { return apellido_materno; }
    public void setApellidoMaterno(String apellidoMaterno) { this.apellido_materno = apellidoMaterno; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getTelefonoFijo() { return telefono_fijo; }
    public void setTelefonoFijo(String telefonoFijo) { this.telefono_fijo = telefonoFijo; }

    public String getTelefonoContacto() { return telefono_contacto; }
    public void setTelefonoContacto(String telefonoContacto) { this.telefono_contacto = telefonoContacto; }

    public String getImagenUsuario() { return imagen_usuario; }
    public void setImagenUsuario(String imagenUsuario) { this.imagen_usuario = imagenUsuario; }

    public String getFacultadUsuario() { return facultad_usuario; }
    public void setFacultadUsuario(String facultadUsuario) { this.facultad_usuario = facultadUsuario; }

    public String getAreaUsuario() { return area_usuario; }
    public void setAreaUsuario(String areaUsuario) { this.area_usuario = areaUsuario; }

    public String getPuestoUsuario() { return puesto_usuario; }
    public void setPuestoUsuario(String puestoUsuario) { this.puesto_usuario = puestoUsuario; }

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
