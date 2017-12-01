/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import vista.VentanaArbol;
import vista.VentanaCrearCarpeta;

/**
 *
 * @author EstebanRM
 */
public class EventoVentanaArbol implements ActionListener{
    private VentanaArbol ventanaArbol;
    private VentanaCrearCarpeta ventanaCrearCarpeta;

    public EventoVentanaArbol(VentanaArbol ventanaArbol) {
        this.ventanaArbol = ventanaArbol;
    }

    public VentanaArbol getVentanaArbol() {
        return ventanaArbol;
    }

    public void setVentanaArbol(VentanaArbol ventanaArbol) {
        this.ventanaArbol = ventanaArbol;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventanaArbol.getBoton1())){
            String dir = this.ventanaCrearCarpeta.getTxtList().get(0).getText();
            File directorio=new File(dir);
           
            this.ventanaArbol.mostrarArbol(directorio.listFiles(), this.ventanaArbol.getPrincipal());
        }
    }
    
    
    
}
