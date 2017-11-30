/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EventoVentanaCrearArchivo;
import controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiante
 */
public class VentanaCrearArchivo extends JInternalFrame{
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JButton boton1;
    private JButton boton2;
    private JPanel panelPrincipal;
    private GestionDato gD;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    
     public VentanaCrearArchivo(GestionDato gD) {
        super("Crear Archivo",true,true,true,true);
        this.gD=gD;
        this.iniciaComponentes();
        this.setLocation(325, 0);
        this.setSize(325, 325);
    }
     public void iniciaComponentes()
    {
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("Carpeta Archivo"));
        this.etiList.add(new JLabel("Nombre Archivo"));
        this.etiList.add(new JLabel("Tipo de Archivo"));
      
        this.txtList= new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());
        
        this.boton1 = new JButton("Crear");
        this.boton2 = new JButton("Limpriar");
        
        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        LayoutManager disenioSup = new GridLayout(4,2);
        JPanel panelSup = new JPanel(disenioSup);
        
        for(int i=0;i<3;i++)
        {
            panelSup.add(this.etiList.get(i));
            panelSup.add(this.txtList.get(i));
        }
        
        panelSup.add(this.boton1);
        this.panelPrincipal.add(panelSup,BorderLayout.NORTH);
        
        this.encabezado = new Object[3];
        this.encabezado[0] = "carpeta archivo";
        this.encabezado[1] = "nombre archivo";
        this.encabezado[2] = "tipo archivo";
                
        this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);
        this.tabla = new JTable(modeloTabla);
        this.scroll = new JScrollPane(tabla);
        
        this.panelPrincipal.add(this.scroll,BorderLayout.CENTER);
        
        this.boton1.addActionListener(new EventoVentanaCrearArchivo(this));
        
        this.add(this.panelPrincipal);
    }

     public Object[][] cargaDatosTabla(int h, int w)
    {
         return null;
       
    }
}
