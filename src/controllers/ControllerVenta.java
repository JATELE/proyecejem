/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.VentaV;


public class ControllerVenta {
   public Boolean guardaVenta(VentaV objeto) {
    boolean respuesta = false;
    // Variable de conexión / Instanciar la conexión
    Connection cn = conexion.Conexion.conectar();
    
    try {
        // Instanciamos el preparedStatement
        String sql = "INSERT INTO venta (fecha_de_compra, monto, precio_final, dni_c, id_membresia, id_metodo, fecha_pago) VALUES (?, ?, ?, ?, ?, ?, NOW())";
        PreparedStatement insertarVenta = cn.prepareStatement(sql); // Ejecutamos el SQL

        // Asignamos valores sin incluir ID, porque es AUTO_INCREMENT
        insertarVenta.setString(1, objeto.getFecha_de_compra());
        insertarVenta.setDouble(2, objeto.getMonto());
        insertarVenta.setDouble(3, objeto.getPrecio_final());
        insertarVenta.setInt(4, objeto.getDni_c());
        insertarVenta.setInt(5, objeto.getId_membresia());
        insertarVenta.setInt(6, objeto.getId_metodo());

        // Si hay un registro nuevo, confirmamos
        if (insertarVenta.executeUpdate() > 0) { 
            respuesta = true;
        }
        
        cn.close(); // Cerramos la conexión
    } catch (SQLException e) {
        System.out.println("Error al guardar Venta: " + e);
    }
    
    return respuesta;
}

}
