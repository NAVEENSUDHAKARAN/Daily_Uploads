package com.chainsys.stockmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ConnectUtil {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		DbMethods dbm = new DbMethods();
		
		dbm.insert();
		
//		dbm.update();
//		dbm.delete();
//		dbm.read();
	}
	
		public static Connection getConnection() throws ClassNotFoundException, SQLException{
			
			Class .forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1234");
			
			return connection;
		}
}
