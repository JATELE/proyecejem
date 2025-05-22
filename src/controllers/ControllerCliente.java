/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;
import java.sql.*;
import models.Cliente;


public class ControllerCliente {
          public Boolean guardarCliente(Cliente objeto) {
        boolean respuesta = false;
        //Variable de conexion / Instanciar la conexion
        Connection cn = conexion.Conexion.conectar();
        try {
            //Instanciamos el preparedStatement
            String sql = "insert into cliente value(?,?,?,?,?,?,?,?,?)"; 
            PreparedStatement insertarCliente = cn.prepareStatement(sql); //Ejecutamos el SQL
            // invocamos la variable con la clase MODELO/CATEGORIAPRODUCTO
          insertarCliente.setInt(1, objeto.getDni_c());
            insertarCliente.setString(2, objeto.getNombre());
            insertarCliente.setString(3, objeto.getApellido()); 
             insertarCliente.setString(4, objeto.getTelefono()); 
             insertarCliente.setString(5, objeto.getEmail()); 
              insertarCliente.setString(6, objeto.getDireccio());
               insertarCliente.setString(7, objeto.getFecha_nacimiento()); 
                insertarCliente.setInt(8, objeto.getDni_e()); 
                 insertarCliente.setInt(9, objeto.getId_membresia()); 
            if(insertarCliente.executeUpdate() > 0){ // Si hay un registro núevo comprobamos
                respuesta = true; //true - respuesta correcta
            }
             cn.close(); //Cerramos la conexion
        } catch (SQLException e) {
           System.out.println("Error al guardar cliente"+e);
        }
        return respuesta;
    }
        
       
       
    }
        
       


    
    

