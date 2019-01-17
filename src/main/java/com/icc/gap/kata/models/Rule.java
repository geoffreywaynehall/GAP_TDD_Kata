package com.icc.gap.kata.models;

public class Rule {
	private String itemSku;
	private String ruleName;
	private int specialQuantity;
	private int specialPrice;
	
	public Rule(String itemSku, String ruleName, int specialQuantity, int specialPrice) {
		this.itemSku = itemSku;
		this.ruleName = ruleName;
		this.specialQuantity = specialQuantity;
		this.specialPrice = specialPrice;
	}

	public String getItemSku() {
		return this.itemSku;
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public int getSpecialQuantity() {
		return this.specialQuantity;
	}

	public int getSpecialPrice() {
		return this.specialPrice;
	}
	
}
