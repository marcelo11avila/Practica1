/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import modelo.Archivo;
import vista.VentanaModifArchivo;

/**
 *
 * @author EstebanRM
 */
public class EventoVentanaModifArchivo implements ActionListener {
    private VentanaModifArchivo ventanaModifArchivo;

    public EventoVentanaModifArchivo(VentanaModifArchivo ventanaModifArchivo) {
        this.ventanaModifArchivo = ventanaModifArchivo;
    }

    public VentanaModifArchivo getVentanaModifArchivo() {
        return ventanaModifArchivo;
    }

    public void setVentanaModifArchivo(VentanaModifArchivo ventanaModifArchivo) {
        this.ventanaModifArchivo = ventanaModifArchivo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String cD = this.ventanaModifArchivo.getTxtList().get(0).getText();
        String nA = this.ventanaModifArchivo.getTxtList().get(1).getText();
        String tA = this.ventanaModifArchivo.getTxtList().get(2).getText();
         
         //File antiguoArchivo= new File(cD+"\\"+nA+"."+tA);
         //File nuevoArchivo = new File(cD+"\\"+nA+"."+tA);
         
        // antiguoArchivo.renameTo(nuevoArchivo);
        
        
        Archivo cA = new Archivo(cD, nA, tA);
            
        this.ventanaModifArchivo.getgD().addcrearArchivo(cA);    
        
        Object [][] dato2=this.ventanaModifArchivo.cargaDatosTabla(this.ventanaModifArchivo.getgD().getCrearArchivoList().size(),3);
        this.ventanaModifArchivo.setDatos(dato2);
        this.ventanaModifArchivo.getModeloTabla().setDataVector(this.ventanaModifArchivo.getDatos(),this.ventanaModifArchivo.getEncabezado());
    }
    
    
    
}
