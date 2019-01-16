package com.icc.gap.kata;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.icc.gap.kata.models.Checkout;
import com.icc.gap.kata.models.Item;
import com.icc.gap.kata.models.PricingRules;
import com.icc.gap.kata.models.Rule;
import com.icc.gap.kata.utils.RuleNames;

public class CheckoutTests {

	Checkout checkout;
	Item badItem;
	Item item;
	PricingRules pricingRules;
	Rule rule;
	
	@Before
	public void initialize() {
		checkout = new Checkout();
		item = new Item("A", 50);
		rule = new Rule("A", RuleNames.N_FOR_X, 3, 130);
		pricingRules = new PricingRules();
	}
	
	@Test
	public void scanBlankItem() {
		badItem = new Item();
		Assert.assertFalse(checkout.scan(badItem));
	}
	
	@Test
	public void scanNullSkuItem() {
		badItem = new Item(null, 50);
		Assert.assertFalse(checkout.scan(badItem));
	}
	
	@Test
	public void scanNegetiveUnitPriceItem() {
		badItem = new Item("A", -50);
		Assert.assertFalse(checkout.scan(badItem));
	}
	
	@Test
	public void createItemWithPrice() {
		Assert.assertNotNull(item);
	}
	
	@Test
	public void getItemSku() {
		Assert.assertEquals("A", item.getSku());
	}
	
	@Test
	public void getItemUnitPrice() {
		Assert.assertEquals(50, item.getUnitPrice());
	}
	
	@Test
	public void createPricingRules() {
		Assert.assertNotNull(pricingRules);
	}
	
	@Test
	public void createRule() {
		Assert.assertNotNull(rule);
	}
	
	@Test
	public void addItemRule() {
		Assert.assertTrue(pricingRules.add(item, rule));
	}
	
	@Test
	public void pricingRulesTotal() {
		Map<Item, Integer> items = new HashMap<Item, Integer>();
		items.put(item, 1);
		Assert.assertTrue(pricingRules.add(item, rule));
		Assert.assertEquals(50, pricingRules.total(items));
	}
	
	@Test
	public void pricingRulesTotalMultipleItems() {
		Map<Item, Integer> items = new HashMap<Item, Integer>();
		items.put(item, 2);
		Assert.assertTrue(pricingRules.add(item, rule));
		Assert.assertEquals(100, pricingRules.total(items));
	}
	
//	@Test
//	public void getCheckoutTotalForA() {
//		checkout.scan(item);
//		Assert.assertEquals(50, checkout.total());
//	}
}
