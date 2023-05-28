
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection con=null;
        try{
        
            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Shahab@996");
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        return con;
    }
}
