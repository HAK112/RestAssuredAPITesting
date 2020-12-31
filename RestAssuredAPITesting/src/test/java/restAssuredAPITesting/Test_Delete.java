package restAssuredAPITesting;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;
/**
 * Unit test for simple App.
 */
public class Test_Delete {
    
	String endPoint = "https://reqres.in/api/users/2";
	
	@Test
	public void test_01_delete() {		

		when()
			.delete(endPoint)
		.then()
			.statusCode(204)
			.log()
			.all();
			
	}
}