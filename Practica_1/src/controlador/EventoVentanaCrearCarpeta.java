/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.CrearCarpeta;
import vista.VentanaCrearCarpeta;

/**
 *
 * @author Estudiante
 */
public class EventoVentanaCrearCarpeta implements ActionListener{
    private VentanaCrearCarpeta ventanaCrearCarpeta;

    public EventoVentanaCrearCarpeta(VentanaCrearCarpeta ventanaCrearCarpeta) {
        this.ventanaCrearCarpeta = ventanaCrearCarpeta;
    }

    public VentanaCrearCarpeta getVentanaCrearCarpeta() {
        return ventanaCrearCarpeta;
    }

    public void setVentanaCrearCarpeta(VentanaCrearCarpeta ventanaCrearCarpeta) {
        this.ventanaCrearCarpeta = ventanaCrearCarpeta;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String cD = this.ventanaCrearCarpeta.getTxtList().get(0).getText();
        String nC = this.ventanaCrearCarpeta.getTxtList().get(1).getText();
            
        CrearCarpeta cC = new CrearCarpeta(cD, nC);
            
        this.ventanaCrearCarpeta.getgD().addcrearCarpeta(cC);    
        
        Object [][] dato1=this.ventanaCrearCarpeta.cargaDatosTabla(this.ventanaCrearCarpeta.getgD().getCrearCarpetaList().size(),2);
        this.ventanaCrearCarpeta.setDatos(dato1);
        this.ventanaCrearCarpeta.getModeloTabla().setDataVector(this.ventanaCrearCarpeta.getDatos(),this.ventanaCrearCarpeta.getEncabezado());
    }
    
}
