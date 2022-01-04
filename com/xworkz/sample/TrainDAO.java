package com.xworkz.sample.statement.train;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.mysql.cj.x.protobuf.MysqlxSession.Reset;

public class TrainDAO {
	public boolean save(TrainDTO dto) {
		Connection connection = null;
		connection = SQLUtil.creatConnection();

		try {
			String str = "insert into tra values(?,?,?,?,?,?,?,?)";

			PreparedStatement stm = connection.prepareStatement(str);
			stm.setInt(1, dto.getId());
			stm.setString(1, dto.getName());
			stm.setString(1, dto.getNo());
			stm.setString(1, dto.getSeatNo());
			stm.setString(1, dto.getDestination());
			stm.setString(1, dto.getBoarding());
			stm.setInt(1, dto.getPrice());
			stm.setString(1, dto.getKlass());

			int row = stm.executeUpdate(str);
			if (row == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean deleteByNo(String no) {
		Connection connection = null;
		connection = SQLUtil.creatConnection();
		try {
			String str = "delete from tra where no=?";
			Statement stm = connection.createStatement();
			int row = stm.executeUpdate(str);
			if (row == 1) {

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		return false;

	}

	public boolean deleteByNoAndId(String no, int id) {
		Connection connection = null;
		connection = SQLUtil.creatConnection();
		String str = "delete from tra where no=" + no + " and  id=" + id;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(str);
			preparedStatement.setObject(1, no);
			preparedStatement.setObject(2, id);
			return preparedStatement.executeUpdate()>0? true:false;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	public TrainDTO getByNo(String no) {
		Connection connection = null;

		try {
			connection = SQLUtil.creatConnection();
			String str = "select * from tra where no=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			preparedStatement.setObject(1, no);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				TrainDTO d = new TrainDTO();
				d.setId(resultSet.getInt(1));
				d.setName(resultSet.getString(2));
				d.setNo(resultSet.getString(3));
				d.setSeatNo(resultSet.getString(4));
				d.setDestination(resultSet.getString(5));
				d.setBoarding(resultSet.getString(6));
				d.setPrice(resultSet.getInt(7));
				d.setKlass(resultSet.getString(8));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public Collection<TrainDTO> getAll(TrainDTO dto) {
		Connection connection = null;

		try {
			connection = SQLUtil.creatConnection();
			Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
			String str = "select * from tra";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDTO d = new TrainDTO();
				d.setId(resultSet.getInt(1));
				d.setName(resultSet.getString(2));
				d.setNo(resultSet.getString(3));
				d.setSeatNo(resultSet.getString(4));
				d.setDestination(resultSet.getNString(5));
				d.setBoarding(resultSet.getString(6));
				d.setPrice(resultSet.getInt(7));
				d.setKlass(resultSet.getString(8));
				collection.add(d);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public Collection<TrainDTO> getAllByBording(String boarding) {
		Connection connection = null;

		try {

			connection = SQLUtil.creatConnection();
			Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
			String str = "select * from tra value bording=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				
			TrainDTO d = new TrainDTO();
			d.setId(resultSet.getInt(1));
			d.setName(resultSet.getString(2));
			d.setNo(resultSet.getString(3));
			d.setSeatNo(resultSet.getString(4));
			d.setDestination(resultSet.getString(5));
			d.setBoarding(resultSet.getString(str));
			d.setPrice(resultSet.getInt(7));
			d.setKlass(resultSet.getString(8));
			collection.add(d);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public Collection<TrainDTO> AllByDestination(String destination) {
		Connection connection = null;

		try {
			connection = SQLUtil.creatConnection();
			Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
			String str = "select * from tra value destination=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				
			TrainDTO d = new TrainDTO();
			d.setId(resultSet.getInt(1));
			d.setName(resultSet.getString(2));
			d.setNo(resultSet.getString(3));
			d.setSeatNo(resultSet.getString(4));
			d.setDestination(resultSet.getString(5));
			d.setBoarding(resultSet.getString(str));
			d.setPrice(resultSet.getInt(7));
			d.setKlass(resultSet.getString(8));
			collection.add(d);}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}
public static boolean updateDestinationByNo(String newDest,String No) {
	Connection connection = null;

	try {
		connection=SQLUtil.creatConnection();
		String str="update tra set destination=? where no=?";
		PreparedStatement preparedStatement=connection.prepareStatement(str);
		preparedStatement.setObject(1, newDest);
		preparedStatement.setObject(2, No);
		return preparedStatement.executeLargeUpdate()>0 ? true:false;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
	
}
public boolean updateDestinationAndBoardingByNo(String no,String newDest,String newBoarding) {
	Connection connection=null;
	
	try {
		connection=SQLUtil.creatConnection();
		String str="update tra set destination=? and boarding=? where no=?";
		PreparedStatement preparedStatement=connection.prepareStatement(str);
		preparedStatement.setObject(1, newDest);
		preparedStatement.setObject(2, no);
		preparedStatement.setObject(3, newBoarding);
		return preparedStatement.executeUpdate()>0 ? true:false;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return false;
	
}
public int getTotal() {
	Connection connection=null;
	int total=0;
	
	try {
		connection=SQLUtil.creatConnection();
		String str="select  count(*) from tra";
		PreparedStatement preparedStatement=connection.prepareStatement(str);
		ResultSet res= preparedStatement.executeQuery();
		while (res.next()) {
			total=res.getInt(1);
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return total;
}
public double getMaxPrice() {
	Connection connection=null;
	double maxPrice=0;
	
	try {
		connection=SQLUtil.creatConnection();
		String str="select max(price) from tra";
		PreparedStatement preparedStatement=connection.prepareStatement(str);
		ResultSet res= preparedStatement.executeQuery();
		while (res.next()) {
			maxPrice=res.getDouble(1);
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return maxPrice;
}
public double getMinPrice() {
	Connection connection=null;
	double minPrice=0;
	
	try {
		connection=SQLUtil.creatConnection();
		String str="select min(price) from tra";
		PreparedStatement preparedStatement=connection.prepareStatement(str);
		ResultSet res= preparedStatement.executeQuery();
		while (res.next()) {
			minPrice=res.getDouble(1);
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return minPrice;
}
}