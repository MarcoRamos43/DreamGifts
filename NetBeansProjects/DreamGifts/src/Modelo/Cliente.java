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
    
    private int CLI_ID_CLIENTE;
    private String CLI_NOMBRE;
    private String CLI_APELLIDO;
    private String CLI_DIRECCION;
    private int CLI_TELEFONO;
    private String CLI_CORREO;

    public Cliente() {
    }

    public Cliente(int CLI_ID_CLIENTE, String CLI_NOMBRE, String CLI_APELLIDO, String CLI_DIRECCION, int CLI_TELEFONO, String CLI_CORREO) {
        this.CLI_ID_CLIENTE = CLI_ID_CLIENTE;
        this.CLI_NOMBRE = CLI_NOMBRE;
        this.CLI_APELLIDO = CLI_APELLIDO;
        this.CLI_DIRECCION = CLI_DIRECCION;
        this.CLI_TELEFONO = CLI_TELEFONO;
        this.CLI_CORREO = CLI_CORREO;
    }

    public int getCLI_ID_CLIENTE() {
        return CLI_ID_CLIENTE;
    }

    public void setCLI_ID_CLIENTE(int CLI_ID_CLIENTE) {
        this.CLI_ID_CLIENTE = CLI_ID_CLIENTE;
    }

    public String getCLI_NOMBRE() {
        return CLI_NOMBRE;
    }

    public void setCLI_NOMBRE(String CLI_NOMBRE) {
        this.CLI_NOMBRE = CLI_NOMBRE;
    }

    public String getCLI_APELLIDO() {
        return CLI_APELLIDO;
    }

    public void setCLI_APELLIDO(String CLI_APELLIDO) {
        this.CLI_APELLIDO = CLI_APELLIDO;
    }

    public String getCLI_DIRECCION() {
        return CLI_DIRECCION;
    }

    public void setCLI_DIRECCION(String CLI_DIRECCION) {
        this.CLI_DIRECCION = CLI_DIRECCION;
    }

    public int getCLI_TELEFONO() {
        return CLI_TELEFONO;
    }

    public void setCLI_TELEFONO(int CLI_TELEFONO) {
        this.CLI_TELEFONO = CLI_TELEFONO;
    }

    public String getCLI_CORREO() {
        return CLI_CORREO;
    }

    public void setCLI_CORREO(String CLI_CORREO) {
        this.CLI_CORREO = CLI_CORREO;
    }
    
    
    
}
