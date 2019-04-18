package restAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RestGoogleSearch {
	@Test
	public void test1() {
		

	RestAssured.baseURI="https://maps.googleapis.com";
	RestAssured
	.given()
	.param("location","-33.8670522,151.1957362")
	.param("radius","1500")
	.param("type","restaurant")
	.param("keyword","cruise")
	.param("key","YOUR_API_KEY")
	.when()
	.get("maps/api/place/nearbysearch/json")
	.then()
	.statusCode(200)
	.and()
	.contentType(ContentType.JSON)
	.body("results[0].name", Matchers.equalTo("Cruise Bar, Restaurant & Events"))
	.body("results[0].place_id",Matchers.equalTo("ChIJi6C1MxquEmsR9-c-3O48ykI"))
	.header("Server ","scaffolding on HTTPServer2");

	
	
	}
}
