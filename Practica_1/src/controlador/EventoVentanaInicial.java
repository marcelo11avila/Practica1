/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaCrearArchivo;
import vista.VentanaCrearCarpeta;
import vista.VentanaInicial;

/**
 *
 * @author Estudiante
 */
public class EventoVentanaInicial implements ActionListener{
    private VentanaInicial ventanaInicial;

    public EventoVentanaInicial(VentanaInicial ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
    }

    public VentanaInicial getVentanaInicial() {
        return ventanaInicial;
    }

    public void setVentanaInicial(VentanaInicial ventanaInicial) {
        this.ventanaInicial = ventanaInicial;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(this.ventanaInicial.getMenuItemList().get(0))){
            VentanaCrearCarpeta vCC = new  VentanaCrearCarpeta(this.ventanaInicial.getgD());
            vCC.setVisible(true);
            this.ventanaInicial.getEscritorio().add(vCC);
        }
        if(ae.getSource().equals(this.ventanaInicial.getMenuItemList().get(1))){
            VentanaCrearArchivo vCA = new  VentanaCrearArchivo(this.ventanaInicial.getgD());
            vCA.setVisible(true);
            this.ventanaInicial.getEscritorio().add(vCA);
        }
    }
    
}
