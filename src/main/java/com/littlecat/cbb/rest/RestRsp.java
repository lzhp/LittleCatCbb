package com.littlecat.cbb.rest;

import java.util.ArrayList;
import java.util.List;

/**
 * Rest接口返回Model
 * amydady
 *
 * @param <T>
 */
public class RestRsp<T>
{
	private String code;
	private String message;
	private List<T> data = new ArrayList<T>();
	
	public String getCode()
	{
		return code;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	public List<T> getData()
	{
		return data;
	}
	public void setData(List<T> data)
	{
		this.data = data;
	}
	
	
}
