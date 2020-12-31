package restAssuredAPITesting;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
/**
 * Unit test for simple App.
 */
public class Test_PUT {
    
	String endPoint = "https://reqres.in/api/users/2";
	
	@SuppressWarnings("unchecked")
	@Test
	public void test_01_put() {
		JSONObject request = new JSONObject();
		request.put("name", "Haider");
		request.put("job","QA Engineer");
		System.out.println(request);
		
		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.put(endPoint)
		.then()
			.statusCode(200)
			.log()
			.all();
			
	}
}