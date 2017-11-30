/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import modelo.CrearArchivo;
import modelo.CrearCarpeta;

/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<CrearCarpeta> cC = new ArrayList<CrearCarpeta>();
        List<CrearArchivo> cA = new ArrayList<CrearArchivo>();
        
        GestionDato gD = new GestionDato(cC, cA);
        VentanaInicial vI = new VentanaInicial(gD);
        vI.setVisible(true);
    }
    
}
