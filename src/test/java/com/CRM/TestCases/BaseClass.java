package com.CRM.TestCases;

import org.testng.annotations.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.CRM.Pages.*;

public class BaseClass {
  
	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/");
		hp=new HomePage(driver);
		lp=new LoginPage(driver);
	}

	@BeforeClass
	public void pageSetUp()
	{
		try {
			hp.getSignIn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
