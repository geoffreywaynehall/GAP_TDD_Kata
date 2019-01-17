package com.icc.gap.kata.models;

import java.util.HashMap;
import java.util.Map;

public class Checkout {
	
	private Map<Item, Integer> items = new HashMap<Item, Integer>();
	
	private PricingRules pricingRules;
	
	public Checkout (PricingRules pricingRules) {
		if(null == pricingRules) {
			throw new IllegalArgumentException("pricingRules is null");
		}
		this.pricingRules = pricingRules;
	}
	
	public boolean scan(Item item) {
		if(null == item){
			throw new IllegalArgumentException("item is null");
		}
		if(null == item.getSku()) {
			throw new IllegalArgumentException("item sku is null");
		}
		if(0 >= item.getUnitPrice()) {
			throw new IllegalArgumentException("item unit price is not valid");
		}
		if(null == this.items.get(item)) {
			this.items.put(item, 0);
		}
		this.items.put(item, this.items.get(item)+1);
		return true;
	}
	
	public int total() {
		return pricingRules.total(items);
	}
	
}
