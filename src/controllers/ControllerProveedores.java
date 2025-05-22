
package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.ProveedoresM;


public class ControllerProveedores {
            public Boolean guardarProveedor(ProveedoresM objeto) {
        boolean respuesta = false;
        //Variable de conexion / Instanciar la conexion
        Connection cn = conexion.Conexion.conectar();
        try {
            //Instanciamos el preparedStatement
            String sql = "insert into proveedor value(?,?,?,?,?)"; 
            PreparedStatement insertarProveedor = cn.prepareStatement(sql); //Ejecutamos el SQL
            // invocamos la variable con la clase MODELO/CATEGORIAPRODUCTO
          insertarProveedor.setString(1, objeto.getRuc());
            insertarProveedor.setString(2, objeto.getNombre());
             insertarProveedor.setString(3, objeto.getTelefono()); 
             insertarProveedor.setString(4, objeto.getEmail()); 
              insertarProveedor.setString(5, objeto.getDireccio()); 
            if(insertarProveedor.executeUpdate() > 0){ // Si hay un registro núevo comprobamos
                respuesta = true; //true - respuesta correcta
            }
             cn.close(); //Cerramos la conexion
        } catch (SQLException e) {
           System.out.println("Error al guardar Proveedor"+e);
        }
        return respuesta;
    }
        
}
