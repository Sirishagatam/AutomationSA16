package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	// constructor for initialization
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// locators
	By email=By.id("email-id");
	By password=By.id("password");
	By submitbtn=By.id("submit-id");
	
	//methods
	public void verifyLogin(String em,String pw)
	{
		driver.findElement(email).sendKeys(em);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(submitbtn).click();
	}
	
	
	
}
