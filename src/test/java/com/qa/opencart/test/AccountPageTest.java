package com.qa.opencart.test;

import java.lang.reflect.Array;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.utils.ConstantUtils;

public class AccountPageTest extends basetest{
	
	@BeforeClass
	public void accountPageSetup() {
		accountPage= loginPage.loginopencart(prop.getProperty("username"), prop.getProperty("password"));	
		}
	
//	@DataProvider(name="headerlist") public Object[] AccountHeaders() {
//		
//		return new Object[] { "" };
//		
//	}
//	
//	
//	@Test(dataProvider = "headerlist")
	
	@Test
public void AccountPageHeadersTest() {
		
 Assert.assertEquals(accountPage.getAccountPageHeaders(),ConstantUtils.ACCOUNT_PAGE_HEADERS);
 
}


}