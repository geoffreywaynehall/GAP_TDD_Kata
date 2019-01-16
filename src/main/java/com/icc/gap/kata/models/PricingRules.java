package com.icc.gap.kata.models;

import java.util.Map;

import com.icc.gap.kata.utils.RuleNames;

public class PricingRules {

	public PricingRules () {
		
	}
	
	public boolean add(Item item, Rule rule) {
		try {
			RuleNames.class.getDeclaredField(rule.getRuleName());
		}
		catch (Exception e) {
			return false;
		}
		return true;
	}

	public int total(Map<Item, Integer> items) {
		
		return nForX();
	}
	
	private int nForX() {
		return 50;
	}
		
	
}
