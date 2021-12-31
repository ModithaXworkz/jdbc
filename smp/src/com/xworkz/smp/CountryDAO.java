package com.xworkz.smp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CountryDAO {
	public boolean save(CountryDTO dto) {
	Connection connection =null;
	try {
		Class.forName(Conn.DRIVERCLASS);
		connection=DriverManager.getConnection(Conn.URL, Conn.username, Conn.password);
		String str="insert into con value("+dto.getId()+",'"+dto.getName()+"','"+dto.getCode()+"','"+dto.getContinent()+"')";
		Statement stm= connection.createStatement();
		int row=  stm.executeUpdate(str);
		if(row==1) {
			return true;
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
		
		return false;
		
	}

	public boolean delete(int id) {
		Connection connection=null;
		try {
			Class.forName(Conn.DRIVERCLASS);
			connection=DriverManager.getConnection(Conn.URL, Conn.username, Conn.password);
			String str="delete from con where id="+id;
			Statement stm=connection.createStatement();
			int row=stm.executeUpdate(str);
			if (row==1) {
				return true;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
}