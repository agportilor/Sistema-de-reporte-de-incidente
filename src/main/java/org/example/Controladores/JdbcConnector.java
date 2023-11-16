package org.example.Controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnector {
    private static Connection con = null;
    private JdbcConnector() {}
    public static Connection getConnection() {
        if(con == null) {
            try {
                createConnection();
                return con;
            }catch(SQLException | ClassNotFoundException ex){
                System.out.println("Error durante la creación de la conexion a la base de datos.");
                ex.printStackTrace();
            }
        }
        return con;
    }
    private static void createConnection() throws ClassNotFoundException, SQLException {
        String pwd = "root";
        String usr= "root";
        String api = "jdbc";
        String db = "mysql";
        String serverName = "localhost";
        String port = "3306";
        String dbName = "reportes";
        String url =  api + ":" + db + "://" + serverName + ":" + port + "/" + dbName;
        Class.forName("com.mysql.jdb.Driver");
        con = DriverManager.getConnection(url,usr,pwd);
    }
}