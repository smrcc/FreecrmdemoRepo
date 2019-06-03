package com.crm.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	WebDriverWait w;
	LoginPage login;
	HomePage homepage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initilization();
		login = new LoginPage();
		homepage = login.Login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String s = homepage.verifyHomePageTitle();
		Assert.assertEquals(s, "CRMPRO", "HomePage Title not matched");
	}
	@Test(priority=2)
	public void verifyUserNameTest()
	{
	
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
