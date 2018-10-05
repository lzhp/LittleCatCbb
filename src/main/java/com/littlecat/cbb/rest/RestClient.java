package com.littlecat.cbb.rest;

import org.springframework.web.client.RestTemplate;

import com.littlecat.cbb.exception.LittleCatException;

public class RestClient
{
	public static <T> T sendRequest(Class clazz) throws LittleCatException
	{
		RestTemplate restTemplate = new RestTemplate();
	}
}
