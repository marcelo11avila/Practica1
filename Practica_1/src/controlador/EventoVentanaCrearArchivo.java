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
import vista.VentanaCrearArchivo;

/**
 *
 * @author Marcelo11
 */
public class EventoVentanaCrearArchivo implements ActionListener{
    private VentanaCrearArchivo ventanaCrearArchivo;

    public EventoVentanaCrearArchivo(VentanaCrearArchivo ventanaCrearArchivo) {
        this.ventanaCrearArchivo = ventanaCrearArchivo;
    }

    public VentanaCrearArchivo getVentanaCrearArchivo() {
        return ventanaCrearArchivo;
    }

    public void setVentanaCrearArchivo(VentanaCrearArchivo ventanaCrearArchivo) {
        this.ventanaCrearArchivo = ventanaCrearArchivo;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String cD = this.ventanaCrearArchivo.getTxtList().get(0).getText();
        String nA = this.ventanaCrearArchivo.getTxtList().get(1).getText();
        String tA = this.ventanaCrearArchivo.getTxtList().get(2).getText();
        
        File nuevoArchivo= new File(cD+"\\"+nA+"."+tA);
        if(!nuevoArchivo.exists()){
        try{
            nuevoArchivo.createNewFile();
        }
        catch(IOException ex){
            System.out.println("Error al crear arhivo"+ex.getMessage());
        }
        }
        Archivo cA = new Archivo(cD, nA, tA);
            
        this.ventanaCrearArchivo.getgD().addcrearArchivo(cA);    
        
        Object [][] dato2=this.ventanaCrearArchivo.cargaDatosTabla(this.ventanaCrearArchivo.getgD().getCrearArchivoList().size(),3);
        this.ventanaCrearArchivo.setDatos(dato2);
        this.ventanaCrearArchivo.getModeloTabla().setDataVector(this.ventanaCrearArchivo.getDatos(),this.ventanaCrearArchivo.getEncabezado());
    }
    
}
