package com.icc.gap.kata.models;

public class Rule {
	String itemName;
	String ruleName;
	int specialQuantity;
	int specialPrice;
	
	public Rule(String itemName, String ruleName, int specialQuantity, int specialPrice) {
		this.itemName = itemName;
		this.ruleName = ruleName;
		this.specialQuantity = specialQuantity;
		this.specialPrice = specialPrice;
	}
	
}
