package com.icc.gap.kata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.icc.gap.kata.models.Checkout;
import com.icc.gap.kata.models.Item;

public class CheckoutTests {

	Checkout checkout;
	Item blankItem;
	Item item;
	
	@Before
	public void initialize() {
		checkout = new Checkout();
		blankItem = new Item();
		item = new Item("A", 50);
	}
	
	@Test
	public void scanAnItem() {
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
	
	@Test
	public void getCheckoutTotal() {
		checkout.scan(blankItem);
		Assert.assertEquals(0, checkout.total());
	}
}
