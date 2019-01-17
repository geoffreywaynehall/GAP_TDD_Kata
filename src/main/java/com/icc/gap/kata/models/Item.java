package com.icc.gap.kata.models;

public class Item {

	private String sku;
	private int unitPrice;
	
	public Item() {
		
	}
	
	public Item(String sku, int unitPrice) {
		this.sku = sku;
		this.unitPrice = unitPrice;
	}
	
	public String getSku() {
		return this.sku;
	}

	public int getUnitPrice() {
		return this.unitPrice;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

}
