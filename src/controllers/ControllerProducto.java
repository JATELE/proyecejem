/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.ProductoR;


public class ControllerProducto {
            public Boolean guardarProducto(ProductoR objeto) {
        boolean respuesta = false;
        //Variable de conexion / Instanciar la conexion
        Connection cn = conexion.Conexion.conectar();
        try {
            //Instanciamos el preparedStatement
            String sql = "insert into producto value(?,?,?,?,?,?,?)"; 
            PreparedStatement insertarProducto = cn.prepareStatement(sql); //Ejecutamos el SQL
            // invocamos la variable con la clase MODELO/CATEGORIAPRODUCTO
          insertarProducto.setInt(1, 0);
             insertarProducto.setString(2, objeto.getDescripcion());
             insertarProducto.setDouble(3, objeto.getPrecio()); 
              insertarProducto.setInt(4, objeto.getNumero_de_existencia()); 
              insertarProducto.setInt(5, objeto.getStock_minimo()); 
               insertarProducto.setInt(6, objeto.getId_categoria());
                insertarProducto.setString(7, objeto.getRuc()); 
            if( insertarProducto.executeUpdate() > 0){ // Si hay un registro núevo comprobamos
                respuesta = true; //true - respuesta correcta
            }
             cn.close(); //Cerramos la conexion
        } catch (SQLException e) {
           System.out.println("Error al guardar Producto"+e);
        }
        return respuesta;
    }
}
    
    

