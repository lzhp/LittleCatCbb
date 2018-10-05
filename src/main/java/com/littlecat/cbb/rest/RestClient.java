package com.littlecat.cbb.rest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.littlecat.cbb.exception.LittleCatException;
import com.littlecat.cbb.utils.JsonUtil;

public class RestClient
{
	private static RestTemplate getRestTemplateIns()
	{
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

	public static String get(String url,RestfulRequestParam ... reqParam) throws LittleCatException
	{
		RestTemplate restTemplate = getRestTemplateIns();
		try
		{
			if(reqParam != null && reqParam.getReqParam())
			{
				
			}
			String respJson = restTemplate.getForObject(url, String.class);
			return respJson;
		}
		catch (Exception e)
		{
			throw new LittleCatException("RestClient:get error,url=" + url, e);
		}
	}

	public static String get(String url, RestfulRequestParam reqParam) throws LittleCatException
	{
		RestTemplate restTemplate = getRestTemplateIns();
		try
		{
			String respJson = restTemplate.getForObject(url, String.class, reqParam.getReqParam());
			return respJson;
		}
		catch (Exception e)
		{
			throw new LittleCatException("RestClient:get error,url=" + url + ",param:" + JsonUtil.toJson(reqParam), e);
		}
	}

	public static String put(String url, String reqObjectJson, RestfulRequestParam reqParam) throws LittleCatException
	{
		RestTemplate restTemplate = getRestTemplateIns();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>(reqObjectJson, headers);

		try
		{
			ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.PUT, entity, String.class, reqParam.getReqParam());
			return resp.getBody();
		}
		catch (Exception e)
		{
			throw new LittleCatException("RestClient:put error,url=" + url + ",reqObjectJson:" + reqObjectJson, e);
		}
	}

	public static String delete(String url, String reqObjectJson, RestfulRequestParam reqParam) throws LittleCatException
	{
		RestTemplate restTemplate = getRestTemplateIns();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(reqObjectJson, headers);

		try
		{
			ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.DELETE, entity, String.class, reqParam.getReqParam());
			return resp.getBody();
		}
		catch (Exception e)
		{
			throw new LittleCatException("RestClient:post error,url=" + url + ",reqObjectJson:" + reqObjectJson, e);
		}
	}

	public static String post(String url, String reqObjectJson) throws LittleCatException
	{
		RestTemplate restTemplate = getRestTemplateIns();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> entity = new HttpEntity<String>(reqObjectJson, headers);

		try
		{
			ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
			return resp.getBody();
		}
		catch (Exception e)
		{
			throw new LittleCatException("RestClient:post error,url=" + url + ",reqObjectJson:" + reqObjectJson, e);
		}
	}

	public static void main(String[] args)
	{
		RestfulRequestParam reqParam = new RestfulRequestParam();
		reqParam.getReqParam().put("id", "fa55ad19-912f-4c3b-a887-f7c37a3a6430");
		String jsonStr = RestClient.get("http://localhost:8006/rest/littlecat/caobao/terminaluser/getbyid?id={id}", reqParam);
		System.out.println(jsonStr);

		TerminalUserMO mo = new TerminalUserMO();
		mo.setId("fa55ad19-912f-4c3b-a887-f7c37a3a6430");
		RestClient.put("http://localhost:8006/rest/littlecat/caobao/terminaluser/settuanzhangyes/{id}", JsonUtil.toJson(mo), reqParam);

		mo = new TerminalUserMO();
		mo.setWxCode("wxCode004");

		System.out.println(RestClient.post("http://localhost:8006/rest/littlecat/caobao/terminaluser/add", JsonUtil.toJson(mo)));

	}
}
