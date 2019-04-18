package restAssured;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Rest3Namevalidate {
	@Test
	public void test1() {
		RestAssured.baseURI=("https://reqres.in/");
		Response response = RestAssured
		.given().param("page", "2")
		.when().get("/api/users")
		.then().assertThat().statusCode(200).and()
		.contentType(ContentType.JSON)
		.body("total",Matchers.equalTo(12)).extract().response();
		
		String strResponse = response.asString();
		System.out.println(strResponse);
		
		JsonPath jspath = new JsonPath(strResponse);
//		System.out.println(jspath.get("data[0].first_name"));
		Assert.assertEquals(jspath.getString("data[0].first_name"),"Eve");

		
		
		
		List<String> lstNames = jspath.getList("data.first_name");
		System.out.println(lstNames);
		List<String> lstExpName = new ArrayList<>();
		lstExpName.add("Eve");
		lstExpName.add("Charles");
		lstExpName.add("Tracey");
		Assert.assertEquals(lstNames, lstExpName);
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.contentType(), "application/json; charset=utf-8");
		Assert.assertEquals(response.header("X-Powered-By"), "Express");


		

		


}
}
