/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.Entrenador;

/**
 *
 * @author user
 */
public class ControllerEntrenador {
        public Boolean guardarEntrenador(Entrenador objeto) {
        boolean respuesta = false;
        //Variable de conexion / Instanciar la conexion
        Connection cn = conexion.Conexion.conectar();
        try {
            //Instanciamos el preparedStatement
            String sql = "insert into entrenador value(?,?,?,?,?,?,?)"; 
            PreparedStatement insertarEntrenador = cn.prepareStatement(sql); //Ejecutamos el SQL
            // invocamos la variable con la clase MODELO/CATEGORIAPRODUCTO
          insertarEntrenador.setInt(1, objeto.getDni_E());
             insertarEntrenador.setString(2, objeto.getNombre());
             insertarEntrenador.setString(3, objeto.getApellido()); 
              insertarEntrenador.setString(4, objeto.getTelefono()); 
              insertarEntrenador.setString(5, objeto.getEmail()); 
               insertarEntrenador.setString(6, objeto.getDireccio());
                insertarEntrenador.setString(7, objeto.getExperiencia()); 
            if( insertarEntrenador.executeUpdate() > 0){ // Si hay un registro núevo comprobamos
                respuesta = true; //true - respuesta correcta
            }
             cn.close(); //Cerramos la conexion
        } catch (SQLException e) {
           System.out.println("Error al guardar Entrenador"+e);
        }
        return respuesta;
    }
}

    

