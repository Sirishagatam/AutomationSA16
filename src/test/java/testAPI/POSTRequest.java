package testAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class POSTRequest {
  @Test
  public void SingleUserPostUsingHashMap() {
	  HashMap<String, Object> newuser = new HashMap<String,Object>();
	  newuser.put("name","MahaPeriyava");
	  newuser.put("job","God");
	  
	  given()
	  .contentType("application/json")
	  .body(newuser)
	  
	  .when()
	  	.post("https://reqres.in/api/users/")
	  	  
	  .then()
	  	.statusCode(201)
	  	.body("name",equalTo("MahaPeriyava"))
	  	.log().body();
	  
  }
  
  @Test
  public void SingleUserPostUsingPojoClass() {
	
	  Pojoclass p1 = new Pojoclass();
	  p1.setName("Sankara");
	  p1.setJob("Acharya");
	  
	  given()
	  .contentType("application/json")
	  .body(p1)
	  
	  .when()
	  	.post("https://reqres.in/api/users/")
	  	  
	  .then()
	  	.statusCode(201)
	  	.body("job",equalTo("Acharya"))
	  	.log().body();
	  
  }
}
