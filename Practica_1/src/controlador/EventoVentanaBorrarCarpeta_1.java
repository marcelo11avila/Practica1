/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import modelo.Carpeta;
import vista.VentanaBorrarCarpeta_1;

/**
 *
 * @author EstebanRM
 */

public class EventoVentanaBorrarCarpeta_1 implements ActionListener{
    private VentanaBorrarCarpeta_1 ventanaBorrarCarpeta;

    public EventoVentanaBorrarCarpeta_1(VentanaBorrarCarpeta_1 ventanaBorrarCarpeta) {
        this.ventanaBorrarCarpeta = ventanaBorrarCarpeta;
    }

    public VentanaBorrarCarpeta_1 getVentanaBorrarCarpeta() {
        return ventanaBorrarCarpeta;
    }

    public void setVentanaBorrarCarpeta(VentanaBorrarCarpeta_1 ventanaBorrarCarpeta) {
        this.ventanaBorrarCarpeta = ventanaBorrarCarpeta;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventanaBorrarCarpeta.getBoton1())){
            String cD = this.ventanaBorrarCarpeta.getTxtList().get(0).getText();

            
            System.out.println("entra");
            
            
            File directorio =new File(cD);
            directorio.delete();
            

           
            
        }
        if(e.getSource().equals(this.ventanaBorrarCarpeta.getBoton2())){
            this.ventanaBorrarCarpeta.getTxtList().get(0).setText("");
            
        }
    }
    
    
}
