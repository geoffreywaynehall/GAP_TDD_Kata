package com.icc.gap.kata.models;

import com.icc.gap.kata.utils.RuleNames;

public class PricingRules {

	public PricingRules () {
		
	}
	
	public boolean add(Item item, String ruleName) {
		try {
			RuleNames.class.getDeclaredField(ruleName);
		}
		catch (Exception e) {
			return false;
		}
		return true;
	}
		
	
}
