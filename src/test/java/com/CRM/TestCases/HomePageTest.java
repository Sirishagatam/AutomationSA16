package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;

public class HomePageTest extends BaseClass {
 
	
  @Test(priority=1)
  public void verifyUrl() {
	  String curl=hp.getAppUrl();
	  Assert.assertTrue(curl.contains("crm"), "Url is wrong");
	  System.out.println("Url is valid");
  }
  
  @Test(priority=2)
  public void verifyTitle() {
	  Assert.assertTrue(hp.getAppTitle().contains("Service"), "Title is not matched");
	  System.out.println("Title is matched" + hp.getAppTitle());
  }

  @Test(priority=3)
  public void verifySignin() {
	  try {
		hp.getSignIn();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  Assert.assertTrue(hp.getAppUrl().contains("login"), "Login is not successful!!!");
	  System.out.println("Login is successful!!!");
  }

}
