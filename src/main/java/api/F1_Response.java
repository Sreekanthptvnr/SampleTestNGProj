package api;

import java.util.Map;

public class F1_Response {
	
	public F1_Response(String respBody,int respCode) {
		// TODO Auto-generated constructor stub
		this.respBody=respBody;
		this.respCode=respCode;
	}
	public String getRespBody() {
		return respBody;
	}
	public void setRespBody(String respBody) {
		this.respBody = respBody;
	}
	public int getRespCode() {
		return respCode;
	}
	public void setRespCode(int respCode) {
		this.respCode = respCode;
	}
	public Map<String, String> getRespHeaders() {
		return respHeaders;
	}
	public void setRespHeaders(Map<String, String> respHeaders) {
		this.respHeaders = respHeaders;
	}
	private String respBody;
	private int respCode;
	private Map<String,String> respHeaders;
 
}
