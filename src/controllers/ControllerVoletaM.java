/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexion.Conexion;
import models.BoletaM;
public class ControllerVoletaM {
    
    public boolean guardarBoletaMembresia(BoletaM boleta) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            String sql = "INSERT INTO boleta_membresia VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, 0); // ID autoincremental
            ps.setString(2, boleta.getFecha_inicio());
            ps.setString(3, boleta.getFecha_final());
            ps.setInt(4, boleta.getId_membresia());
            ps.setInt(5, boleta.getDni_c());

            if (ps.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar boleta de membresía: " + e);
        }

        return respuesta;
    }
}

