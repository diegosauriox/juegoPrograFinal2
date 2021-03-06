/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import juegoprogra.InventarioLuchadores;
import juegoprogra.Luchador;
import juegoprogra.InventarioObjeto;
import juegoprogra.ObjetoEquipable;

/**
 *
 * @author diegosaurio
 */
public class MenuGuerrero extends javax.swing.JFrame {

    private InventarioLuchadores InventarioLuchadores = new InventarioLuchadores();
    private ArrayList<Luchador> listaLuchadores = null;
    private InventarioObjeto InventarioObjeto = new InventarioObjeto();
    private ArrayList<ObjetoEquipable> listaObjetos = null;

    public MenuGuerrero(ArrayList<Luchador> paramListaLuchadores, ArrayList<ObjetoEquipable> paramListaObjetos) {
        initComponents();
        this.setLocationRelativeTo(null);
        listaLuchadores = paramListaLuchadores;
        listaObjetos = paramListaObjetos;
        tablaLuchadores.setModel(agregarLuchadorTabla(listaLuchadores));
        tablaObjetos.setModel(agregarObjetoTabla(listaObjetos));
    }

    public DefaultTableModel agregarLuchadorTabla(ArrayList<Luchador> listaLuchadores) {
        try {
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Numero");
            dtm.addColumn("Nombre");
            dtm.addColumn("Atk");
            dtm.addColumn("Def ");
            dtm.addColumn("Spd");
            dtm.addColumn("Hp");
            dtm.addColumn("Faccion");
            dtm.addColumn("Rango");
            dtm.addColumn("Objeto");
            String arreglo[] = new String[9];
            int numero = 1;
            for (int contador = 0; contador < listaLuchadores.size(); contador++) {
                arreglo[0] = String.valueOf(numero);
                arreglo[1] = listaLuchadores.get(contador).getNombre();
                arreglo[2] = String.valueOf(listaLuchadores.get(contador).getAtk());
                arreglo[3] = String.valueOf(listaLuchadores.get(contador).getDef());
                arreglo[4] = String.valueOf(listaLuchadores.get(contador).getSpd());
                arreglo[5] = String.valueOf(listaLuchadores.get(contador).getHp());
                arreglo[6] = listaLuchadores.get(contador).getFaccion();
                arreglo[7] = String.valueOf(listaLuchadores.get(contador).getRango());
                arreglo[8] = String.valueOf(listaLuchadores.get(contador).getIsObjetoEquipado());
                dtm.addRow(arreglo);
                numero++;
            }
            return dtm;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public DefaultTableModel agregarObjetoTabla(ArrayList<ObjetoEquipable> listaObjetos) {
        try {
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Numero");
            dtm.addColumn("Tipo");
            dtm.addColumn("Atributo");
            dtm.addColumn("Mejora ");
            dtm.addColumn("Estrellas");
            dtm.addColumn("Rango");
            int numero = 1;
            String arreglo[] = new String[6];
            for (int contador = 0; contador < listaObjetos.size(); contador++) {
                arreglo[0] = String.valueOf(numero);
                arreglo[1] = listaObjetos.get(contador).getTipo();
                arreglo[2] = listaObjetos.get(contador).getAtributo();
                arreglo[3] = String.valueOf(listaObjetos.get(contador).getMejoraTotal());
                arreglo[4] = String.valueOf(listaObjetos.get(contador).getRangoEstrellas());
                arreglo[5] = String.valueOf(listaObjetos.get(contador).getRango());
                dtm.addRow(arreglo);
                numero++;
            }
            return dtm;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        TabLuchadores = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaLuchadores = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaObjetos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scroll.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agregar luchador", "Eliminar luchador", "Cantidad luchadores", "Agregar objetos", "Equipar objetos", "Eliminar objeto" }));
        scroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollActionPerformed(evt);
            }
        });

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        salir.setText("Volver Atras");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        tablaLuchadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Atk", "Def", "Spd", "Hp", "Faccion", "Rango", "Objeto"
            }
        ));
        jScrollPane2.setViewportView(tablaLuchadores);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        TabLuchadores.addTab("Luchadores", jPanel1);

        tablaObjetos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Tipo", "Atributo", "Mejora", "Estrellas", "Rango"
            }
        ));
        jScrollPane3.setViewportView(tablaObjetos);

        TabLuchadores.addTab("Objetos", jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scroll, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 29, Short.MAX_VALUE)
                .addComponent(TabLuchadores, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(salir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TabLuchadores, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scrollActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (scroll.getSelectedIndex()) {
            case 0://agregar
                InventarioLuchadores.agregarLuchadores(listaLuchadores);
                tablaLuchadores.setModel(agregarLuchadorTabla(listaLuchadores));
                break;

            case 1://eliminar
                try{
                InventarioLuchadores.eliminarLuchador(listaLuchadores);
                tablaLuchadores.setModel(agregarLuchadorTabla(listaLuchadores));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case 2://Mostrar cantidad luchadores
                JOptionPane.showMessageDialog(this, "Existe: " + listaLuchadores.size() + " luchadores");
                break;
            case 3://agregar objeto
                InventarioObjeto.agregarObjeto(listaObjetos);
                tablaObjetos.setModel(agregarObjetoTabla(listaObjetos));
                break;
            case 4://equipar objeto
                try{
                if (listaObjetos.size()!=0&&listaLuchadores.size()!=0){
                int numObjeto=Integer.parseInt(JOptionPane.showInputDialog(null,"elija el numero del objeto que quiera equipar"));
                ObjetoEquipable objetoSeleccionado = listaObjetos.get(numObjeto-1);
                int numLuchador=Integer.parseInt(JOptionPane.showInputDialog(null,"elija el numero del luchador el cual equipara el objeto"));
                listaLuchadores.get(numLuchador-1).setObjetoEquipable(objetoSeleccionado);
                listaObjetos.remove(numObjeto-1);
                tablaLuchadores.setModel(agregarLuchadorTabla(listaLuchadores));
                tablaObjetos.setModel(agregarObjetoTabla(listaObjetos));
                }else{
                JOptionPane.showMessageDialog(null, "No existen objetos en el inventario o luchadores ");
                }
                }catch(HeadlessException | NumberFormatException e){
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            case 5://eliminar objeto
                try{
                InventarioObjeto.quitarObjeto(listaObjetos);
                tablaObjetos.setModel(agregarObjetoTabla(listaObjetos));
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menu = new MenuPrincipal(listaLuchadores,listaObjetos);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabLuchadores;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton salir;
    private javax.swing.JComboBox<String> scroll;
    private javax.swing.JTable tablaLuchadores;
    private javax.swing.JTable tablaObjetos;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Luchador> getListaLuchadores() {
        return listaLuchadores;
    }

    public ArrayList<ObjetoEquipable> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaLuchadores(ArrayList<Luchador> listaLuchadores) {
        this.listaLuchadores = listaLuchadores;
    }

    public void setListaObjetos(ArrayList<ObjetoEquipable> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }
 

}
