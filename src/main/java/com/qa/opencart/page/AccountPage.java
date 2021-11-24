package com.qa.opencart.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.ElementUtila;

public class AccountPage {
	
	private By accountPageHeaders=By.xpath("//div/h2");
	private By accountPageLists=By.xpath("//div/aside/./div/a");
	private By accountPageFooter=By.xpath("//div/h5");
	private By searchproduct=By.xpath("");
	private WebDriver driver;
	private ElementUtila elementutils;
	


	public AccountPage(WebDriver driver) {
		this.driver = driver;
		elementutils=new ElementUtila(this.driver);
	}
	
	public List<String> getAccountPageHeaders() {
		List<String> headers = elementutils.getAlltext(accountPageHeaders);
		
		return headers;
						
	}
	
	public List<String> getAccountPageLists() {
		List<String> pagelists = elementutils.getAlltext(accountPageLists);
		return pagelists;
		
	}
	
	public List<String> getAccountPageFooter() {
		List<String> footer = elementutils.getAlltext(accountPageFooter);
	    return footer;
	}
	
	public SearchPage searchProduct() {
		
	elementutils.doSendKey(searchproduct, "Macbook");
		elementutils.clickElement(searchproduct);
		
	return new SearchPage(driver);
	}

}
