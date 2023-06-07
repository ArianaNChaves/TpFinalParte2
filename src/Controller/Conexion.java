package Controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariana
 */
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost/";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static final String DATABASE_NAME = "dbfravemax";
    
    private static Connection connection;

    private Conexion(){
        
    }
    
    public static Connection getConnection() {
        if(connection == null) {
            try {
                connection = DriverManager.getConnection(URL + DATABASE_NAME, USUARIO, PASSWORD);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return connection;
    }
}

