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
import vista.VentanaModifCarpeta;

/**
 *
 * @author EstebanRM
 */

public class EventoVentanaModifCarpeta implements ActionListener{
    private VentanaModifCarpeta ventanaModifCarpeta;

    public EventoVentanaModifCarpeta(VentanaModifCarpeta ventanaModifCarpeta) {
        this.ventanaModifCarpeta = ventanaModifCarpeta;
    }

    public VentanaModifCarpeta getVentanaModifCarpeta() {
        return ventanaModifCarpeta;
    }

    public void setVentanaModifCarpeta(VentanaModifCarpeta ventanaModifCarpeta) {
        this.ventanaModifCarpeta = ventanaModifCarpeta;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventanaModifCarpeta.getBoton1())){
            String cD = this.ventanaModifCarpeta.getTxtList().get(0).getText();
            String nC = this.ventanaModifCarpeta.getTxtList().get(1).getText();
            
            System.out.println("entra");
            
            
            File directorio =new File(cD);
            
            File nuevoDirectorio=new File(this.ventanaModifCarpeta.getgD().modificar(cD)+"\\"+nC);
            directorio.renameTo(nuevoDirectorio);
            
             Carpeta cC = new Carpeta(cD, nC);
            
             this.ventanaModifCarpeta.getgD().addcrearCarpeta(cC);

            Object[][] dato1 = this.ventanaModifCarpeta.cargaDatosTabla(this.ventanaModifCarpeta.getgD().getCrearCarpetaList().size(), 2);
            this.ventanaModifCarpeta.setDatos(dato1);
            this.ventanaModifCarpeta.getModeloTabla().setDataVector(this.ventanaModifCarpeta.getDatos(), this.ventanaModifCarpeta.getEncabezado());       
           
            
        }
        if(e.getSource().equals(this.ventanaModifCarpeta.getBoton2())){
            this.ventanaModifCarpeta.getTxtList().get(0).setText("");
            this.ventanaModifCarpeta.getTxtList().get(1).setText("");
            
        }
    }
    
    
}
