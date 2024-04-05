package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) // base class
	{
		this.driver=driver;
	}
	
	//Locators
	By signIn = By.linkText("Sign In");
	
	//Methods
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void getSignIn() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(signIn).click();
	}
		
}
