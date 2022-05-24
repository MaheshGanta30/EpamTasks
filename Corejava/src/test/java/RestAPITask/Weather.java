package RestAPITask;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;



public class Weather {
	
	 @Test
	    public void get(){
	        Response response = given().baseUri("http://api.openweathermap.org/data/2.5")
	                .when().get("/weather?appid=1548f10d6c7fdc9390ba52e55ad1d8f3&q=Hyderabad");
	        JsonPath json = response.jsonPath();
	        Object  longitude = json.get("coord.lon");
	        Object  latitude =json.get("coord.lat");

	        Response response1 = given().baseUri("http://api.openweathermap.org/data/2.5")
	                .when().get("/weather?lat=" + latitude + "&lon=" + longitude + "&appid=1548f10d6c7fdc9390ba52e55ad1d8f3");
	        response1.then().assertThat().statusCode(200);
	        JsonPath path =response1.jsonPath();
	        String name = path.get("name");
	        Assert.assertEquals(name,"Hyderabad");
	        String country = path.get("sys.country");
	        Assert.assertEquals(country,"IN");
	        float minTemp = path.get("main.temp_min");
	        Assert.assertEquals(minTemp>0,true);
	        float temparature = path.get("main.temp");
	        Assert.assertEquals(temparature>0,true);
	    }


}
