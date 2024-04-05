package com.CRM.TestCases;

import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
  @Test
  public void verifyLogin() {
	  lp.verifyLogin("MahaPeriyava@gmail.com", "MahaPeriyava123");
  }
}
