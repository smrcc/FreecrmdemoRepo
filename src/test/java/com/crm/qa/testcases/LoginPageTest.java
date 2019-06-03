package com.crm.qa.testcases;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{	
	LoginPage loginpage;
	HomePage h;
	

	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initilization();
		loginpage=new LoginPage();
	}
	@Test(priority=1)
	public void loginpageTitleTest()
	{
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
	}
	@Test(priority=2)
	public void crmLogoImageTest()
	{
		boolean flag=loginpage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginTest() throws Exception
	{
		h=loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(5000);
		
		
	}
@AfterMethod
public void teardown()
{
	driver.close();
}
}
