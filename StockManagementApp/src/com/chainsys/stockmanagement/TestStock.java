package com.chainsys.stockmanagement;

import java.util.Scanner;

public class TestStock extends StockMethods {

	public static void main(String[] args)
	{
		StockPojo pojo = new StockPojo();
		Scanner TestStock = new Scanner(System.in);
		ValidationChecker check = new ValidationChecker();
		StockMethods sm = new StockMethods();
		
		System.out.println("Enter Your Name : ");
		String stockHolderName = TestStock.next();
		pojo.setStockHolderName(stockHolderName);
		while(!check.str(stockHolderName))
		{
			System.out.println("Invalid Data\nEnter Your Name Again: ");
			stockHolderName = TestStock.next();
		}
		
		System.out.println("Enter The product Name : ");
		String productName = TestStock.next();
		while(!check.str(productName))
		{
			System.out.println("Invalid Data\nEnter The Product Name Again: ");
			productName = TestStock.next();
		}
		
		System.out.println("Enter the Barcode : ");
		String barcode = TestStock.next();
		int bar = Integer.parseInt(barcode);
		while(!check.Numerics(bar))
		{
			System.out.println("Invalid Data\nEnter the Barcode Again : ");
			barcode = TestStock.next();
			
		}
		while(barcode.length() != 7)
		{
			System.out.println("The Barcode Will only contains 7 Number\nEnter the Barcode Again : ");
			barcode = TestStock.next();
		}
		
		System.out.println("Enter The Quantity of Stock : ");
		int qos = TestStock.nextInt();
		while(!check.Numerics(qos))
		{
			System.out.println("Invalid Data\nEnter The Quantity of Stock : ");
			qos = TestStock.nextInt();
		}
		
		System.out.println("Enter The Cost Price : ");
		double cp = TestStock.nextDouble();
		while(!check.doubles(cp))
		{
			System.out.println("Invalid Data\nEnter The Cost Price Again : ");
			cp = TestStock.nextDouble();
		}
		
		System.out.println("Enter The Selling Price : ");
		double sp = TestStock.nextDouble();
		while(!check.doubles(sp))
		{
			System.out.println("Invalid Data\nEnter The Selling Price Again : ");
			sp = TestStock.nextDouble();
		}
		
		System.out.println("Enter The Location : ");
		String location = TestStock.next();
		while(!check.str(location))
		{
			System.out.println("Invalid Data\nEnter The Location Again : ");
			location = TestStock.next();
		}
		
		pojo.setStockHolderName(stockHolderName);
		pojo.setProductName(productName);
		pojo.setBarcode(barcode);
		pojo.setQuantityofStock(qos);
		pojo.setCostPrice(cp);
		pojo.setSellingPrice(sp);
		pojo.setLocation(location);
		
		sm.stockDetails(pojo);
		while(pojo.getQuantityofStock() < 10)
		{
			sm.lowStock();
			System.out.println("Want To Buy Stock : ");
			String ch = TestStock.next();
			if(ch.equals("Y") || ch.equals("y"))
			{ 
				System.out.println("Add Stock : ");
				int add = TestStock.nextInt();
				
				add = add + qos;
				System.out.println("The Total Stock is : " + add);
				break;
			}
			else
			{
				break;
			}
		}
		TestStock.close();
	}

	
}
