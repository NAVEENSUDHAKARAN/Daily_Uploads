package com.chainsys.dao;

import java.sql.SQLException;
import java.util.Scanner;

public class ProductManagement {

	public static void productManagement() throws ClassNotFoundException, SQLException {

		Scanner productManagement = new Scanner(System.in);
		StockMethods sm = new StockMethods();
		DbMethods db = new DbMethods();
		ValidationChecker check = new ValidationChecker();

		boolean run = true;

		while (run) {
			System.out.println(
					"1 ---> View Stock\n2 ---> Add Stock\n3 ---> Remove Stock\n4 ---> Add Stock Details\n5 ---> View Stock Details\n6 ---> Quit");
			int choose = productManagement.nextInt();
			while (choose != 1 && choose != 2 && choose != 3 && choose != 4 && choose != 5 && choose != 6) {
				System.err.println("Enter The Valid Number : ");
				choose = productManagement.nextInt();
			}

			if (choose == 1) {
				System.out.println("\nChoose The Department");
				System.out.println("1 ---> Mobile\n2 ---> Fruits\n3 ---> Jewellery\nq ---> Quit");
				int opt = productManagement.nextInt();
				while (opt != 1 && opt != 2 && opt != 3 && opt != 'q') {
					System.err.println("Enter The Valid Number : ");
					opt = productManagement.nextInt();
				}

				if(opt == 'q')
				{
					break;
				}
				else if (opt == 1) {
					System.out.println("\nChoose The Mobile To View Stock");

					db.readStock(101, 200);
				} else if (opt == 2) {
					System.out.println("\nChoose The Fruits To View Stock");

					db.readStock(201, 300);

				} else if (opt == 3) {
					System.out.println("\nChoose The Jewel To View Stock");

					db.readStock(301, 400);

				}
			} else if (choose == 2) {
				System.out.println("Choose The Department To Add Stock\n");

				System.out.println("1 ---> Mobile\n2 ---> Fruits\n3 ---> Jewellery");

				int depChoose = productManagement.nextInt();

				while (depChoose != 1 && depChoose != 2 && depChoose != 3) {
					System.err.println("Enter The Valid Number : ");
					depChoose = productManagement.nextInt();
				}

				if (depChoose == 1) {
					System.out.println("---Add Stock of Mobiles---");
					db.readStock(101, 200);
					System.out.println("Enter The Name of the Product to Update Stock : ");
					String proName = productManagement.next();
					while (!check.str(proName)) {
						System.err.println("Invalid Data\nEnter The Name of the Product to Update Stock Again: ");
						proName = productManagement.next();
					}
					while (!db.validRead(proName)) {
						System.err.println("Invalid Data\nAgain Enter The Product Name to Update Stock : ");
						proName = productManagement.next();
					}
					sm.sqlAddStock(proName);
				} else if (depChoose == 2) {
					System.out.println("---Add Stock of Fruits---");
					db.readStock(201, 300);
					System.out.println("Enter The Name of the Product to Update Stock : ");
					String proName = productManagement.next();
					while (!check.str(proName)) {
						System.err.println("Invalid Data\nEnter The Name of the Product to Update Stock Again: ");
						proName = productManagement.next();
					}
					sm.sqlAddStock(proName);
				} else if (depChoose == 3) {
					System.out.println("---Add Stock of Jewels---");
					db.readStock(301, 400);
					System.out.println("Enter The Name of the Product to Update Stock : ");
					String proName = productManagement.next();
					while (!check.str(proName)) {
						System.err.println("Invalid Data\nEnter The Name of the Product to Update Stock Again: ");
						proName = productManagement.next();
					}
					sm.sqlAddStock(proName);
				}

			} else if (choose == 3) {

				System.out.println("Choose The Department To Remove Stock\n");

				System.out.println("1 ---> Mobile\n2 ---> Fruits\n3 ---> Jewellery");
				int removeChoose = productManagement.nextInt();

				while (removeChoose != 1 && removeChoose != 2 && removeChoose != 3) {
					System.err.println("Enter The Valid Number : ");
					removeChoose = productManagement.nextInt();
				}

				if (removeChoose == 1) {
					db.readStock(101, 200);
					sm.sqlRemoveStock();
					System.out.println("---Stocks Removed---");
				} else if (removeChoose == 2) {
					db.readStock(201, 300);
					sm.sqlRemoveStock();
					System.out.println("---Stocks Removed---");
				} else if (removeChoose == 3) {
					db.readStock(301, 400);
					sm.sqlRemoveStock();
					System.out.println("---Stocks Removed---");
				}
			}

			else if (choose == 4) {

				System.out.println("Choose The Department To Add the Details\n");
				System.out.println("1 ---> Mobile\n2 ---> Fruits\n3 ---> Jewellery");

				int addDetails = productManagement.nextInt();

				while (addDetails != 1 && addDetails != 2 && addDetails != 3) {
					System.err.println("Enter The Valid Number : ");
					addDetails = productManagement.nextInt();
				}

				if (addDetails == 1) {
					sm.sqlDetailsWrite();

					System.out.println("---Details Updated---");
				} else if (addDetails == 2) {

					sm.sqlDetailsWrite();

					System.out.println("---Details Updated---");
				} else if (addDetails == 3) {
					sm.sqlDetailsWrite();
					System.out.println("---Details Updated---");
				}

			} else if (choose == 5) {

				sm.sqlDetailsRead();

			} else if (choose == 6) {
				run = false;
			}

		}
	}
}
