package conexion;
import java.sql.*;
public class Conexion {
    //Variables de la base de datos
    static String url = "jdbc:mysql://localhost:3306/Gym";
    static String user = "root";
    static String pass = "";
    public static Connection conectar(){
        Connection con = null;
        try{
            //Metodo que extablece la conexion
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("¡Conexion Exitosa!");
        }catch(SQLException e){
            System.out.println("Error "+ e.getMessage());
        }
        return con;
    }
}
