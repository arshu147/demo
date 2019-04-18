package restAssured;


import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Rest2 {

	@Test
	public void test1() {
		RestAssured.baseURI=("https://reqres.in/");
		RestAssured
		.given().param("page", "2")
		.when().get("/api/users")
		.then().assertThat().statusCode(200)
		.and()
		.contentType(ContentType.JSON)
		.and()
		.body("total",Matchers.equalTo(12));
	}
}

