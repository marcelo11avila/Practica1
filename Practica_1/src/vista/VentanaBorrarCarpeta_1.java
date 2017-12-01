/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;



import controlador.EventoVentanaBorrarCarpeta_1;
import controlador.EventoVentanaModifCarpeta;
import controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Carpeta;
/**
 *
 * @author EstebanRM
 */

public class VentanaBorrarCarpeta_1 extends JFrame{
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JButton boton1;
    private JButton boton2;
    private JPanel panelPrincipal;
    private GestionDato gD;



    public VentanaBorrarCarpeta_1(GestionDato gD) {
        super("Borrar Carpeta");
        this.gD=gD;
        this.iniciaComponentes();
        this.setLocation(650, 50);
        this.setSize(225, 125);
    }

    public void iniciaComponentes()
    {
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("Carpeta Destino a Borrarse"));
     
      
        this.txtList= new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
      
       
        this.boton1 = new JButton("Borrar");
        this.boton2 = new JButton("Limpiar");
        
        LayoutManager disenioPrincipal = new GridLayout(1,1);
        this.panelPrincipal = new JPanel(disenioPrincipal);
        LayoutManager disenioSup = new GridLayout(3,2);
        LayoutManager disenioBoton=new GridLayout(1,2);
        JPanel panelSup = new JPanel(disenioSup);
        JPanel panelBotones = new JPanel(disenioBoton);
        
        for(int i=0;i<1;i++)
        {
            panelSup.add(this.etiList.get(i));
            panelSup.add(this.txtList.get(i));
        }
        panelBotones.add(this.boton1);
        panelBotones.add(this.boton2);
        
        panelSup.add(panelBotones);
        this.panelPrincipal.add(panelSup);
        
       
        
        

        
        this.boton1.addActionListener(new EventoVentanaBorrarCarpeta_1(this));
        this.boton2.addActionListener(new EventoVentanaBorrarCarpeta_1(this));
        
        this.add(this.panelPrincipal);
    }
    
 

    public List<JLabel> getEtiList() {
        return etiList;
    }

    public void setEtiList(List<JLabel> etiList) {
        this.etiList = etiList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public JButton getBoton1() {
        return boton1;
    }

    public void setBoton1(JButton boton1) {
        this.boton1 = boton1;
    }

    public JButton getBoton2() {
        return boton2;
    }

    public void setBoton2(JButton boton2) {
        this.boton2 = boton2;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

   
     
   
}
