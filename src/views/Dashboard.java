/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

import javax.swing.JPanel;

/**
 *
 * @author SENATI
 */
public class Dashboard extends javax.swing.JFrame {
    Tiempopro time = new Tiempopro();
    public static JDesktopPane dashboard_menu;
    public Dashboard() {
        initComponents();
        this.setSize(1200,700);
        this.setExtendedState(Dashboard.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        //Instanciamos
     dashboard_menu = new JDesktopPane();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        //ajustar a la medida de la caja
      
         dashboard_menu = new BackgroundDesktopPane(getClass().getResource("/video/gym2.gif").getPath());
        dashboard_menu.setBounds(0,0,ancho,(alto-110));
        this.add(dashboard_menu);
         
        bienvenidos b = new bienvenidos();
        b.setVisible(true);
        b.setLocation(500, 100);
        dashboard_menu.add(b);
    }

    public void MostrarTiempo(){
    
        labelFecha.setText(time.fechacomp);
        labelHora.setText(time.horacomp);
    
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        labelHora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem6.setText("jMenuItem6");

        jMenuItem10.setText("jMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelHora.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        labelHora.setForeground(new java.awt.Color(255, 255, 255));
        labelHora.setText("jLabel4");
        getContentPane().add(labelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 690, 130, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hora   :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1410, 690, -1, -1));

        labelFecha.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        labelFecha.setForeground(new java.awt.Color(255, 255, 255));
        labelFecha.setText("jLabel3");
        getContentPane().add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 640, 130, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 640, -1, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-usuario-32.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-entrenador-16.png"))); // NOI18N
        jMenuItem4.setText("Registrar Entrenador");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-usuario-color-16.png"))); // NOI18N
        jMenuItem14.setText("Registrar Cliente");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-productos-32.png"))); // NOI18N
        jMenu2.setText("Productos");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-producto-16.png"))); // NOI18N
        jMenuItem2.setText("Registrar Producto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-categoría-16 (1).png"))); // NOI18N
        jMenuItem5.setText("Agregar Categoria");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-proveedor-16.png"))); // NOI18N
        jMenuItem15.setText("Proveedores");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem15);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-rutina-de-ejercicio-32.png"))); // NOI18N
        jMenu3.setText("Secciones de entrenamiento");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-rutina-de-ejercicio-16 (1).png"))); // NOI18N
        jMenuItem3.setText("Registrar Seccion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-corona-externa-en-forma-de-flor-membresía-premium-logotipo-recompensas-light-tal-revivo-32.png"))); // NOI18N
        jMenu6.setText("Membresia");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-membresía-externa-en-línea-con-corona-y-recompensas-de-cinta-sola-shadow-tal-revivo-16.png"))); // NOI18N
        jMenuItem8.setText("Ver Membresias");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-tarjeta-de-membresia-16.png"))); // NOI18N
        jMenuItem9.setText("Registrar Membresias");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-registros-16.png"))); // NOI18N
        jMenuItem12.setText("Boleta de menbresia");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenuBar1.add(jMenu6);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-ventas-32.png"))); // NOI18N
        jMenu5.setText("Ventas  y Pagos");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItem11.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\icons8-ventas-16.png")); // NOI18N
        jMenuItem11.setText("Registrar venta");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBar1.add(jMenu5);

        jMenu4.setBackground(new java.awt.Color(153, 0, 0));
        jMenu4.setForeground(new java.awt.Color(204, 0, 0));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cerca-32.png"))); // NOI18N
        jMenu4.setText("Cerrar");
        jMenu4.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //Instanciar
         SubFormCategoriaProducto categoria_producto = new SubFormCategoriaProducto(); 
         categoria_producto.setVisible(true); //abre la ventana de dashboard
         dashboard_menu.add(categoria_producto);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       RegistrarProduc producto = new RegistrarProduc();
       producto.setVisible(true);
        dashboard_menu.add(producto);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        RegistrarEntrenador entrenador = new RegistrarEntrenador();
        entrenador.setVisible(true);
         dashboard_menu.add(entrenador);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        RegistrarSeccion seccion = new RegistrarSeccion();
        seccion.setVisible(true);
        dashboard_menu.add(seccion);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
       Membresia menbresia = new Membresia();
       menbresia.setVisible(true);
       dashboard_menu.add(menbresia);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
     
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
  RegistrarVoletaM boleta = new    RegistrarVoletaM();
  boleta.setVisible(true);
   dashboard_menu.add(boleta);
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
               FormLogin login = new FormLogin();
        login.setVisible(true); //visible el login
        login.pack(); //que se ajuste a los tamaños de la ventana
        login.setLocationRelativeTo(null); // se centra en el medio
         login.setSize(476, 540);
        
        //Eliminando la ventana dashboard
        this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        RegistrarUsuario1 cliente1 = new RegistrarUsuario1();
        cliente1.setVisible(true); //abre la ventana de dashboard
        dashboard_menu.add(cliente1);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
      Proveedores prove = new Proveedores();
      prove.setVisible(true) ;
        dashboard_menu.add(prove);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       Venta ve = new Venta();
       ve.setVisible(true);
        dashboard_menu.add(ve);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelHora;
    // End of variables declaration//GEN-END:variables


    class fondopanel extends JPanel{

private Image  Imagen;
 @Override 
 public void paint (Graphics g)
 {
 Imagen = new   ImageIcon(getClass().getResource("/img/gym.gif")).getImage();
 g.drawImage(Imagen, 0, 0, getWidth(),getHeight(),this);
 
 setOpaque(false);

 super.paint(g);
 }
}


}
