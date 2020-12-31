package jSonServerTests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
/**
 * Unit test for simple App.
 */
public class Test_POST {

	@SuppressWarnings("unchecked")
	@Test
	public void test_01_post() {
		JSONObject request = new JSONObject();

		request.put("firstName", "Salman");
		request.put("lastName", "Rashed");
		request.put("subjectId", 1);

		baseURI = "http://localhost:3000/";

		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.post("/users")
		.then()
			.statusCode(201)
			.log()
			.all();
	}
}