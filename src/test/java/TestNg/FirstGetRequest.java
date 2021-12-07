package TestNg;

import org.testng.annotations.Test;

import api.Framework1_Request;
import api.apiHelper;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstGetRequest {
	
	
	
	@Test
	
	/* Endpoint,headers
	 * 
	 */
	public void tc1() {
		Framework1_Request request= new Framework1_Request("https://reqres.in","/api/users?page=2","GET");
		Response resp=apiHelper.hitApi(request);
		System.out.println(resp.getBody().asString());
		System.out.println(resp.getStatusCode());
		Headers headers=resp.getHeaders();
		headers.getValue("Connection");
		System.out.println(headers.getValue("Connection"));
		
	}
	@Test(enabled=false)
	public void tc2() {
	RestAssured.baseURI="https://reqres.in";
	RequestSpecification httpRequest = RestAssured.given();
	Response response=httpRequest.request(Method.GET,"/api/users?page=2");
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusCode());
	Headers headers=response.getHeaders();
	headers.getValue("Connection");
	System.out.println(headers.getValue("Connection"));
	
	
}
	@Test
	public void tc3() {
		
		Framework1_Request cowinReq=new Framework1_Request("https://cdn-api.co-vin.in", "/api/v2/appointment/sessions/public/calendarByDistrict?district_id=302&date=07-12-2021", "GET");
		Response resp=apiHelper.hitApi(cowinReq);
		System.out.println(resp.getStatusCode());
		System.out.println(resp.asString());
		System.out.println(resp.getHeader("Content-Type"));
		
	}
	}
	


