package controllers;
import java.sql.*;
import models.CategoriaProducto;
public class ControllerCategoriaP {
    //Creamos un metodo guardar categoria producto
    public Boolean guardarCategoria(CategoriaProducto objeto) {
        boolean respuesta = false;
        //Variable de conexion / Instanciar la conexion
        Connection cn = conexion.Conexion.conectar();
        try {
            //Instanciamos el preparedStatement
            String sql = "insert into categoria value(?,?)"; 
            PreparedStatement insertarCategoria = cn.prepareStatement(sql); //Ejecutamos el SQL
            // invocamos la variable con la clase MODELO/CATEGORIAPRODUCTO
            insertarCategoria.setInt(1, 0);
            insertarCategoria.setString(2, objeto.getNombre_categoria());
            if(insertarCategoria.executeUpdate() > 0){ // Si hay un registro núevo comprobamos
                respuesta = true; //true - respuesta correcta
            }
             cn.close(); //Cerramos la conexion
        } catch (SQLException e) {
           System.out.println("Error al guardar categoria"+e);
        }
        return respuesta;
    }

}

