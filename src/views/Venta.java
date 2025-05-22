/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package views;
import conexion.Conexion;
import controllers.ControllerVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.VentaV;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
/**
 *
 * @author user
 */
public class Venta extends javax.swing.JInternalFrame {
   public int idMembresiaGlobal = 0;
   public int idMetodoPagoGlobal = 0;
   Conexion enlace = new Conexion();
   Connection conet = enlace.conectar();
   
   
  float precioventa;

    public Venta() {
        initComponents();
         cargarTodasLasMembresias();
         cargarTodosLosMetodosPago();
         mostrarDatosVentar(0,null);
    }
public void calcularPrecio() {
  float precio = Float.parseFloat(this.txtMonto.getText());
  precioventa = (float) (precio  * 0.2) + precio ;
}
public void MostrarCliente(){
String id  = txtCliente.getText();
String[]datos = new String [3];

    try {
        Statement leer = conet.createStatement();
        ResultSet resultado = leer.executeQuery("select * from cliente where dni_c = '"+id+"'");
        
        while(resultado.next()){
      datos[0] = resultado.getString(1);
      datos[1] = resultado.getString(2);
      datos[2] = resultado.getString(3);
    }
        labelNombre.setText(datos[1] + " " + datos[2]);
        
        
    } catch (Exception e) {
        
         JOptionPane.showMessageDialog(null, e +"Error en confirmar la persona");
    }

}


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        comboOpcion = new javax.swing.JComboBox<>();
        campoBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFechaCompra = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        cb_metodoPago = new javax.swing.JComboBox<>();
        txtPrecitoTotal = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        cb_mem1 = new javax.swing.JComboBox<>();
        generarpdf = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setClosable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel12.setText("Registrar Venta");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-disk-96.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-eliminar-96.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel20.setText("Guardar Venta");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel21.setText("Generar PDF");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, 20));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("Ventas Registradas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaVenta.setName(""); // NOI18N
        tablaVenta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablaVentaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tablaVenta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 950, 340));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar por"));

        comboOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mostrar Todos", "Identificacion", "Apellido" }));
        comboOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOpcionActionPerformed(evt);
            }
        });

        campoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-buscar-16.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar datos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(comboOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(0, 351, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 950, 80));

        jLabel2.setText("Fecha de compra ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setText("Monto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jLabel4.setText("Cliente");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jLabel5.setText("Forma de pago");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        jLabel7.setText("Descuento");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

        jLabel8.setText("Precio total");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, -1));

        txtFechaCompra.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaCompra.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaCompraActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, -1));

        txtMonto.setBackground(new java.awt.Color(255, 255, 255));
        txtMonto.setForeground(new java.awt.Color(0, 0, 0));
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMontoKeyReleased(evt);
            }
        });
        getContentPane().add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, -1));

        txtCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClienteFocusLost(evt);
            }
        });
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 150, -1));

        cb_metodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la Membresia", " ", " " }));
        cb_metodoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_metodoPagoActionPerformed(evt);
            }
        });
        getContentPane().add(cb_metodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 150, -1));
        getContentPane().add(txtPrecitoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, 140, -1));

        labelNombre.setText("Confirmar Cliente");
        getContentPane().add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 130, -1));

        cb_mem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la Membresia", " ", " " }));
        cb_mem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_mem1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb_mem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 150, -1));

        generarpdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pdf-96.png"))); // NOI18N
        generarpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarpdfActionPerformed(evt);
            }
        });
        getContentPane().add(generarpdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 100, 110));

        jLabel22.setText("Eliminar");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 226, -1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void cargarTodosLosMetodosPago() {
    Connection cn = Conexion.conectar();
    String sql = "SELECT * FROM metodo_pago";
    Statement st;

    try {
        st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        cb_metodoPago.removeAllItems(); // Limpia los ítems actuales
        cb_metodoPago.addItem("Seleccione un Método de Pago"); // Opción inicial

        while (rs.next()) {
            cb_metodoPago.addItem(rs.getString("nombre"));
        }
    } catch (SQLException e) {
        System.out.println("Error al cargar Métodos de Pago: " + e);
    }
}

    public void metodoIDPago() {
    Connection cn = Conexion.conectar();
    String sql = "SELECT id_metodo FROM metodo_pago WHERE nombre = '" + cb_metodoPago.getSelectedItem() + "'";
    Statement st;

    try {
        st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            idMetodoPagoGlobal = rs.getInt("id_metodo");
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener ID del método de pago: " + e);
    }
}

    
    public void metodoIDMembresia(){
        //Llamamos a la conexion
        Connection cn = Conexion.conectar();
        String sql = "select id_membresia from membresia where tipo_membresia  = '"+cb_mem1.getSelectedItem()+"'";
        Statement st;
        try{
             //Ejecutamos el Statement (sentencia)
            st = cn.createStatement();
            //"Conjuto de resultado" Obtenemos los datos de la BD;
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){  
                idMembresiaGlobal = rs.getInt("id_membresia");
            }
        }catch(SQLException e){
            System.out.println("Error al llamar sus ID de la membresia"+e);
        }
     }
        public void cargarTodasLasMembresias(){
        //Llamamos a la conexion
        Connection cn = Conexion.conectar();
        String sql = "select * from membresia";
        Statement st;
        try{
            //Ejecutamos el Statement (sentencia)
            st = cn.createStatement();
            //"Conjuto de resultado" Obtenemos los datos de la BD;
            ResultSet rs = st.executeQuery(sql);
            cb_mem1.removeAllItems(); //Elimina todos los item creados anteriormente
            cb_mem1.addItem("Seleccione una Membresia"); //agrego un nuevo item
            //El bucle busca la siguiente fila del ResultSet mientras haya datos
            while(rs.next()){  
                //Almaceno en mi combo box categoria, todos los datos de la tabla categoria
                // pongo "descripcion" porque asi esta el atributo en mi tabla tb_categoria
                cb_mem1.addItem(rs.getString("tipo_membresia"));
            }
        }catch(SQLException e){
            System.out.println("Error al cargar Membresia"+e);
        }
    }
        
        public void mostrarDatosVentar(int opbuscar, String valor){

       DefaultTableModel tentrenador = new DefaultTableModel(
           new String[]{"id_venta", "fecha_de_compra", "monto", "precio_final", "dni_c", "id_metodo", "id_membresia", "fecha_pago"}, 0
       );
       tablaVenta.setModel(tentrenador);
       
             String codsql;
        if (opbuscar == 0 &&  valor == null ){
         codsql  = "SELECT * FROM venta";
        }else {
           if (opbuscar == 1 && valor != null){
           codsql = "select * from venta where fecha_pago = '"+valor+"'" ;
           }else {
           if (opbuscar == 2 && valor != null){
           codsql = "select * from venta where dni_c = '"+valor+"'" ;
           } else {
               codsql  = "SELECT * FROM venta";
           }
           }
        }

       if (conet == null) {
           JOptionPane.showMessageDialog(null, "Error en la conexión con la base de datos");
           return;
       }

       String[] datos = new String[7];

       try {
           Statement leer = conet.createStatement();
           ResultSet resultado = leer.executeQuery(codsql);

           while (resultado.next()) {
               datos[0] = resultado.getString(1);
               datos[1] = resultado.getString(2);
               datos[2] = resultado.getString(3);
               datos[3] = resultado.getString(4);
               datos[4] = resultado.getString(5);
               datos[5] = resultado.getString(6);
               datos[6] = resultado.getString(7);
               tentrenador.addRow(datos);
           }

           tablaVenta.setModel(tentrenador);
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Error en la consulta: " + e.getMessage());
       }
}
    public void EliminarCliente(){
      int fila = tablaVenta.getSelectedRow();
      String valor = tablaVenta.getValueAt(fila, 0).toString();
      
        try {
            PreparedStatement elimi = conet.prepareStatement("delete from venta where id_venta = '"+valor+"'");
                    elimi.executeUpdate();
                    mostrarDatosVentar(0, null);
        } catch (Exception e) {
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ControllerVenta controlProducto = new ControllerVenta();
        VentaV VentaP = new VentaV();
        // Validamos que ningún campo esté vacío antes de continuar
        // Asignamos los valores a la clase Cliente
        VentaP.setFecha_de_compra(txtFechaCompra.getText().trim());
        VentaP.setMonto(Double.parseDouble(txtMonto.getText()));
        VentaP.setDni_c(Integer.parseInt(txtCliente.getText().trim()));
        this.metodoIDPago();
        VentaP.setId_metodo(idMetodoPagoGlobal);
        this.metodoIDMembresia();
        VentaP.setId_membresia(idMembresiaGlobal); // Formato YYYY-MM-DD
         VentaP.setPrecio_final(Double.parseDouble(txtPrecitoTotal.getText()));

        // Intentamos guardar el cliente
        if (controlProducto.guardaVenta(VentaP)) {
            JOptionPane.showMessageDialog(null, "¡Registro correcto!");
        } else {
            JOptionPane.showMessageDialog(null, "¡Error al guardar!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        DefaultTableModel produc= new DefaultTableModel(
              new String[]{"id_venta", "fecha_de_compra", "monto", "precio_final", "dni_c", "id_metodo", "id_membresia", "fecha_pago"}, 0
        );
        tablaVenta.setModel(produc);
        if (conet == null) {
            JOptionPane.showMessageDialog(null, "Error en la conexión con la base de datos");
            return;
        }

        String[] datos = new String[8];

        try {
            Statement leer = conet.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM venta");

            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);
                produc.addRow(datos);
            }

            tablaVenta.setModel(produc);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la consulta: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        EliminarCliente();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tablaVentaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaVentaAncestorAdded

    }//GEN-LAST:event_tablaVentaAncestorAdded

    private void comboOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOpcionActionPerformed
        int opcion  = comboOpcion.getSelectedIndex();
        String valorbuscado  = campoBuscar.getText();
        mostrarDatosVentar(opcion,valorbuscado);
    }//GEN-LAST:event_comboOpcionActionPerformed

    private void campoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int opcion  = comboOpcion.getSelectedIndex();
        String valorbuscado  = campoBuscar.getText();
        mostrarDatosVentar(opcion,valorbuscado);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        EliminarCliente();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtFechaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaCompraActionPerformed

    private void cb_metodoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_metodoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_metodoPagoActionPerformed

    private void txtMontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyReleased
     
        calcularPrecio();
        txtPrecitoTotal.setText(String.valueOf(precioventa));
        
    }//GEN-LAST:event_txtMontoKeyReleased

    private void txtClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClienteFocusLost
      MostrarCliente();
    }//GEN-LAST:event_txtClienteFocusLost

    private void cb_mem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_mem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_mem1ActionPerformed

    private void generarpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarpdfActionPerformed
     generarPDFVentas();
    }//GEN-LAST:event_generarpdfActionPerformed

    public void generarPDFVentas() {
    Document documento = new Document();

    try {
        Connection cn = Conexion.conectar();
        String sql = "SELECT v.id_venta, v.fecha_de_compra, v.monto, v.precio_final, c.nombre AS cliente, m.nombre AS metodo_pago, me.tipo_membresia, v.fecha_pago " +
                     "FROM venta v " +
                     "JOIN cliente c ON v.dni_c = c.dni_c " +
                     "JOIN metodo_pago m ON v.id_metodo = m.id_metodo " +
                     "LEFT JOIN membresia me ON v.id_membresia = me.id_membresia";

        PreparedStatement ps = cn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        // Ruta y nombre del archivo PDF a generar
        PdfWriter.getInstance(documento, new FileOutputStream("reporte_ventas.pdf"));
        documento.open();

        // Título del documento
        documento.add(new Paragraph("Reporte de Ventas"));
        documento.add(new Paragraph(" ")); // espacio

        // Definir la tabla en el PDF
        PdfPTable tabla = new PdfPTable(8);
        tabla.addCell("ID");
        tabla.addCell("Fecha Compra");
        tabla.addCell("Monto");
        tabla.addCell("Precio Final");
        tabla.addCell("Cliente");
        tabla.addCell("Método de Pago");
        tabla.addCell("Membresía");
        tabla.addCell("Fecha de Pago");

        // Llenar la tabla con los datos de la base de datos
        while (rs.next()) {
            tabla.addCell(String.valueOf(rs.getInt("id_venta")));
            tabla.addCell(rs.getString("fecha_de_compra"));
            tabla.addCell(rs.getString("monto"));
            tabla.addCell(rs.getString("precio_final"));
            tabla.addCell(rs.getString("cliente"));
            tabla.addCell(rs.getString("metodo_pago"));
            tabla.addCell(rs.getString("tipo_membresia") != null ? rs.getString("tipo_membresia") : "N/A");
            tabla.addCell(rs.getString("fecha_pago"));
        }

        // Agregar la tabla al documento PDF
        documento.add(tabla);
        documento.close();  // Cerrar el documento PDF
        JOptionPane.showMessageDialog(null, "PDF generado exitosamente.");

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al generar PDF: " + e.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JComboBox<String> cb_mem1;
    private javax.swing.JComboBox<String> cb_metodoPago;
    private javax.swing.JComboBox<String> comboOpcion;
    private javax.swing.JButton generarpdf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFechaCompra;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtPrecitoTotal;
    // End of variables declaration//GEN-END:variables
}
