package com.qa.opencart.utils;

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

}
