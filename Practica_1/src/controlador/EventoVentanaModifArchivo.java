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
        if(e.getSource().equals(this.ventanaModifArchivo.getBoton1())){
        String cD = this.ventanaModifArchivo.getTxtList().get(0).getText();
        String nA = this.ventanaModifArchivo.getTxtList().get(1).getText();

        File antiguo= new File(cD);
        File nuevo = new File(this.ventanaModifArchivo.getgD().modificar(cD)+"\\"+nA);
        if(antiguo.renameTo(nuevo)){
            JOptionPane.showMessageDialog(null,"Archivo Actualizar","Exito",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"El Archivo no se pudo Actualizar", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        }
        if(e.getSource().equals(this.ventanaModifArchivo.getBoton2())){
            this.ventanaModifArchivo.getTxtList().get(0).setText("");
            this.ventanaModifArchivo.getTxtList().get(1).setText("");
        }
        
    }
}
