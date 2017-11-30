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
import vista.VentanaCrearCarpeta;

/**
 *
 * @author Marcelo11
 */

public class EventoVentanaCrearCarpeta implements ActionListener {

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
        if (ae.getSource().equals(this.ventanaCrearCarpeta.getBoton1())) {
            System.out.println("entra ahora");
            String cD = this.ventanaCrearCarpeta.getTxtList().get(0).getText();
            String nC = this.ventanaCrearCarpeta.getTxtList().get(1).getText();

            Carpeta cC = new Carpeta(cD, nC);

            File directorio = new File(cD + "\\" + nC);
            if (!directorio.exists()) {
                directorio.mkdir();
            }
            this.ventanaCrearCarpeta.getgD().addcrearCarpeta(cC);

            Object[][] dato1 = this.ventanaCrearCarpeta.cargaDatosTabla(this.ventanaCrearCarpeta.getgD().getCrearCarpetaList().size(), 2);
            this.ventanaCrearCarpeta.setDatos(dato1);
            this.ventanaCrearCarpeta.getModeloTabla().setDataVector(this.ventanaCrearCarpeta.getDatos(), this.ventanaCrearCarpeta.getEncabezado());
        }
    

    
    

        if(ae.getSource().equals(this.ventanaCrearCarpeta.getBoton2())){
            this.ventanaCrearCarpeta.getTxtList().get(0).setText("");
            this.ventanaCrearCarpeta.getTxtList().get(1).setText("");
           
        }      
    }
}
