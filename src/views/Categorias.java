/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Categorias extends javax.swing.JInternalFrame {
  Conexion enlace = new Conexion();
   Connection conet = enlace.conectar();
  
    public Categorias() {
        initComponents();
          this.setLocation(350, 200);  
           mostrarCategorias();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCategoria = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Categorias");

        TablaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaCategoria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarCategorias() {
    DefaultTableModel tcategoria = new DefaultTableModel(
        new String[]{"id_categoria", "nombre_categoria"}, 0
    );
    TablaCategoria.setModel(tcategoria);

    if (conet == null) {
        JOptionPane.showMessageDialog(null, "Error en la conexión con la base de datos");
        return;
    }

    String[] datos = new String[2];

    try {
        Statement leer = conet.createStatement();
        ResultSet resultado = leer.executeQuery("SELECT * FROM categoria");

        while (resultado.next()) {
            datos[0] = resultado.getString("id_categoria");
            datos[1] = resultado.getString("nombre_categoria");


            // Agregar datos al modelo de la tabla
            tcategoria.addRow(datos);
        }

        // Asignar el modelo corregido a la tabla
        TablaCategoria.setModel(tcategoria);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en la consulta: " + e.getMessage());
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
