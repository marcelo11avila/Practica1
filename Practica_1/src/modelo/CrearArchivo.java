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
public class CrearArchivo {
    private String carpetaDestino;
    private String nombreArchivo;
    private String tipoArchivo;

    public CrearArchivo(String carpetaDestino, String nombreArchivo, String tipoArchivo) {
        this.carpetaDestino = carpetaDestino;
        this.nombreArchivo = nombreArchivo;
        this.tipoArchivo = tipoArchivo;
    }

    public String getCarpetaDestino() {
        return carpetaDestino;
    }

    public void setCarpetaDestino(String carpetaDestino) {
        this.carpetaDestino = carpetaDestino;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }
    
    
}
