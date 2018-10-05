package com.littlecat.cbb.rest;

import java.util.HashMap;
import java.util.Map;

public class RestfulRequestParam
{
	private Map<String, String> headers;
	Map<String, String> reqParam = new HashMap<String, String>();

	public Map<String, String> getHeaders()
	{
		return headers;
	}

	public void setHeaders(Map<String, String> headers)
	{
		this.headers = headers;
	}

	public Map<String, String> getReqParam()
	{
		return reqParam;
	}

	public void setReqParam(Map<String, String> reqParam)
	{
		this.reqParam = reqParam;
	}

}
