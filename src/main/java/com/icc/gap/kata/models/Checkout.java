package com.icc.gap.kata.models;

public class Checkout {
	
	public boolean scan(Item item) {
		if(null == item.getSku() || 0 >= item.getUnitPrice()) {
			return false;
		}
		return true;
	}
	
	public int total() {
		return 0;
	}
	
}
