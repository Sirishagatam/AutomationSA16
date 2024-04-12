package testAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicRequestPattern {
  @Test
  public void SingleUser_Get() {
	  Response res = RestAssured.get("https://reqres.in/api/users/2");
	  int ecode=res.getStatusCode();
	  Assert.assertEquals(ecode, 200);
	  System.out.println("Status code " + ecode + " is as expected !!!");
	  
  }
}
