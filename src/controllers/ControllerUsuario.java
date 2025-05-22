package controllers;
import conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import models.Usuario;
public class ControllerUsuario {
    public boolean loginUser(Usuario objeto){ //Metodo para iniciar sesión
    boolean respuesta = false;
    Connection con = Conexion.conectar();
    String sql = "SELECT usuario, password FROM tb_usuario "
                + "WHERE usuario = '"+objeto.getUsuario()+"' and password = '"+objeto.getPassword()+"' ";
    Statement st;
    try{
        st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){ respuesta = true; }
    }catch(SQLException e){
       System.out.println("Error al iniciar sesión" + e);
       JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
    }
    return respuesta;
    }
}
