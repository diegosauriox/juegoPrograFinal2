/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import juegoprogra.Luchador;
import juegoprogra.ObjetoEquipable;
/**
 *
 * @author diegosaurio
 */
public class MenuPrincipal extends JFrame implements ActionListener{
    JButton boton1, boton2,boton3;
    JLabel titulo;
    ArrayList<Luchador> listaLuchadores = null;
    ArrayList<ObjetoEquipable> listaObjetos = null;
    
    public MenuPrincipal(){
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Dragones y calabozos");
        boton1= new JButton("menu guerrero");
        boton1.setBounds(125, 150, 150, 40);
        this.add(boton1);
        boton1.addActionListener(this);
        boton2= new JButton("menu pelea");
        boton2.setBounds(125, 210, 150, 40);
        this.add(boton2);
        boton2.addActionListener(this);
        boton3= new JButton("salir");
        boton3.setBounds(125, 270, 150, 40);
        this.add(boton3);
        boton3.addActionListener(this);
        titulo= new JLabel("Dragones y Calabozos");
        titulo.setBounds(130, 75, 200, 40);
        this.add(titulo);
    }
    public MenuPrincipal(ArrayList<Luchador> listaLuchadores, ArrayList<ObjetoEquipable> listaObjetos){
        this.listaLuchadores=listaLuchadores;
        this.listaObjetos=listaObjetos;
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Dragones y calabozos");
        boton1= new JButton("menu guerrero");
        boton1.setBounds(125, 150, 150, 40);
        this.add(boton1);
        boton1.addActionListener(this);
        boton2= new JButton("menu pelea");
        boton2.setBounds(125, 210, 150, 40);
        this.add(boton2);
        boton2.addActionListener(this);
        boton3= new JButton("salir");
        boton3.setBounds(125, 270, 150, 40);
        this.add(boton3);
        boton3.addActionListener(this);
        titulo= new JLabel("Dragones y Calabozos");
        titulo.setBounds(130, 75, 200, 40);
        this.add(titulo);
    }
    @Override
     public void actionPerformed(ActionEvent e){
         if(e.getSource()==boton1){
             listaLuchadores = validaListaLuchadores(listaLuchadores);
             listaObjetos = validaListaObjetos(listaObjetos);
             MenuGuerrero menuG = new MenuGuerrero(listaLuchadores, listaObjetos);
             menuG.setVisible(true);
             this.setVisible(false);
        }else if ( e.getSource()==boton2){
             listaLuchadores = validaListaLuchadores(listaLuchadores);
             MenuBattalla menuB= new MenuBattalla(listaLuchadores,listaObjetos);
             menuB.setVisible(true);
             this.setVisible(false);
        }else if ( e.getSource()==boton3){
               this.dispose();
        }
     }
     
     private ArrayList<Luchador> validaListaLuchadores(ArrayList<Luchador> lista){
         if(null == lista){
             lista = new ArrayList<>();
             lista.add(new Luchador());
         }
         return lista;
     }
     
     private ArrayList<ObjetoEquipable> validaListaObjetos(ArrayList<ObjetoEquipable> lista){
         if(null == lista){
             lista = new ArrayList<>();
         }
         return lista;
     }
     
    }

