package com.chainsys.stockmanagement;

import java.sql.SQLException;
import java.util.Scanner;

public class TestStock extends StockMethods {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Scanner TestStock = new Scanner(System.in);
		StockMethods sm = new StockMethods();
		DbMethods db = new DbMethods();

		System.out.println("Stock Management System of ABC Store\n");

		System.out.println("1 ---> New User\n2 ---> Already a User\nChoose User Type : ");
		int userType = TestStock.nextInt();

		while (userType != 1 && userType != 2 && userType != 3 && userType != 4) {
			System.out.println("Enter The Valid Number : ");
			userType = TestStock.nextInt();
		}

		if (userType == 1) {
			UserRegister.write();
		} else if (userType == 2) {
			System.out.println("Enter UserName : ");
			String userName = TestStock.next();
			System.out.println("Enter Password : ");
			String password = TestStock.next();

			while (!userDetailsRead(userName, password)) {
				System.err.println("Wrong UserName or PassWord");
				System.out.println("Enter UserName Again: ");
				userName = TestStock.next();
				System.out.println("Enter Password Again: ");
				password = TestStock.next();
			}
			System.out.println("LoggedIN Successfully\n");
			System.out.println(
					"1 ---> View Stock\n2 ---> Add Stock\n3 ---> Remove Stock\n4 ---> Add Stock Details\n5 ---> View Stock Details");
			int choose = TestStock.nextInt();
			while (choose != 1 && choose != 2 && choose != 3 && choose != 4 && choose != 5) {
				System.out.println("Enter The Valid Number : ");
				choose = TestStock.nextInt();
			}

			if (choose == 1) {
				System.out.println("\nChoose The Department");
				System.out.println("1 ---> Mobile\n2 ---> Fruits\n3 ---> Jewellery");
				int opt = TestStock.nextInt();
				while (opt != 1 && opt != 2 && opt != 3) {
					System.out.println("Enter The Valid Number : ");
					opt = TestStock.nextInt();
				}

				if (opt == 1) {
					System.out.println("\nChoose The Mobile To View Stock");

					db.readStock(101, 200);
					int mobileOpt = TestStock.nextInt();

					while (mobileOpt != 1 && mobileOpt != 2 && mobileOpt != 3 && mobileOpt != 4) {
						System.out.println("Enter The Valid Number : ");
						mobileOpt = TestStock.nextInt();
					}

					if (mobileOpt == 1) {
						System.out.println("The Stock of Asus is : " + sm.asus());

						System.err.println("The Current Available Stock is : " + (sm.asus() + sm.update("Asus")));
					} else if (mobileOpt == 2) {
						System.out.println("The Stock of Vivo is : " + sm.vivo());
						System.out.println("The Current Available Stock is : " + (sm.vivo() + sm.update("Vivo")));
					} else if (mobileOpt == 3) {
						System.out.println("The Stock of Samsung is : " + sm.samsung());
						System.out.println("The Current Available Stock is : " + (sm.samsung() + sm.update("Samsung")));
					}

				} else if (opt == 2) {
					System.out.println("\nChoose The Fruits To View Stock");

					db.readStock(201, 300);
					int fruitOpt = TestStock.nextInt();

					while (fruitOpt != 1 && fruitOpt != 2 && fruitOpt != 3) {
						System.out.println("Enter The Valid Number : ");
						fruitOpt = TestStock.nextInt();
					}

					if (fruitOpt == 1) {
						System.out.println("The Stock of Apple(kgs) is : " + sm.apple());
						System.out
								.println("The Current Available Stock(kgs) is : " + (sm.apple() + sm.update("Apple")));
					} else if (fruitOpt == 2) {
						System.out.println("The Stock of Mango(kgs) is : " + sm.mango());
						System.out
								.println("The Current Available Stock(kgs) is : " + (sm.mango() + sm.update("Mango")));

					} else if (fruitOpt == 3) {
						System.out.println("The Stock of Grapes(kgs) is : " + sm.grapes());
						System.out.println(
								"The Current Available Stock(kgs) is : " + (sm.grapes() + sm.update("Grapes")));
					}

				} else if (opt == 3) {
					System.out.println("\nChoose The Jewel To View Stock");

					db.readStock(301, 400);
					int jewelOpt = TestStock.nextInt();

					while (jewelOpt != 1 && jewelOpt != 2 && jewelOpt != 3) {
						System.out.println("Enter The Valid Number : ");
						jewelOpt = TestStock.nextInt();
					}

					if (jewelOpt == 1) {
						System.out.println("The Stock of Chain is : " + sm.chain());
						System.out.println("The Current Available Stock is : " + (sm.chain() + sm.update("Chain")));
					} else if (jewelOpt == 2) {
						System.out.println("The Stock of Ring is : " + sm.ring());
						System.out.println("The Current Available Stock is : " + (sm.ring() + sm.update("Ring")));

					} else if (jewelOpt == 3) {
						System.out.println("The Stock of Bracelet is : " + sm.bracelet());
						System.out
								.println("The Current Available Stock is : " + (sm.bracelet() + sm.update("Bracelet")));
					}

				}
			} else if (choose == 2) {
				System.out.println("Choose The Department To Add Stock\n");

				System.out.println("1 ---> Mobile\n2 ---> Fruits\n3 ---> Jewellery");

				int depChoose = TestStock.nextInt();

				while (depChoose != 1 && depChoose != 2 && depChoose != 3 && depChoose != 0) {
					System.out.println("Enter The Valid Number : ");
					depChoose = TestStock.nextInt();
				}

				if (depChoose == 1) {
					System.out.println("---Add Stock of Mobiles---");
					System.out.println("Enter The Name of the Product to Update Stock : ");
					String proName = TestStock.next();
					sm.sqlAddStock(proName);

				}

			} else if (choose == 3) {

				System.out.println("1 ---> To Remove Stock\n2 ---> To Clear Stock Details");
				int removeCategory = TestStock.nextInt();

				while (removeCategory != 1 && removeCategory != 2) {
					System.out.println("Enter The Valid Number : ");
					removeCategory = TestStock.nextInt();
				}

				if (removeCategory == 1) {

					System.out.println("Choose The Department To Remove Stock\n");

					System.out.println("1 ---> Mobile\n2 ---> Fruits\n3 ---> Jewellery");
					int removeChoose = TestStock.nextInt();

					while (removeChoose != 1 && removeChoose != 2 && removeChoose != 3) {
						System.out.println("Enter The Valid Number : ");
						removeChoose = TestStock.nextInt();
					}

					if (removeChoose == 1) {
						sm.delete("D:\\Mobiles.txt");
						System.out.println("---Stocks Removed---");
					} else if (removeChoose == 2) {
						sm.delete("D:\\Fruits.txt");
						System.out.println("---Stocks Removed---");
					} else if (removeChoose == 3) {
						sm.delete("D:\\Jewellery.txt");
						System.out.println("---Stocks Removed---");
					}
				} else if (removeCategory == 2) {
					System.out.println("Choose The Department To Remove Details\n");

					System.out.println("1 ---> MobileDetails\n2 ---> FruitsDetails\n3 ---> JewelleryDetails");
					int removeChoose = TestStock.nextInt();

					while (removeChoose != 1 && removeChoose != 2 && removeChoose != 3) {
						System.out.println("Enter The Valid Number : ");
						removeChoose = TestStock.nextInt();
					}

					if (removeChoose == 1) {
						sm.delete("D:\\MobilesDetails.txt");
						System.out.println("---Details Removed---");
					} else if (removeChoose == 2) {
						sm.delete("D:\\FruitsDetails.txt");
						System.out.println("---Details Removed---");
					} else if (removeChoose == 3) {
						sm.delete("D:\\JewelleryDetails.txt");
						System.out.println("---Details Removed---");
					}
				}
				TestStock.close();
			} else if (choose == 4) {

				System.out.println("Choose The Department To Add the Details\n");
				System.out.println("1 ---> Mobile\n2 ---> Fruits\n3 ---> Jewellery");

				int addDetails = TestStock.nextInt();

				while (addDetails != 1 && addDetails != 2 && addDetails != 3) {
					System.out.println("Enter The Valid Number : ");
					addDetails = TestStock.nextInt();
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

			}

		}

	}

}
