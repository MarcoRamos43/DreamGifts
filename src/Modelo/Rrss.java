/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Rrss {
    private int idRrss;
    private String nombreRrss;
    private String estadoRrss;


public Rrss(){

}

    public Rrss(int idRrss, String nombreRrss, String estadoRrss) {
        this.idRrss = idRrss;
        this.nombreRrss = nombreRrss;
        this.estadoRrss = estadoRrss;
    }
    
    public int getIdRrss() {
        return idRrss;
    }

    public void setIdRrss(int idRrss) {
        this.idRrss = idRrss;
    }

    public String getNombreRrss() {
        return nombreRrss;
    }

    public void setNombreRrss(String nombreRrss) {
        this.nombreRrss = nombreRrss;
    }

    public String getEstadoRrss() {
        return estadoRrss;
    }

    public void setEstadoRrss(String estadoRrss) {
        this.estadoRrss = estadoRrss;
    }
 
    public String toString(){
        return nombreRrss;
    }
}