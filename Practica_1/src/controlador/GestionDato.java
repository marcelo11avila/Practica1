/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Archivo;
import modelo.Carpeta;

/**
 *
 * @author Marcelo11
 */
public class GestionDato {
    private List<Carpeta> crearCarpetaList;
    private List<Archivo> crearArchivoList;
    

    public GestionDato(List<Carpeta> crearCarpetaList, List<Archivo> crearArchivoList) {
        this.crearCarpetaList = crearCarpetaList;
        this.crearArchivoList = crearArchivoList;
    }

    public List<Carpeta> getCrearCarpetaList() {
        return crearCarpetaList;
    }

    public void setCrearCarpetaList(List<Carpeta> crearCarpetaList) {
        this.crearCarpetaList = crearCarpetaList;
    }

    public List<Archivo> getCrearArchivoList() {
        return crearArchivoList;
    }

    public void setCrearArchivoList(List<Archivo> crearArchivoList) {
        this.crearArchivoList = crearArchivoList;
    }
    
    public boolean addcrearCarpeta(Carpeta cC){
        return this.crearCarpetaList.add(cC);
    }
    
    public boolean addcrearArchivo(Archivo cA){
        return this.crearArchivoList.add(cA);
    }
    
    
    public String modificar(String cadena){
        int codigo =0;
        for(int i=cadena.length()-1;i>0;i--){
            if(cadena.charAt(i)==92){
                codigo=i;
                break;
            }
        }
        System.out.println(codigo);
        String nuevoDirectorio=cadena.substring(0, codigo);
         System.out.println(nuevoDirectorio);
       return  nuevoDirectorio;
    }
}
