package com.chainsys.stockmanagement;

import java.util.Scanner;

public class TestStock extends StockMethods {

	public static void main(String[] args) {

		Scanner TestStock = new Scanner(System.in);
		MethodAbstracts ma = new MethodAbstracts();
		StockMethods sm = new StockMethods();
		ValidationChecker check = new ValidationChecker();

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
					// System.out.println("1 ---> Asus\n2 ---> Vivo\n3 ---> Samsung");
					StockMethods.read("D:\\Mobiles.txt");
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
					// System.out.println("1 ---> Apple\n2 ---> Mango\n3 ---> Grapes");
					StockMethods.read("D:\\Fruits.txt");
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
					// System.out.println("1 ---> Chain\n2 ---> Ring\n3 ---> Bracelet");
					StockMethods.read("D:\\Jewellery.txt");
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

				while (depChoose == 1 || depChoose == 2 || depChoose == 3 || depChoose == 0) {
					if (depChoose == 1) {
						System.out.println("---Add Stock of Mobiles---");
						StockMethods.write("D:\\Mobiles.txt");
					} else if (depChoose == 2) {
						System.out.println("---Add Stock of Fruits---");
						StockMethods.write("D:\\Fruits.txt");
					} else if (depChoose == 3) {
						System.out.println("---Add Stock of Jewellery---");
						StockMethods.write("D:\\Jewellery.txt");
					} else if (depChoose == 0) {
						break;
					}
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
					StockMethods.detailsWrite("D:\\MobilesDetails.txt");
					System.out.println("---Details Updated---");
				} else if (addDetails == 2) {
					StockMethods.detailsWrite("D:\\FruitsDetails.txt");
					System.out.println("---Details Updated---");
				} else if (addDetails == 3) {
					StockMethods.detailsWrite("D:\\JewelleryDetails.txt");
					System.out.println("---Details Updated---");
				}

			} else if (choose == 5) {
				System.out.println("1 ---> MobileDetails\n2 ---> FruitsDetails\n3 ---> JewelleryDetails");
				int chooseDep = TestStock.nextInt();

				if (chooseDep == 1) {
					StockMethods.read("D:\\Mobiles.txt");
					System.out.println("Enter The Mobile Name To View Details : ");
					String chooseDetails = TestStock.next();

					while (!check.str(chooseDetails)) {
						System.err.println("Invalid Data\nEnter The Mobile Name To View Details Again : ");
						chooseDetails = TestStock.next();
					}

					if (chooseDetails.equals(sm.retrieveStockName("D:\\MobilesDetails.txt", chooseDetails))) {
						ma.readStockDetails("D:\\MobilesDetails.txt", chooseDetails);
					}
				} else if (chooseDep == 2) {
					StockMethods.read("D:\\Fruits.txt");
					System.out.println("Enter The Fruit Name To View Details : ");
					String chooseDetails = TestStock.next();

					while (!check.str(chooseDetails)) {
						System.err.println("Invalid Data\nEnter The Fruit Name To View Details Again : ");
						chooseDetails = TestStock.next();
					}
					System.out.println("--------");

					if (chooseDetails.equals(sm.retrieveStockName("D:\\FruitsDetails.txt", chooseDetails))) {

						ma.readStockDetails("D:\\FruitsDetails.txt", chooseDetails);
					}
				} else if (chooseDep == 3) {
					StockMethods.read("D:\\Jewellery.txt");
					System.out.println("Enter The Jewel Name To View Details : ");
					String chooseDetails = TestStock.next();

					while (!check.str(chooseDetails)) {
						System.err.println("Invalid Data\nEnter The Jewel Name To View Details Again : ");
						chooseDetails = TestStock.next();
					}

					if (chooseDetails.equals(sm.retrieveStockName("D:\\JewelleryDetails.txt", chooseDetails))) {
						ma.readStockDetails("D:\\JewelleryDetails.txt", chooseDetails);
					}
				}

			}

		}

//		System.out.println("Enter Your Name : ");
//		String stockHolderName = TestStock.next();
//		pojo.setStockHolderName(stockHolderName);
//		pojo.getStockHolderName();
//		while(!check.str(stockHolderName))
//		{
//			System.out.println("Invalid Data\nEnter Your Name Again: ");
//			stockHolderName = TestStock.next();
//		}

//		System.out.println("Enter The product Name : ");
//		String productName = TestStock.next();
//		while(!check.str(productName))
//		{
//			System.out.println("Invalid Data\nEnter The Product Name Again: ");
//			productName = TestStock.next();
//		}	

//		System.out.println("Enter the Barcode : ");
//		String barcode = TestStock.next();
//		int bar = Integer.parseInt(barcode);
//		while(!check.Numerics(bar))
//		{
//			System.out.println("Invalid Data\nEnter the Barcode Again : ");
//			barcode = TestStock.next();
//			
//		}
//		while(barcode.length() != 7)
//		{
//			System.out.println("The Barcode Will only contains 7 Number\nEnter the Barcode Again : ");
//			barcode = TestStock.next();
//		}
//		
//		System.out.println("Enter The Quantity of Stock : ");
//		int qos = TestStock.nextInt();
//		while(!check.Numerics(qos))
//		{
//			System.out.println("Invalid Data\nEnter The Quantity of Stock : ");
//			qos = TestStock.nextInt();
//		}
//		
//		System.out.println("Enter The Cost Price : ");
//		double cp = TestStock.nextDouble();
//		while(!check.doubles(cp))
//		{
//			System.out.println("Invalid Data\nEnter The Cost Price Again : ");
//			cp = TestStock.nextDouble();
//		}
//		
//		System.out.println("Enter The Selling Price : ");
//		double sp = TestStock.nextDouble();
//		while(!check.doubles(sp))
//		{
//			System.out.println("Invalid Data\nEnter The Selling Price Again : ");
//			sp = TestStock.nextDouble();
//		}
//		
//		System.out.println("Enter The Location : ");
//		String location = TestStock.next();
//		while(!check.str(location))
//		{
//			System.out.println("Invalid Data\nEnter The Location Again : ");
//			location = TestStock.next();
//		}
//		
//		pojo.setStockHolderName(stockHolderName);
//		pojo.setProductName(productName);
//		pojo.setBarcode(barcode);
//		pojo.setQuantityofStock(qos);
//		pojo.setCostPrice(cp);
//		pojo.setSellingPrice(sp);
//		pojo.setLocation(location);
//		
//		sm.stockDetails(pojo);
//		while(pojo.getQuantityofStock() < 10)
//		{
//			sm.lowStock();
//			System.out.println("Want To Buy Stock : ");
//			String ch = TestStock.next();
//			if(ch.equals("Y") || ch.equals("y"))
//			{ 
//				System.out.println("Add Stock : ");
//				int add = TestStock.nextInt();
//				
//				add = add + qos;
//				System.out.println("The Total Stock is : " + add);
//				break;
//			}
//			else
//			{
//				break;
//			}
//		}
//		TestStock.close();
	}

}
