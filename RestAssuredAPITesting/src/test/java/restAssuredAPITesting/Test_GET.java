package restAssuredAPITesting;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class Test_GET {
    
	String endPoint = "https://reqres.in/api/users?page=2";
	
	@Test
	public void test_01_get() {
		given()
			.get(endPoint)
		.then()
			.statusCode(200)
			.body("data.id[1]", equalTo(8))
			.body("data.first_name", hasItems("Michael","Lindsay"))
			.log().all();
	}
}