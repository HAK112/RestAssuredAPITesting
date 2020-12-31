package jSonServerTests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
/**
 * Unit test for simple App.
 */
public class Test_Patch {
    
	String endPoint = "https://reqres.in/api/users/2";
	
	@SuppressWarnings("unchecked")
	@Test
	public void test_01_patch() {
		JSONObject request = new JSONObject();

		request.put("lastName", "Rasheed");
		request.put("subjectId", 2);

		baseURI = "http://localhost:3000/";

		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.patch("/users/4")
		.then()
			.statusCode(200)
			.log()
			.all();
			
	}
}