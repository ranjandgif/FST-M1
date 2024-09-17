package Example;


import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class NewTest {
//GET https://petstore.swagger.io/v2/pet/findByStatus?status=alive
  @Test
  
  public void getrequestwithqueryparam() {
	  
	  Response response=
			  RestAssured.given()
			  .baseUri("https://petstore.swagger.io/v2/pet")
			  .headers("Content-Type","application/jason") 	  //fixed header and cannot change
			  .queryParam("status", "alive")//for an post request, provide body after this
			  .when().get("findByStatus");
	  
	  
	  System.out.println(response.getHeaders());
	  //print the response body
	  
	  System.out.println(response.getBody().asString());
	  System.out.println("-----------------------------------");
	  System.out.println(response.getBody().asPrettyString());
			  
	  //extract values from response
	  
	  String petStatus=response.then().extract().path("[0].status");
	  System.out.println("petStatus of 0: " + petStatus);
	  
	  //assertion
	  
	  Assert.assertEquals(petStatus, "alive");
	  
	  //rest API assertion
	  
	  response.then().statusCode(200).body("[0].status", equalTo("alive"));
	  
	  
			  
			  
  }
  
  
//GET https://petstore.swagger.io/v2/pet/{petId}
  
  @Test
  public void getrequestwithpathparam() 
  {
	//send a request, get response and assert the result
			given()
				.baseUri("https://petstore.swagger.io/v2/pet")
				.header("Content-Type", "application/json")
				.pathParam("petId", 77232)
				.log().all()
			.when()
				.get("/{petId}")
			.then()
				.statusCode(200)
				.body("name", equalTo("Riley"))
				.body("status", equalTo("alive"))
				.log().all();
			  
			  
  }
  
  
}
