package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	                                      //page factory or object repository
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
WebElement login;
	
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signupBtn;
	
	@FindBy(xpath="//img[@alt='free crm logo']")
	WebElement crmlogo;
	                                                  //initilizing the page objects
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	                                               //actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean validateCRMImage()
	{
		return crmlogo.isDisplayed();
	}
	public HomePage Login(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		login.click();
		
		return new HomePage();
		
	}

}
