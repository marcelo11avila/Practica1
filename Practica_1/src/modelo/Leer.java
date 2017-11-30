/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;

public class Leer {

    private File directorio;
    private File[] lista;

    public Leer() {
        this.inicia();
        this.recorrer();
    }

    public void inicia() {
        this.directorio = new File("C:\\Users\\Estudiante\\Desktop\\a");
        this.lista = directorio.listFiles();
    }
    
    public void recorrer(){
        for(File a : this.lista){
            this.comparar(a);
        }
    }
    
    public void comparar(File a){
        if(a.isFile()){
            System.out.println(a.getPath());
        }else{
            File[] subListas = a.listFiles();
            for(File x :subListas)
            comparar(x);
        }
    }
}
