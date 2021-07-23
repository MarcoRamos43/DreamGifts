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
public class categoria_pack {
    
    private int ID_CATEGORIAPACK;
    private String CATPACK_DESCRIPCION;

    public categoria_pack() {
    }

    public categoria_pack(int ID_CATEGORIAPACK, String CATPACK_DESCRIPCION) {
        this.ID_CATEGORIAPACK = ID_CATEGORIAPACK;
        this.CATPACK_DESCRIPCION = CATPACK_DESCRIPCION;
    }

    public int getID_CATEGORIAPACK() {
        return ID_CATEGORIAPACK;
    }

    public void setID_CATEGORIAPACK(int ID_CATEGORIAPACK) {
        this.ID_CATEGORIAPACK = ID_CATEGORIAPACK;
    }

    public String getCATPACK_DESCRIPCION() {
        return CATPACK_DESCRIPCION;
    }

    public void setCATPACK_DESCRIPCION(String CATPACK_DESCRIPCION) {
        this.CATPACK_DESCRIPCION = CATPACK_DESCRIPCION;
    }
    
    
    
    
}

 


