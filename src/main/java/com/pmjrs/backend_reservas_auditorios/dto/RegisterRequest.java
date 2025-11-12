package com.pmjrs.backend_reservas_auditorios.dto;

public class RegisterRequest {
    private String nombreUsuario;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String correo;
    private String contrasena;
    private String telefonoFijo;
    private String telefonoContacto;
    private Long idRolUsuario;

    // Getters y setters
    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getApellidoPaterno() { return apellidoPaterno; }
    public void setApellidoPaterno(String apellidoPaterno) { this.apellidoPaterno = apellidoPaterno; }

    public String getApellidoMaterno() { return apellidoMaterno; }
    public void setApellidoMaterno(String apellidoMaterno) { this.apellidoMaterno = apellidoMaterno; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getTelefonoFijo() { return telefonoFijo; }
    public void setTelefonoFijo(String telefonoFijo) { this.telefonoFijo = telefonoFijo; }

    public String getTelefonoContacto() { return telefonoContacto; }
    public void setTelefonoContacto(String telefonoContacto) { this.telefonoContacto = telefonoContacto; }

    public Long getIdRolUsuario() { return idRolUsuario; }
    public void setIdRolUsuario(Long idRolUsuario) { this.idRolUsuario = idRolUsuario; }
}
