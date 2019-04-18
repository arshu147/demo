package restAssured;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RestGoogleSearch {
	@Test
	public void test1() {


		RestAssured.baseURI="https://maps.googleapis.com";
		Response response = RestAssured
		.given()
		.param("location","-33.8670522,151.1957362")
		.param("radius","1500")
		.param("type","restaurant")
		.param("keyword","cruise")
		.param("key","AIzaSyBdha_iCNhSrt0tU86u2eNWxFtSkaNDM5g")
		.when()
		.get("maps/api/place/nearbysearch/json")
		.then().assertThat().
		 statusCode(200)
		.and()
		.contentType(ContentType.JSON).and()
		.body("results[0].name", Matchers.equalTo("Cruise Bar, Restaurant & Events")).and()
		.body("results[2].place_id",Matchers.equalTo("ChIJjRuIiTiuEmsRCHhYnrWiSok")).extract().response();
		String header = response.getHeader("Server");
		System.out.println(header);
		Assert.assertEquals(header, "scaffolding on HTTPServer2");
	}
}
