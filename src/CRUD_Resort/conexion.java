
package CRUD_Resort;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Oscar Caceres y Henry Fiallos
 */
public class conexion {
    Connection con;
    public Connection Conectar(){
        String url="jdbc:mysql://localhost:3306/hotel";
        String user="root";
        String pass="";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        return con;
    }
}
