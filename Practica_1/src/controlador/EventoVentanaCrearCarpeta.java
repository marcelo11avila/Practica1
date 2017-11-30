/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        
    }
    
}
