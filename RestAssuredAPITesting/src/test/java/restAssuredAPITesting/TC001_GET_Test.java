package restAssuredAPITesting;


import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

/**
 * Unit test for simple App.
 */
public class TC001_GET_Test {
    
	String endPoint = "https://reqres.in/api/users?page=2";
	
    @Test
    void test_01()
    {
    	Response response = get(endPoint);
    	
    	System.out.println("Full Response: "+response.asPrettyString());
    	System.out.println("Response Body: "+response.getBody().asPrettyString());
    	System.out.println("Response Status Code: "+response.getStatusCode());
    	System.out.println("Response Status Line: "+response.getStatusLine());
    	System.out.println("Response Header Content Type: "+response.getHeader("content-type"));
    	System.out.println("Response Getting Content Type: "+response.getContentType());
    	System.out.println("Getting Response Time: "+response.getTime());
    	
    	int statusCode = response.getStatusCode();
    	Assert.assertEquals(statusCode, 200);
    }
    
    @Test
    void test_02() {
    	given()
    		.get(endPoint)
    	.then()
    		.statusCode(200)
    		.body("data.id[0]", equalTo(7));
    }
}
