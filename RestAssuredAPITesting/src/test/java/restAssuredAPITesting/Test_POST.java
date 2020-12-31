package restAssuredAPITesting;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
/**
 * Unit test for simple App.
 */
public class Test_POST {
    
	String endPoint = "https://reqres.in/api/users";
	
	@SuppressWarnings("unchecked")
	@Test
	public void test_01_post() {
//		Map<String,Object> map = new HashedMap<String,Object>();
//		map.put("name", "Haider");
//		map.put("job","QA Engineer");
//		System.out.println(map);
//		JSONObject request = new JSONObject(map);
		JSONObject request = new JSONObject();
		request.put("name", "Haider");
		request.put("job","QA Engineer");
		System.out.println(request);
		
		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.post(endPoint)
		.then()
			.statusCode(201);
			
	}
}