package com.icc.gap.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.icc.gap.kata.models.Checkout;
import com.icc.gap.kata.models.Item;
import com.icc.gap.kata.models.PricingRules;
import com.icc.gap.kata.utils.RuleNames;

public class CheckoutTests {

	Checkout checkout;
	Item badItem;
	Item item;
	PricingRules pricingRules;
	
	@Before
	public void initialize() {
		checkout = new Checkout();
		item = new Item("A", 50);
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
	public void addItemRule() {
		Assert.assertTrue(pricingRules.add(item, RuleNames.N_FOR_X));
	}
	
//	@Test
//	public void getCheckoutTotalForA() {
//		checkout.scan(item);
//		Assert.assertEquals(50, checkout.total());
//	}
}
