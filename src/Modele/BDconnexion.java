/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class BDconnexion {
        public String driver = "com.mysql.jdbc.Driver";
	public String url = "jdbc:mysql://localhost:3306/pointvente";
	public String user = "root";
	public String password = "nabil";
	public Connection con;
	public Statement stm;
        
        	public void bdConnexion(){
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException ex) {
			System.out.println("Probleme Driver");
		}
		try {
			con = DriverManager.getConnection(url,user,password);
			stm = con.createStatement();
		}catch(SQLException e) {
			System.out.println("probleme de connexion");
		}
                }
	 
    

}
