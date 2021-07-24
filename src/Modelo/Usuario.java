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
public class Usuario {
   private int idUsuario;
   private String nombreUsuario;
   private String passUsuario;
   private String validarPassUsuario;
   private String correoUsuario;
   private String estadoUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String validarPassUsuario, String passUsuario, String correoUsuario, String estadoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.passUsuario = passUsuario;
        this.validarPassUsuario = validarPassUsuario;
        this.correoUsuario = correoUsuario;
        this.estadoUsuario = estadoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }
    
    public String getValidarPassUsuario() {
        return validarPassUsuario;
    }

    public void setValidarPassUsuario(String validarPassUsuario) {
        this.validarPassUsuario = validarPassUsuario;
    }
    
    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
  

}
