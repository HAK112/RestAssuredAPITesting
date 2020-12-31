package jSonServerTests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;
/**
 * Unit test for simple App.
 */
public class Test_Delete {
    
	
	@Test
	public void test_01_delete() {		
		baseURI = "http://localhost:3000/";
		when()
			.delete("/users/4")
		.then()
			.statusCode(200);
			
	}
}