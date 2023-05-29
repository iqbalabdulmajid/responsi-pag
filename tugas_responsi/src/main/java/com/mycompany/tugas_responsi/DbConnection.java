/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_responsi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Iqbal Abdul Majid
 */
public class DbConnection {
     private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/responsi";
    private final String USER = "root";
    private final String PASS = "";

    public Connection conn;
    public void connection() throws ClassNotFoundException, SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }
    
    public Statement openConnection() throws SQLException{
        return conn.createStatement();
    }
    
}
