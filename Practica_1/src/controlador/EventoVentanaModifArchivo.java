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
import javax.swing.JOptionPane;
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
        String nD = this.ventanaModifArchivo.getTxtList().get(2).getText();
         
        
         for(int i=cD.length()-1;i>0;i--){
             if((String.valueOf(cD.charAt(i))).equals("/")){
                 nD=cD.substring(0,i+1);
                 break;
             }            
         }
        nD=nD+nA;
        File antiguo= new File(cD);
        File nuevo = new File(nD);
        if(antiguo.renameTo(nuevo)){
            JOptionPane.showMessageDialog(null,"Archivo Actualizar","Exito",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"El Archivo no se pudo Actualizar", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        Archivo cA = new Archivo(cD, nA, nD);
            
        this.ventanaModifArchivo.getgD().addcrearArchivo(cA);    
        
        Object [][] dato2=this.ventanaModifArchivo.cargaDatosTabla(this.ventanaModifArchivo.getgD().getCrearArchivoList().size(),3);
        this.ventanaModifArchivo.setDatos(dato2);
        this.ventanaModifArchivo.getModeloTabla().setDataVector(this.ventanaModifArchivo.getDatos(),this.ventanaModifArchivo.getEncabezado());
    }
}
