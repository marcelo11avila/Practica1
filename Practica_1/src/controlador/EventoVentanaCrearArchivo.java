/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaCrearArchivo;

/**
 *
 * @author Estudiante
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
        
    }
    
}
