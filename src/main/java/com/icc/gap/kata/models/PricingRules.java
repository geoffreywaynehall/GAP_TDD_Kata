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
			total += nForX(entry.getKey(), entry.getValue(), this.rules.get(entry.getKey().getSku()));
		}
		return total;
	}
	
	private int nForX(Item item, int quantity, Rule rule) {
		int total = 0;
		total = item.getUnitPrice() * quantity;
		return total;
	}
		
	
}
