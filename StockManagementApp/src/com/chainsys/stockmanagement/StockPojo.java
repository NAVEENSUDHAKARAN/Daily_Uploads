package com.chainsys.stockmanagement;

public class StockPojo {

	String productName, location, stockHolderName, barcode;
	int QuantityofStock;
	double costPrice, sellingPrice;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStockHolderName() {
		return stockHolderName;
	}

	public void setStockHolderName(String stockHolderName) {
		this.stockHolderName = stockHolderName;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public int getQuantityofStock() {
		return QuantityofStock;
	}

	public void setQuantityofStock(int quantityofStock) {
		QuantityofStock = quantityofStock;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double cp) {
		this.costPrice = cp;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	@Override
	public String toString() {
		return "StockPojo [productName=" + productName + ", location=" + location + ", stockHolderName="
				+ stockHolderName + ", barcode=" + barcode + ", QuantityofStock=" + QuantityofStock + ", costPrice="
				+ costPrice + ", sellingPrice=" + sellingPrice + "]";
	}

}
