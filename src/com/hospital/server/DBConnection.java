package com.hospital.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	Connection con = null;
	ResultSet rs;
	Statement st;	
		public static Connection dBConnector(){
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost/questionnaire", "root", "");
				System.out.print("Connected database ");
				
				return con;

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
				
				return null;
			}
		}
}
