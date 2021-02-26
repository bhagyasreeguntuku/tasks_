package com.src.model;




public class Product {
	
	

	private int productId;
	private String productName;
	private long productPrice;
	
	

	private Customer c;


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public long getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}


	public Customer getC() {
		return c;
	}


	public void setC(Customer c) {
		this.c = c;
	}
	
	
	
	
	
	
	
}