package com.icc.gap.kata.models;

import java.util.HashMap;
import java.util.Map;

import com.icc.gap.kata.utils.RuleNames;

public class PricingRules {

	private Map<String, Rule> rules = new HashMap<String, Rule>();
	
	public PricingRules () {
		
	}
	
	public boolean add(Item item, Rule rule) {
		try {
			RuleNames.class.getDeclaredField(rule.getRuleName());
			this.rules.put(rule.getItemSku(), rule);
		}
		catch (Exception e) {
			return false;
		}
		return true;
	}

	public int total(Map<Item, Integer> items) {
		int total = 0;
		for (Map.Entry<Item, Integer> entry : items.entrySet()) {
			Item item = entry.getKey();
			int quantity = entry.getValue();
			if(this.rules.get(item.getSku()) != null) {
				total += nForX(item, quantity, this.rules.get(item.getSku()));
			}
			else {
				total += item.getUnitPrice() * quantity;
			}
		}
		return total;
	}
	
	private int nForX(Item item, int quantity, Rule rule) {
		int total = 0;
		total = rule.getSpecialPrice() * Math.floorDiv(quantity, rule.getSpecialQuantity());
		total += item.getUnitPrice() * (quantity % rule.getSpecialQuantity());
		return total;
	}
		
	
}
