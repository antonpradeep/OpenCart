package com.qa.opencart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtila;

public class SearchPage {
	
	private WebDriver driver;
	private ElementUtila elementutils;
	private By productclick= By.xpath("(//h4)[3]");
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		elementutils=new ElementUtila(this.driver);
	}
	
	public ProductPage SelectProduct() {
		
		elementutils.clickElement(productclick);
		
		return new ProductPage(driver);
	}

}
