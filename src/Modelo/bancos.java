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
public class bancos {
    
    private int idBancos;
    private String nombreBancos;
    private String estadoBancos;

    public bancos() {
    }

    public bancos(int idBancos, String nombreBancos, String estadoBancos) {
        this.idBancos = idBancos;
        this.nombreBancos = nombreBancos;
        this.estadoBancos = estadoBancos;
    }

    public int getIdBancos() {
        return idBancos;
    }

    public void setIdBancos(int idBancos) {
        this.idBancos = idBancos;
    }

    public String getNombreBancos() {
        return nombreBancos;
    }

    public void setNombreBancos(String nombreBancos) {
        this.nombreBancos = nombreBancos;
    }

    public String getEstadoBancos() {
        return estadoBancos;
    }

    public void setEstadoBancos(String estadoBancos) {
        this.estadoBancos = estadoBancos;
    }
    
    
    
}
