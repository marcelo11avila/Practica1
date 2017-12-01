/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EventoVentanaArbol;
import controlador.GestionDato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author EstebanRM
 */
public class VentanaArbol extends JFrame{
    private JButton boton1;
    private JPanel panelPrincipal;
    private GestionDato gD;
    private JScrollPane scroll;
    private DefaultTreeModel modeloArbol;
    private DefaultMutableTreeNode nodo;
    private DefaultMutableTreeNode principal;
    private JTree arbol;

    public VentanaArbol(GestionDato gD) {
        super("Ventana Arbol");
        this.setSize(800, 600);
        this.iniciaComponentes();
        
    }
    public void iniciaComponentes(){
        
        this.boton1 = new JButton("Actualizar");
        
        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        LayoutManager disenioBoton=new GridLayout(1,2);
        JPanel panelBotones = new JPanel(disenioBoton);
        panelBotones.add(this.boton1);
        
        this.principal = new DefaultMutableTreeNode("C:\\Users\\EstebanRM\\Desktop\\Esteban\\universidad\\carpeta modificada");
        
        this.modeloArbol = new DefaultTreeModel(this.principal);
        this.arbol = new JTree(this.modeloArbol);
        this.scroll = new JScrollPane(this.arbol);
        this.boton1.addActionListener(new EventoVentanaArbol(this));
        this.panelPrincipal.add(this.scroll,BorderLayout.CENTER);
        
        
        this.panelPrincipal.add(panelBotones,BorderLayout.SOUTH);
        
         this.add(this.panelPrincipal);
    }
    public void mostrarArbol(File[] a, DefaultMutableTreeNode principal){
        System.out.println("mostar Arbol");
        for(File c:a){
            if(c.isDirectory()){
                this.nodo= new DefaultMutableTreeNode(c.getPath());
                principal=nodo;
                System.out.println(c.getPath());
                mostrarArbol(c.listFiles(),principal);
            }
            else{
                this.nodo = new DefaultMutableTreeNode(c.getPath());
                this.modeloArbol.insertNodeInto(nodo, principal, 0);
                System.out.println(c.getPath());
            }
        }
    }

    public JButton getBoton1() {
        return boton1;
    }

    public void setBoton1(JButton boton1) {
        this.boton1 = boton1;
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

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public DefaultTreeModel getModeloArbol() {
        return modeloArbol;
    }

    public void setModeloArbol(DefaultTreeModel modeloArbol) {
        this.modeloArbol = modeloArbol;
    }

    public DefaultMutableTreeNode getNodo() {
        return nodo;
    }

    public void setNodo(DefaultMutableTreeNode nodo) {
        this.nodo = nodo;
    }

    public DefaultMutableTreeNode getPrincipal() {
        return principal;
    }

    public void setPrincipal(DefaultMutableTreeNode principal) {
        this.principal = principal;
    }

    public JTree getArbol() {
        return arbol;
    }

    public void setArbol(JTree arbol) {
        this.arbol = arbol;
    }
    
}
