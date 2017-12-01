/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaArbol;
import vista.VentanaBorrarArchivo;
import vista.VentanaBorrarCarpeta_1;
import vista.VentanaCrearArchivo;
import vista.VentanaCrearCarpeta;
import vista.VentanaInicial;
import vista.VentanaModifArchivo;
import vista.VentanaModifCarpeta;

/**
 *
 * @author Marcelo11
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
           
        }
        if(ae.getSource().equals(this.ventanaInicial.getMenuItemList().get(1))){
            VentanaCrearArchivo vCA = new  VentanaCrearArchivo(this.ventanaInicial.getgD());
            vCA.setVisible(true);
           
        }
        if(ae.getSource().equals(this.ventanaInicial.getMenuItemList().get(2))){
            VentanaModifCarpeta vMC = new  VentanaModifCarpeta(this.ventanaInicial.getgD());
            vMC.setVisible(true);
           
        }
        if(ae.getSource().equals(this.ventanaInicial.getMenuItemList().get(3))){
            VentanaModifArchivo vMa = new  VentanaModifArchivo(this.ventanaInicial.getgD());
            vMa.setVisible(true);
           
        }
       if(ae.getSource().equals(this.ventanaInicial.getMenuItemList().get(4))){
            VentanaBorrarCarpeta_1 vB = new VentanaBorrarCarpeta_1(this.ventanaInicial.getgD());
            vB.setVisible(true);
            
        }
       
        if(ae.getSource().equals(this.ventanaInicial.getMenuItemList().get(5))){
            VentanaBorrarArchivo vBA = new VentanaBorrarArchivo(this.ventanaInicial.getgD());
            vBA.setVisible(true);

    }
        if(ae.getSource().equals(this.ventanaInicial.getMenuItemList().get(6))){
            System.out.println("ventana arbol");
            VentanaArbol vA= new VentanaArbol(this.ventanaInicial.getgD());
            vA.setVisible(true);
        }
    
}
    }
