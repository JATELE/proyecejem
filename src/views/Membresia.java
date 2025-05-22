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
public class Membresia extends javax.swing.JInternalFrame {

    Conexion enlace = new Conexion();
   Connection conet = enlace.conectar();
    public Membresia() {
        initComponents();
         this.setLocation(550, 200);  
         mostrarMembresias();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMembresias = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Menbresias");

        tablaMembresias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMembresias.setName("Menbresias"); // NOI18N
        jScrollPane1.setViewportView(tablaMembresias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void mostrarMembresias() {
    DefaultTableModel tmembresia = new DefaultTableModel(
        new String[]{"id_membresia", "duracion", "tipo_membresia", "descuento", "precio"}, 0
    );
    tablaMembresias.setModel(tmembresia);

    if (conet == null) {
        JOptionPane.showMessageDialog(null, "Error en la conexión con la base de datos");
        return;
    }

    String[] datos = new String[5];

    try {
        Statement leer = conet.createStatement();
        ResultSet resultado = leer.executeQuery("SELECT * FROM membresia");

        while (resultado.next()) {
            datos[0] = resultado.getString("id_membresia");
            datos[1] = resultado.getString("duracion");
            datos[2] = resultado.getString("tipo_membresia");
            datos[3] = resultado.getString("descuento");
            datos[4] = resultado.getString("precio");

            // Agregar datos al modelo de la tabla
            tmembresia.addRow(datos);
        }

        // Asignar el modelo corregido a la tabla
        tablaMembresias.setModel(tmembresia);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en la consulta: " + e.getMessage());
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMembresias;
    // End of variables declaration//GEN-END:variables
}

