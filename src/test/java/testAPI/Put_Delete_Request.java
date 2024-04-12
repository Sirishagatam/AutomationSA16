package testAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Put_Delete_Request {
  @Test(priority=1)
  public void PutRequest() {
	  Pojoclass p1 = new Pojoclass();
	  p1.setName("Vaishnavi");
	  p1.setJob("SW Engineer");
	  
	  given()
	  .contentType("application/json")
	  .body(p1)
	  
	  .when()
	  	.put("https://reqres.in/api/users/2")
	  
	  .then()
	  	.statusCode(200)
	  	.log().body();
	  

	  
  }
  

  @Test(priority=2)
  public void DeleteRequest() {
	  given()
	  
	  .when()
	  	.delete("https://reqres.in/api/users/2")
	  
	  .then()
	  	.statusCode(204)
	  	.log().body();
	  	
  
  }
  

}
