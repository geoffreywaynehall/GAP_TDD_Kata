package com.icc.gap.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.icc.gap.kata.models.Checkout;
import com.icc.gap.kata.models.Item;

public class CheckoutTests {

	Item item;
	
	@Before
	public void initialize() {
		item = new Item("A", 50);
	}
	
	@Test
	public void scanAnItem() {
		Checkout checkout = new Checkout();
		Item blankItem = new Item();
		Assert.assertTrue(checkout.scan(blankItem));
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
}
