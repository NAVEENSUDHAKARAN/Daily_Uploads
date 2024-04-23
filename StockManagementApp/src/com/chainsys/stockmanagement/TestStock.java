package com.chainsys.stockmanagement;

import java.util.Scanner;

public class TestStock extends StockMethods {

	public static void main(String[] args)
	{
		StockPojo pojo = new StockPojo();
		Scanner TestStock = new Scanner(System.in);
		ValidationChecker check = new ValidationChecker();
		StockMethods sm = new StockMethods();
		
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
		
		System.out.println("Stock Management System of ABC Store");
		System.out.println("\nChoose The Department");
		System.out.println("1 ---> Mobile\n2 ---> Fruits\n3 ---> Jewellery");
		int opt = TestStock.nextInt();
		while(opt != 1 && opt != 2 && opt != 3)
		{
			System.out.println("Enter The Valid Number : ");
			opt = TestStock.nextInt();
		}
		
		if(opt == 1)
		{
			System.out.println("\nChoose The Mobile To View Stock");
			System.out.println("1 ---> Asus\n2 ---> Vivo\n3 ---> Samsung");
			int mobileOpt = TestStock.nextInt();
			
			while(mobileOpt != 1 && mobileOpt != 2 && mobileOpt != 3)
			{
				System.out.println("Enter The Valid Number : ");
				mobileOpt = TestStock.nextInt();
			}
			
			if(mobileOpt == 1)
			{
				System.out.println("The Stock of Asus is : " + sm.asus());
				System.out.println("The Current Available Stock is : " + (sm.asus() + sm.update("Asus")));
			}
			else if(mobileOpt == 2)
			{
				System.out.println("The Stock of Vivo is : " + sm.vivo());
				System.out.println("The Current Available Stock is : " + (sm.vivo() + sm.update("Vivo")));
			}
			else if(mobileOpt == 3)
			{
				System.out.println("The Stock of Samsung is : " + sm.samsung());
				System.out.println("The Current Available Stock is : " + (sm.samsung() + sm.update("Samsung")));
			}

		}
		else if(opt == 2)
		{
			System.out.println("\nChoose The Fruits To View Stock");
			System.out.println("1 ---> Apple\n2 ---> Mango\n3 ---> Grapes");
			int fruitOpt = TestStock.nextInt();
			
			while(fruitOpt != 1 && fruitOpt != 2 && fruitOpt != 3)
			{
				System.out.println("Enter The Valid Number : ");
				fruitOpt = TestStock.nextInt();
			}
			
			if(fruitOpt == 1)
			{
				System.out.println("The Stock of Apple(kgs) is : " + sm.apple());
				System.out.println("The Current Available Stock(kgs) is : " + (sm.apple() + sm.update("Apple")));
			}
			else if(fruitOpt == 2)
			{
				System.out.println("The Stock of Mango(kgs) is : " + sm.mango());
				System.out.println("The Current Available Stock(kgs) is : " + (sm.mango() + sm.update("Mango")));
				
			}
			else if(fruitOpt == 3)
			{
				System.out.println("The Stock of Grapes(kgs) is : " + sm.grapes());
				System.out.println("The Current Available Stock(kgs) is : " + (sm.grapes() + sm.update("Grapes")));
			}
			
		}
		else if(opt == 3)
		{
			System.out.println("\nChoose The Jewel To View Stock");
			System.out.println("1 ---> Chain\n2 ---> Ring\n3 ---> Bracelet");
			int jewelOpt = TestStock.nextInt();
			
			while(jewelOpt != 1 && jewelOpt != 2 && jewelOpt != 3)
			{
				System.out.println("Enter The Valid Number : ");
				jewelOpt = TestStock.nextInt();
			}
			
			if(jewelOpt == 1)
			{
				System.out.println("The Stock of Chain is : " + sm.chain());
				System.out.println("The Current Available Stock is : " + (sm.chain() + sm.update("Chain")));
			}
			else if(jewelOpt == 2)
			{
				System.out.println("The Stock of Ring is : " + sm.ring());
				System.out.println("The Current Available Stock is : " + (sm.ring() + sm.update("Ring")));
				
			}
			else if(jewelOpt == 3)
			{
				System.out.println("The Stock of Bracelet is : " + sm.bracelet());
				System.out.println("The Current Available Stock is : " + (sm.bracelet() + sm.update("Bracelet")));
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
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
