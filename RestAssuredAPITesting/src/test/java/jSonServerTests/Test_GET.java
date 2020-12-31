package jSonServerTests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class Test_GET {
	
	@Test
	public void test_01_get() {
		baseURI = "http://localhost:3000/";
		given()
		.param("name", "Automation")
			.get("/subjects")
		.then()
			.statusCode(200)
			.log()
			.all();
	}
}