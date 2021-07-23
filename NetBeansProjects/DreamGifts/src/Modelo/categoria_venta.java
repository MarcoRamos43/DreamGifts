/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class categoria_venta {
    private int ID_CATEGORIAVENTA;
    private String CATVENTA_DESCRIPCION;
    
    public categoria_venta() {
    
    }

    public categoria_venta(int ID_CATEGORIAVENTA, String CATVENTA_DESCRIPCION) {
        this.ID_CATEGORIAVENTA = ID_CATEGORIAVENTA;
        this.CATVENTA_DESCRIPCION = CATVENTA_DESCRIPCION;
    }

    public int getID_CATEGORIAVENTA() {
        return ID_CATEGORIAVENTA;
    }

    public void setID_CATEGORIAVENTA(int ID_CATEGORIAVENTA) {
        this.ID_CATEGORIAVENTA = ID_CATEGORIAVENTA;
    }

    public String getCATVENTA_DESCRIPCION() {
        return CATVENTA_DESCRIPCION;
    }

    public void setCATVENTA_DESCRIPCION(String CATVENTA_DESCRIPCION) {
        this.CATVENTA_DESCRIPCION = CATVENTA_DESCRIPCION;
    }
    
    
}
