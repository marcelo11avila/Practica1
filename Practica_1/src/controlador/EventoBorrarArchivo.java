/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import vista.VentanaBorrarArchivo;


/**
 *
 * @author Estudiante
 */
public class EventoBorrarArchivo implements ActionListener {
    
     private VentanaBorrarArchivo ventanaBorrarArchivo;

    public EventoBorrarArchivo(VentanaBorrarArchivo ventanaBorrarArchivo) {
        this.ventanaBorrarArchivo = ventanaBorrarArchivo;
    }

    public VentanaBorrarArchivo getVentanaBorrarArchivo() {
        return ventanaBorrarArchivo;
    }

    public void setVentanaBorrarArchivo(VentanaBorrarArchivo ventanaBorrarArchivo) {
        this.ventanaBorrarArchivo = ventanaBorrarArchivo;
    }

   
   
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventanaBorrarArchivo.getBoton1())){
            String cD = this.ventanaBorrarArchivo.getTxtList().get(0).getText();

            
            System.out.println("entra");
            
            
            File archivo =new File(cD);
            archivo.delete();
            

           
            
        }
        if(e.getSource().equals(this.ventanaBorrarArchivo.getBoton2())){
            this.ventanaBorrarArchivo.getTxtList().get(0).setText("");
            
        }
    }
    
    
}
