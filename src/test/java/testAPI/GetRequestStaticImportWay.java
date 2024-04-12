package testAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

//Static Method
/*
 * given()
 * Precondition,Request payload,Authentication,Header,Cookie,Path,Query parameters
 * when()
 * Methods-get,post,put,patch,delete
 * then()
 * validation using Assertion
 * status code
 * json body(Response payload)
 */

public class GetRequestStaticImportWay {
  @Test(priority=1)
  public void SingleUser() {
	  
	  System.out.println("***Test Case for SingleUser Get Request in REST API***"); 
	  
	  given()
	  
	  .when()
	  	.get("https://reqres.in/api/users/2")
	  
	  .then()
	  	.assertThat()
	  	//Passed case
	  	.statusCode(200)
	  	//Failure case
	  	//.statusCode(201)
	  	.body("data.id",equalTo(2))
	  	.body("data.email", equalTo("janet.weaver@reqres.in"))
		//.log().all();
	  	.log().body();
	  	
	  	System.out.println("ID is validated");
	  	System.out.println("Email is validated");
  }

  @Test(priority=2)
  public void ListofUsers() {
	  
	  System.out.println("***Test Case for List of Users Get Request in REST API***");
	  
	  given()
	  
	  .when()
	  	.get("https://reqres.in/api/users?page=2")
	  	
	  .then()
	   	.statusCode(200)
	   	.body("page",equalTo(2))
		.body("data.first_name[5]",equalTo("Rachel"))
	  	.body("data.id",hasItems(7,12))//pass
	  	.body("data.id",hasItems(11,8))//pass
	  	.body("data.id",hasItems(11,13))//fail
	  	.body("data.id",contains(7,8,9,10,11,12))//pass
	  	.body("data.id",contains(7,8,9,10,11))//fail
	  	.body("data.id",contains(7,8))//fail
	  	.body("data.id",contains(11,12))//fail
	  	.log().body();
	  	
	  System.out.println("Validation done for all users in page 2");
  }


}

