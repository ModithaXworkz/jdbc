package com.xworkz.icecream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IcecreamDAO {
	public boolean save(IcecreamDTO dto) {
		Connection connection =null;
		try {
			Class.forName(Ice.DRIVECLASS);
		
			connection =DriverManager.getConnection(Ice.URL, Ice.USERNAME, Ice.PASSWORD);
			String str="insert into ice value("+dto.getId()+",'"+dto.getName()+"','"+dto.getFlavour()+"',"+dto.getRate()+")";
			Statement stm=connection.createStatement();
			int row= stm.executeUpdate(str);
			if(row==1) {
				return true;
			}
	}
			catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	public boolean delete(int id) {
		Connection connection=null;
		try {
			Class.forName(Ice.DRIVECLASS);
			connection = DriverManager.getConnection(Ice.URL, Ice.USERNAME, Ice.PASSWORD);
			String str="delete from ice where id="+id;
			Statement stm=connection.createStatement();
			int row=stm.executeUpdate(str);
			if(row==1) {
				return true;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}