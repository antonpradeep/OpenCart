package com.qa.opencart.utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtila {
	
	private WebDriver driver;

	public ElementUtila(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		
		return driver.findElements(locator);
	}
	
	public void doSendKey(By locator, String data) {
		
		getElement(locator).sendKeys(data);
	}
	
	public void clickElement(By locator) {
		
		getElement(locator).click();
	}
	
	public String getElementText(By locator) {
		
		return getElement(locator).getText();
	}
	
	public boolean isDisplayed(By locator) {
		
		return getElement(locator).isDisplayed();
	}
	
	public String getLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public List<String> getAlltext(By locator) {
		
		List<String> Alltext=new ArrayList<>();
	
		List<WebElement> ele= getElements(locator);
		
		for (WebElement element : ele) {
		 Alltext.add(element.getText());
		}
		return Alltext;
	}
	
	public String getPageTitle() {
		
		return driver.getTitle();
	}

	public String getPageUrl() {

		return driver.getCurrentUrl();
	}

}
