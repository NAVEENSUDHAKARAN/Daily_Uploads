package com.chainsys.stockmanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DbMethods {

	public static void insert() throws ClassNotFoundException, SQLException {
		
		ConnectUtil connect = new ConnectUtil();
		Connection connection = connect.getConnection();
		
		String query = "insert into stock values (\"NAVEEN\", \"Grapes\", 7654321, 34, 65000, 60000, \"Madurai\")";
		
		PreparedStatement prepareStatement = connection.prepareStatement(query);

		int rows = prepareStatement.executeUpdate();
		
		System.out.println(rows);
	}
	
	public static void read() throws ClassNotFoundException, SQLException {
		ConnectUtil connect = new ConnectUtil();
		Connection connection = connect.getConnection();
		
		String query = "select * from stock";
		PreparedStatement prepareStatement = connection.prepareStatement(query);

		ResultSet rows = prepareStatement.executeQuery();
		
		ResultSetMetaData metaData = rows.getMetaData();
		int columnCount = metaData.getColumnCount();
		System.out.println(columnCount);
		for(int i=1; i<=columnCount; i+=1)
		{
			System.out.print(metaData.getColumnName(i)+" ");
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
	
	public static void update() throws ClassNotFoundException, SQLException {
		ConnectUtil connect = new ConnectUtil();
		Connection connection = connect.getConnection();
		
		String query = "update stock set Product_Name = 'Silver' where Quantity = 12";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		
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
