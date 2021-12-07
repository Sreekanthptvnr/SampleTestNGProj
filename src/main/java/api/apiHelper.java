package api;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class apiHelper {
	
	public static Response hitApi(Framework1_Request request) {
		Response response = null;
		RestAssured.baseURI=request.baseURL;
		RequestSpecification httpRequest = RestAssured.given();
		if(request.requestType.equalsIgnoreCase("GET")) {
			response=httpRequest.request(Method.GET,request.resourceURL);

		}
		String respBody=response.getBody().asString();
		int respCode=response.getStatusCode();
		F1_Response respo=new F1_Response(respBody, respCode);
		return respo;
		
	}

}
