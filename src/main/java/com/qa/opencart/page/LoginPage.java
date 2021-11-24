package com.qa.opencart.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtila;

public class LoginPage {

	/*
	 * by locators constructor Page actions
	 */

	private By username = By.id("input-email");
	private By password = By.id("input-password");
	private By login = By.xpath("//input[@type='submit']");
	private By forgottenlink = By.xpath("(//*[text()='Forgotten Password'])[1]");
	private By loginlink = By.xpath("(//*[text()='Login'])[2]");

	private WebDriver driver;

	private ElementUtila elementutils;
	private AccountPage accountpage;


	public LoginPage(WebDriver driver) {
		this.driver = driver;

		elementutils = new ElementUtila(this.driver);

	}

	public String getloginpagetitle() {
		return elementutils.getLoginPageTitle();

	}

	public boolean loginLinkExist() {
		
		return elementutils.isDisplayed(loginlink);

	}

	public boolean forgottenpwdLinkExist() {
		
		return elementutils.isDisplayed(forgottenlink);

	}
	
	public AccountPage loginopencart(String uname, String pwd) {
		elementutils.doSendKey(username, uname);
		elementutils.doSendKey(password, pwd);
		elementutils.clickElement(login);
		return new AccountPage(driver);
	}
}
