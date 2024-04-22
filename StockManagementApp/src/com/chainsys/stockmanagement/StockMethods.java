package com.chainsys.stockmanagement;

public class StockMethods {

	StringBuilder strBuilder = new StringBuilder();
		
	public void stockDetails(StockPojo pojo) {
		strBuilder.append("Name : " + pojo.getStockHolderName()).append("\nProduct Name : " + pojo.getProductName())
					.append("\nBarcode : " + pojo.getBarcode()).append("\nQuantity of Stock : " + pojo.getQuantityofStock()).append("\nCost Price : " + pojo.getCostPrice()).append("\nSelling Price : " + pojo.getSellingPrice()).append("\nLocation : " + pojo.getLocation());		
		
		System.out.println(strBuilder);
	}
	
	
	public void lowStock() {
			System.out.println("Your Stock Quantity is Below 10 Consider Buying !!!");
	}
	
	
}
