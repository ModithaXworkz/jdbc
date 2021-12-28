package com.xworkz.sample;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JarNovitiator {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Created dbs");
			String url="jdbc:mysql://localhost:3306";
			String userName="root";
			String pass="Modi@235";
			Connection conn=DriverManager.getConnection(url,userName,pass);
			if (!conn.isClosed()) {
				System.out.println("Connection created");
			String	insertSql= "insert into order.order_details value(2,'Tappu',2)";
			 Statement st=conn.createStatement();
			 int rowAffected=st.executeUpdate(insertSql);
			System.out.println(rowAffected); 
				
			}
		} 
		
			
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	

}
