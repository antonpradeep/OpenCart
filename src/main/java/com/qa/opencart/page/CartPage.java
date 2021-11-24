package com.qa.opencart.page;

import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtila;

public class CartPage {
	
	private WebDriver driver;
	private ElementUtila elementutils;

	public CartPage(WebDriver driver) {
		
		this.driver = driver;
		elementutils=new ElementUtila(this.driver);
	}
	
	

}
