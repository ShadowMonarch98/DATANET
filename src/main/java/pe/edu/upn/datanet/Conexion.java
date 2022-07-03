/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upn.datanet;

import DATANET.GIU.INTERFAZ;
import DATANET.GIU.OPCIONES.EXITOSO;
import DATANET.GIU.OPCIONES.NO_EXITOSO;
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
            //JOptionPane.showMessageDialog(null, "Se ha realizado la conexion correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, error: " + e.toString());
        }

        return conectar;
    }

    public int ejecutarSentenciaSQL(String strSentenciaSQL) {
        EXITOSO f= new EXITOSO();
        NO_EXITOSO nf= new NO_EXITOSO();
        try {
            conectar = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DATANET;user=proyecto;password=root");
            PreparedStatement pstm = conectar.prepareStatement(strSentenciaSQL);
            pstm.execute();
            f.setVisible (true);
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            nf.setVisible (true);
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
    
    public int Login(String User, String Pass){
        int resultado = 0;
        
        try {
            conectar = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DATANET;user=proyecto;password=root");
            Statement ejecutor = conectar.createStatement();
            ResultSet rs = ejecutor.executeQuery("SELECT * FROM EMPLEADO WHERE User_Empleado='"+User+"' and Password_Empleado='"+Pass+"'");
            
            if (rs.next()) {
                //JOptionPane.showMessageDialog(null,"Bienvenidos");
                resultado = 1;
            }else{
                //JOptionPane.showMessageDialog(null,"PROBLEMAS CON USUARIO Y/O CONTRASEÑA");
                resultado = 0;
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR AL CONECTAR");
        }
        
        return resultado;
    }
}
