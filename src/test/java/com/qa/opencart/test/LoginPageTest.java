package com.qa.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.scanner.Constant;

import com.qa.opencart.utils.ConstantUtils;

public class LoginPageTest extends basetest {
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String loginPageTitle = loginPage.getloginpagetitle();
		System.out.println("Login Page Title " + loginPageTitle);
		Assert.assertEquals(loginPageTitle, ConstantUtils.LOGIN_PAGE_TITLE);
	}

	@Test(priority = 4)
	public void LoginAppTest() {
		loginPage.loginopencart(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 2)
	public void forgottentPwdLinkTest() {
		Assert.assertTrue(loginPage.forgottenpwdLinkExist());
	}

	@Test(priority = 3)
	public void loginLinkTest() {
		Assert.assertTrue(loginPage.loginLinkExist());

	}
	
	

}
