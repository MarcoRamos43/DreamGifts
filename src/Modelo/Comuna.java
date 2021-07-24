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
public class Comuna {
   private int idComuna;
   private String nombreComuna;
   private String estadoComuna;
   
   public Comuna() {
    }
   
    public Comuna(int idComuna, String nombreComuna, String estadoComuna) {
        this.idComuna = idComuna;
        this.nombreComuna = nombreComuna;
        this.estadoComuna = estadoComuna;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

        public String getEstadoComuna() {
        return estadoComuna;
    }

    public void setEstadoComuna(String estadoComuna) {
        this.estadoComuna = estadoComuna;
    }

}

