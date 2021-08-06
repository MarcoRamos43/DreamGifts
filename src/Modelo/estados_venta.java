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
public class estados_venta {
    
     private int idestados;
    private String nombreEstado;
    private String estadoEstado;

    public estados_venta() {
    }

    public estados_venta(int idestados, String nombreEstado, String estadoEstado) {
        this.idestados = idestados;
        this.nombreEstado = nombreEstado;
        this.estadoEstado = estadoEstado;
    }

    public int getIdestados() {
        return idestados;
    }

    public void setIdestados(int idestados) {
        this.idestados = idestados;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public String getEstadoEstado() {
        return estadoEstado;
    }

    public void setEstadoEstado(String estadoEstado) {
        this.estadoEstado = estadoEstado;
    }
    
    
    
}
