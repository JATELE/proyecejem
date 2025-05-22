/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.Seccion;

public class ControllerSeccion {
        public Boolean guardarSeccion(Seccion objeto) {
        boolean respuesta = false;
        //Variable de conexion / Instanciar la conexion
        Connection cn = conexion.Conexion.conectar();
        try {
 String sql = "INSERT INTO seccion_entrenamiento VALUES (?,?,?,?,?)";
        PreparedStatement insertarSeccion = cn.prepareStatement(sql);
        insertarSeccion.setInt(1, 0);
        insertarSeccion.setString(2, (objeto.getFecha())); 
        insertarSeccion.setString(3 ,objeto.getDuracion());
        insertarSeccion.setInt(4, objeto.getDni_E());
        insertarSeccion.setInt(5, objeto.getDni_C());

        if (insertarSeccion.executeUpdate() > 0) { 
            respuesta = true;
        }
        cn.close();
    } catch (SQLException e) {
        System.out.println("Error al guardar Seccion: " + e);
    }
    
    return respuesta;
    }
    
}
