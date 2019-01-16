package com.icc.gap.kata.models;

public class Rule {
	private String itemName;
	private String ruleName;
	private int specialQuantity;
	private int specialPrice;
	
	public Rule(String itemName, String ruleName, int specialQuantity, int specialPrice) {
		this.itemName = itemName;
		this.ruleName = ruleName;
		this.specialQuantity = specialQuantity;
		this.specialPrice = specialPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public String getRuleName() {
		return ruleName;
	}

	public int getSpecialQuantity() {
		return specialQuantity;
	}

	public int getSpecialPrice() {
		return specialPrice;
	}
	
}
