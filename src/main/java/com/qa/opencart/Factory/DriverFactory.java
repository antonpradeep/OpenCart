package com.qa.opencart.Factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	Properties prop;
	
	WebDriver driver;

	public Properties init_prop() {

		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/config/config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;

	}
	
	public WebDriver init_driver() {
		
		String browsername = init_prop().getProperty("browser");
		
		switch(browsername.toLowerCase()) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		break;
		case"ie":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		break;
		default:
			System.out.println("++++++Please provide the correct browser name+++++");
		}
		
		driver.get(init_prop().getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
		
	}

}
