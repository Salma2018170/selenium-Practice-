package qacart;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class Test1 {
    String url = "https://reqres.in/";

    @Test
    public void testCase1() {
        given().baseUri(url).when().get("api/users/2")
                .then().log().all().assertThat().statusCode(200)
                .assertThat().body("data.first_name",equalTo("Janet"));
    }
    @Test
    public void testCase2() {
        given().baseUri(url).when().get("api/users")
                .then().log().all().assertThat().statusCode(200)
                .assertThat().body("data.first_name",hasItem("Janet"));
    }
   //extract from response
    @Test
    public void testCase3() {

       Response response= given().baseUri(url).when().get("api/users")
                .then().extract().response();
        System.out.println(response.asString());
        //extract first_name way 1
//        String name=response.path("data[0].first_name");
//        System.out.println(name);

        //way 2
        System.out.println("-------------------------------");
        String name= JsonPath.from(response.asString()).getString("data[0].first_name");
        System.out.println(name);
    }
    //log
    @Test
    public void testCase4() {
      //log inside request
        //log inside response
      given().baseUri(url).when().get("api/users")
                .then().log().ifValidationFails()
        .body("data[0].first_name", equalTo("salma"));


    }
}
