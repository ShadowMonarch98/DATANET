/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upn.datanet;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Màximo
 */
public class Conexion {

    Connection conectar = null;
    Statement stmt = null;
    //stmt = conectar.createStatement();

    public Connection establecerconexion() {

        try {
            Driver d = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            conectar = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DATANET;user=proyecto;password=root");
            JOptionPane.showMessageDialog(null, "Se ha realizado la conexion correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, error: " + e.toString());
        }

        return conectar;
    }

    public int ejecutarSentenciaSQL(String strSentenciaSQL) {
        
        try {
            conectar = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DATANET;user=proyecto;password=root");
            PreparedStatement pstm = conectar.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            conectar = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DATANET;user=proyecto;password=root");
            PreparedStatement pstm = conectar.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
