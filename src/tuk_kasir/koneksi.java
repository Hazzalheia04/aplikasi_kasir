/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuk_kasir;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author acer
 */
public class koneksi {
   Connection koneksi=null;
  public static Connection Koneksidb(){
  try {
     Class.forName("com.mysql.jdbc.Driver");
     Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir","root","");
     return koneksi;
  
  }
  catch(Exception e){
  JOptionPane.showMessageDialog(null, e);
  return null;
  }
  }
}