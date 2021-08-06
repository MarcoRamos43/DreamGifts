/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Cliente {
    
    private int idCliente;
    private String nombreCliente;
    private String rutCliente;
    private String fechaNacimientoCliente;
    private String telefonoCliente;
    private String correoCliente;
    private int redSocialCliente;
    private String direccionCliente;
    private String estadoCliente;

     public Cliente() {
    }
    public Cliente(int idCliente, String nombreCliente, String rutCliente, String fechaNacimientoCliente, String telefonoCliente, String correoCliente, int redSocialCliente, String direccionCliente, String estadoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.rutCliente = rutCliente;
        this.fechaNacimientoCliente = fechaNacimientoCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
        this.redSocialCliente = redSocialCliente;
        this.direccionCliente = direccionCliente;
        this.estadoCliente = estadoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getFechaNacimientoCliente() {
        return fechaNacimientoCliente;
    }

    public void setFechaNacimientoCliente(String fechaNacimientoCliente) {
        this.fechaNacimientoCliente = fechaNacimientoCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public int getRedSocialCliente() {
        return redSocialCliente;
    }

    public void setRedSocialCliente(int redSocialCliente) {
        this.redSocialCliente = redSocialCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
    
    

    
    
}
