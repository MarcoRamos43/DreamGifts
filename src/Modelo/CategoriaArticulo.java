
package Modelo;

public class CategoriaArticulo {
    private int idCatArt;
    private String nombreCatArt;
    private String estadoCatArt;

    public CategoriaArticulo(){
    }
    
    public CategoriaArticulo(int idCatArt, String nombreCatArt, String estadoCatArt) {
        this.idCatArt = idCatArt;
        this.nombreCatArt = nombreCatArt;
        this.estadoCatArt = estadoCatArt;
    }

    public int getIdCatArt() {
        return idCatArt;
    }

    public void setIdCatArt(int idCatArt) {
        this.idCatArt = idCatArt;
    }

    public String getNombreCatArt() {
        return nombreCatArt;
    }

    public void setNombreCatArt(String nombreCatArt) {
        this.nombreCatArt = nombreCatArt;
    }

    public String getEstadoCatArt() {
        return estadoCatArt;
    }

    public void setEstadoCatArt(String estadoCatArt) {
        this.estadoCatArt = estadoCatArt;
    }
    
     public String toString(){
        return nombreCatArt;
    }
}
