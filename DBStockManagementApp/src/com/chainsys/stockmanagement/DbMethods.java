package com.chainsys.stockmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DbMethods {
	
	
	public void insert(StockPojo pojo) throws ClassNotFoundException, SQLException {
		
		ConnectUtil connect = new ConnectUtil();
		Connection connection = connect.getConnection();
		
		String query = "insert into Add_Stock_Details values (?,?,?,?,?)";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		
		prepareStatement.setInt(1, pojo.getId());
		prepareStatement.setString(2, pojo.getProductName());
		prepareStatement.setInt(3, pojo.getNumberOfStock());
		prepareStatement.setString(4, pojo.getStockedDate());
		prepareStatement.setDouble(5, pojo.getCostPrice());

		int rows = prepareStatement.executeUpdate();
		
		System.out.println("Rows Affected : " + rows);
		System.out.println("Inserted To DB!!!");
	}
	
	public static void read(int id) throws ClassNotFoundException, SQLException {
		ConnectUtil connect = new ConnectUtil();
		Connection connection = connect.getConnection();
		
		String query = "select * from Add_Stock_Details where ID = ?";
		PreparedStatement prepareStatement = connection.prepareStatement(query);

		prepareStatement.setInt(1, id);
		
		ResultSet rows = prepareStatement.executeQuery();
		
		ResultSetMetaData metaData = rows.getMetaData();
		int columnCount = metaData.getColumnCount();
		System.out.println(columnCount);
		for(int i=1; i<=columnCount; i+=1)
		{
			System.out.print(metaData.getColumnName(i)+" \t ");
		}
		System.out.println();
		
		
		while(rows.next())
		{
			for(int i=1; i<=columnCount; i+=1)	
			{
				System.out.print(rows.getString(i) +"\t\t");
			}
			System.out.println();
		}
	}
	
	public static void readStock(int id1, int id2) throws ClassNotFoundException, SQLException {
		ConnectUtil connect = new ConnectUtil();
		Connection connection = connect.getConnection();
		
		String query = "select * from Add_Stock_Details where ID >= ? and ID < ?";
		PreparedStatement prepareStatement = connection.prepareStatement(query);

		prepareStatement.setInt(1, id1);
		prepareStatement.setInt(2, id2);
		
		ResultSet rows = prepareStatement.executeQuery();
		
		ResultSetMetaData metaData = rows.getMetaData();
		int columnCount = metaData.getColumnCount();
		System.out.println(columnCount);
		for(int i=1; i<=columnCount; i+=1)
		{
			System.out.print(metaData.getColumnName(i)+" \t ");
		}
		System.out.println();
		
		
		while(rows.next())
		{
			for(int i=1; i<=columnCount; i+=1)	
			{
				System.out.print(rows.getString(i) +"\t\t");
			}
			System.out.println();
		}
	}
	
	public static int retrieveStock(String str) throws SQLException, ClassNotFoundException {
		ConnectUtil connect = new ConnectUtil();
		Connection connection = connect.getConnection();
		
		String query = "select Number_of_Stock from Add_Stock_Details where Product_Name = ?";
		PreparedStatement prepareStatement = connection.prepareStatement(query);

		prepareStatement.setString(1, str);
		
		ResultSet rows = prepareStatement.executeQuery();
		
		ResultSetMetaData metaData = rows.getMetaData();
		int columnCount = metaData.getColumnCount();
				
		while(rows.next())
		{
			for(int i=1; i<=columnCount; i+=1)	
			{
				return rows.getInt(i);
			}
			System.out.println();
		}
		return 0;
	}
	
	public static void updateDb(int updatedStock, String name) throws ClassNotFoundException, SQLException {
		ConnectUtil connect = new ConnectUtil();
		Connection connection = connect.getConnection();
		
		String query = "update Add_Stock_Details set Number_of_Stock = ? where Product_Name = ?";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		prepareStatement.setInt(1, updatedStock);
		prepareStatement.setString(2, name);
		int rows = prepareStatement.executeUpdate();
		
		System.out.println("Rows Affected : " + rows);
		
	}
	
	public static void delete() throws ClassNotFoundException, SQLException {
		ConnectUtil connect = new ConnectUtil();
		Connection connection = connect.getConnection();
		
		String query = "delete from stock where Product_Name = 'Mango'";
		
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		
		int rows = prepareStatement.executeUpdate();
		System.out.println("Rows Affected : " + rows);
		
	}
}
