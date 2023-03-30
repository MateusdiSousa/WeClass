/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Mateus
 */
public class ConecctionFactory {
   public Connection getConnection(){
        String url = "jdbc:mysql://localhost/weclass";
        try {
            Connection conn = DriverManager.getConnection(url, "root", "");
            JOptionPane.showMessageDialog(null,"Conex�o aberta");
            return conn;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de Conex�o "+e.getMessage());
        }
        return null;
    }
}
