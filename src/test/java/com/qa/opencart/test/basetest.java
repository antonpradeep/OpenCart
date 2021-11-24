package com.qa.opencart.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.Factory.DriverFactory;
import com.qa.opencart.page.AccountPage;
import com.qa.opencart.page.LoginPage;

public class basetest {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	public LoginPage loginPage;
	public Properties prop;
	public AccountPage accountPage;
	

	@BeforeTest
	public void setUp() {
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver();

		prop = driverFactory.init_prop();
		loginPage = new LoginPage(this.driver);
		accountPage=new AccountPage(this.driver);

	}

	@AfterTest
	public void tearDown() {

		driver.quit();

	}

}
