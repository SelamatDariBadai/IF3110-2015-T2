/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author adar
 */
public class DB {
    public static Connection connect() throws ClassNotFoundException, SQLException {
        // Database driver and URL
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/stackexchange?zeroDateTimeBehavior=convertToNull";
        
        // Database user
        String username = "root";
        String pass = "";
        
        
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, username, pass);
        
        return conn;
    }
}
