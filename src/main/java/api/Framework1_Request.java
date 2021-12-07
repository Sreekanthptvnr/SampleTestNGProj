package api;

import java.util.Map;

public class Framework1_Request {
	public Framework1_Request(String baseURL, String resourceURL, String requestType) {
		// TODO Auto-generated constructor stub
		this.resourceURL=resourceURL;
		this.baseURL=baseURL;
		this.requestType=requestType;
	}
	public String resourceURL;
	public String baseURL;
	public String requestType;
	public Map<String,String> headers;
	public String RequestPayload;
}