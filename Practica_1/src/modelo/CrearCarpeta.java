/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Estudiante
 */
public class CrearCarpeta {
    private String carpetaDestino;
    private String nombreCarpeta;

    public CrearCarpeta(String carpetaDestino, String nombreCarpeta) {
        this.carpetaDestino = carpetaDestino;
        this.nombreCarpeta = nombreCarpeta;
    }

    public String getCarpetaDestino() {
        return carpetaDestino;
    }

    public void setCarpetaDestino(String carpetaDestino) {
        this.carpetaDestino = carpetaDestino;
    }

    public String getNombreCarpeta() {
        return nombreCarpeta;
    }

    public void setNombreCarpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
    }
    
    
}
