/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EventoVentanaModifArchivo;
import controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import modelo.Archivo;

/**
 *
 * @author EstebanRM
 */
public class VentanaModifArchivo extends JFrame {

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

    public VentanaModifArchivo(GestionDato gD) {
        super("Modificar Archivo");
        this.gD = gD;
        this.iniciaComponentes();
        this.setLocation(325, 0);
        this.setSize(325, 325);
    }

    public void iniciaComponentes() {
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("Carpeta Destino"));
        this.etiList.add(new JLabel("Nombre nuevo"));

        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField());
        this.txtList.add(new JTextField());

        this.boton1 = new JButton("Modificar");
        this.boton2 = new JButton("Limpiar");

        LayoutManager disenioSup = new GridLayout(5, 1);
        LayoutManager disenioBoton=new GridLayout(1,2);
        JPanel panelSup = new JPanel(disenioSup);
        JPanel panelBotones = new JPanel(disenioBoton);

         for(int i=0;i<2;i++)
        {
            panelSup.add(this.etiList.get(i));
            panelSup.add(this.txtList.get(i));
        }

        panelBotones.add(this.boton1);
        panelBotones.add(this.boton2);

        this.boton1.addActionListener(new EventoVentanaModifArchivo(this));
        this.boton2.addActionListener(new EventoVentanaModifArchivo(this));
        panelSup.add(panelBotones);

        this.add(panelSup);
    }

    public Object[][] cargaDatosTabla(int h, int w) {
        Object[][] retorno = new Object[h][w];
        int i = 0;
        for (Archivo cA : this.gD.getCrearArchivoList()) {
            retorno[i][0] = cA.getCarpetaDestino() + ":/";
            retorno[i][1] = cA.getNombreArchivo() + "/";
            retorno[i][2] = cA.getTipoArchivo();

            i++;
        }
        return retorno;

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

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

}
