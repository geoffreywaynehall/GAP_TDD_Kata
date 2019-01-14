package com.icc.gap.kata;

import org.junit.Assert;
import org.junit.Test;

import com.icc.gap.kata.models.Checkout;
import com.icc.gap.kata.models.Item;

public class CheckoutTests {

	@Test
	public void scanAnItem() {
		Checkout checkout = new Checkout();
		Item item = new Item();
		Assert.assertTrue(checkout.scan(item));
	}
	
	@Test
	public void createItemWithPrice() {
		Item item = new Item("A", 50);
		Assert.assertNotNull(item);
	}
	
	@Test
	public void getItemSku() {
		Item item = new Item("A", 50);
		Assert.assertEquals("A", item.getSku());
	}
	
	@Test
	public void getItemUnitPrice() {
		Item item = new Item("A", 50);
		Assert.assertEquals(50, item.getUnitPrice());
	}
}
