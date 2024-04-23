package com.chainsys.stockmanagement;

import java.util.Scanner;

public class StockMethods {

	Scanner stockMethods = new Scanner(System.in);
	StringBuilder strBuilder = new StringBuilder();

	public void stockDetails(StockPojo pojo) {
		strBuilder.append("Name : " + pojo.getStockHolderName()).append("\nProduct Name : " + pojo.getProductName())
				.append("\nBarcode : " + pojo.getBarcode()).append("\nQuantity of Stock : " + pojo.getQuantityofStock())
				.append("\nCost Price : " + pojo.getCostPrice()).append("\nSelling Price : " + pojo.getSellingPrice())
				.append("\nLocation : " + pojo.getLocation());

		System.out.println(strBuilder);
	}

	public void lowStock() {
		System.out.println("Your Stock Quantity is Below 10 Consider Buying !!!");
	}

	public int update(String name) {
		int addStock = 0;
		System.out.println("Do You Want to Update The " + name + " Stock (Y or N) : ");
		String yn = stockMethods.next();
		if (yn.toLowerCase().equals("y")) {
			System.out.println("Enter The Amount of Stocks to Add : ");
			addStock = stockMethods.nextInt();

		}
		return addStock;
	}

	public int asus() {

		int asusStock = 10;

		return asusStock;
	}

	public int vivo() {

		int vivoStock = 15;

		return vivoStock;
	}

	public int samsung() {

		int samsungStock = 20;

		return samsungStock;
	}

	public int apple() {

		int stock = 5;

		return stock;
	}

	public int mango() {

		int stock = 7;

		return stock;
	}

	public int grapes() {

		int stock = 8;

		return stock;
	}

	public int chain() {

		int stock = 70;

		return stock;
	}

	public int ring() {

		int stock = 55;

		return stock;
	}

	public int bracelet() {

		int stock = 75;

		return stock;
	}
}
