package com.xworkz.state;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.smp.Conn;

public class StateDAO {
	public boolean save(StateDTO dto) {
		Connection connection =null;
		
		try {
			Class.forName(Conn.DRIVERCLASS);
			connection=DriverManager.getConnection(Stat.url, Stat.username, Stat.password);
			String str="insert into stt value("+dto.getId()+",'"+dto.getName()+"',"+dto.getCode()+",'"+dto.getCapital()+"')";
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

	public boolean delete(int id) {
		Connection connection=null;
		try {
		Class.forName(Conn.DRIVERCLASS);
		connection=DriverManager.getConnection(Stat.url, Stat.username, Stat.password);
		String str ="delete from stt whereid="+id;
		Statement stm=connection.createStatement();
		int row=stm.executeUpdate(str);
		if(row==1) {
			return true;
		}
		}
		catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		return false;
		}
		
	}