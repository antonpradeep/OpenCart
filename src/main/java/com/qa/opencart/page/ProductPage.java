package com.qa.opencart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtila;

public class ProductPage {
	
	private WebDriver driver;
	private ElementUtila elementutils;
	private By addtocart=By.id("button-cart");
	private By shoppingcartlink=By.xpath("//a[text()='shopping cart']");
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
		elementutils=new ElementUtila(this.driver);
	}

public CartPage AddtoCart() {
	
	elementutils.clickElement(addtocart);
	elementutils.clickElement(shoppingcartlink);
	
	return new CartPage(driver);
	
}
	
}
