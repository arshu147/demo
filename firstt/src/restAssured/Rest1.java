package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class Rest1 {
	@Test
	public void test1() {
		RestAssured.baseURI="https://reqres.in/";
//		RestAssured.given();
		given().param("page", "2")
		.get("/api/users")
		.then().statusCode(200)
		.and()
		.contentType(ContentType.JSON);

	}

}
