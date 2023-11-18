package org.example.Controladores;

import java.sql.*;
import java.sql.DriverManager;

public class JdbcConnector {
    private static Connection con = null;
    private JdbcConnector() {}
    public static Connection getConnection() {
        if (con != null) { return con; }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","root","password");
        } catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}