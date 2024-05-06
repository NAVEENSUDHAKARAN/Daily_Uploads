package com.chainsys.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.dao.*;
import com.chainsys.dao.UserRegister;
import com.chainsys.model.StockPojo;

public class TestStock extends StockMethods {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner TestStock = new Scanner(System.in);
		DbMethods dbm = new DbMethods();
		ProductManagement pm = new ProductManagement();
		UserEndManagement usm = new UserEndManagement();
		StockPojo pojo =new StockPojo();
		
		System.out.println("1 ---> ProductManager\n2 ---> Customer");
		int type = TestStock.nextInt();
		
		if(type == 1)
		{
			System.out.println("Stock Management System of ABC Store\n");

			System.out.println("1 ---> New User\n2 ---> Already a User\nChoose User Type : ");
			int userType = TestStock.nextInt();

			while (userType != 1 && userType != 2) {
				System.err.println("Enter The Valid Number : ");
				userType = TestStock.nextInt();
			}

			if (userType == 1) {
				System.out.println("Enter the Admin Name : ");
				String adminName = TestStock.next();
				pojo.setAdminName(adminName);
				System.out.println("Enter the Admin Password : ");
				int adminPassword = TestStock.nextInt();
				pojo.setPassword(adminPassword);
				
				dbm.insertUserCred(pojo);
				
			} else if (userType == 2) {
				System.out.println("Enter UserName : ");
				String userName = TestStock.next();
				System.out.println("Enter Password : ");
				int password = TestStock.nextInt();

				while (!dbm.readUserCred(userName, password)) {
					System.err.println("Wrong UserName or PassWord");
					System.out.println("Enter UserName Again: ");
					userName = TestStock.next();
					System.out.println("Enter Password Again: ");
					password = TestStock.nextInt();
				}
				System.out.println("LoggedIN Successfully\n");

				pm.productManagement();
			}
		}
		else if(type == 2)
		{
			usm.userEndManagement();
		}

	}

}
