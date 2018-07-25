package com.littlecat.cbb.rest;

/**
 * Rest接口返回Model
 * amydady
 *
 * @param <T>
 */
public class RestSimpleRsp
{
	private String code;
	private String message;
	
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
}
