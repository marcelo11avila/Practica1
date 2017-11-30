/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.CrearArchivo;
import modelo.CrearCarpeta;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    private List<CrearCarpeta> crearCarpetaList;
    private List<CrearArchivo> crearArchivoList;

    public GestionDato(List<CrearCarpeta> crearCarpetaList, List<CrearArchivo> crearArchivoList) {
        this.crearCarpetaList = crearCarpetaList;
        this.crearArchivoList = crearArchivoList;
    }

    public List<CrearCarpeta> getCrearCarpetaList() {
        return crearCarpetaList;
    }

    public void setCrearCarpetaList(List<CrearCarpeta> crearCarpetaList) {
        this.crearCarpetaList = crearCarpetaList;
    }

    public List<CrearArchivo> getCrearArchivoList() {
        return crearArchivoList;
    }

    public void setCrearArchivoList(List<CrearArchivo> crearArchivoList) {
        this.crearArchivoList = crearArchivoList;
    }
    
    public boolean addcrearCarpeta(CrearCarpeta cC){
        return this.crearCarpetaList.add(cC);
    }
    
    public boolean addcrearArchivo(CrearArchivo cA){
        return this.crearArchivoList.add(cA);
    }
}
