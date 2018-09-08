package com.littlecat.cbb.rest;

import com.littlecat.cbb.common.Consts;

/**
 * Rest接口返回Model
 * amydady
 *
 * @param <T>
 */
public class RestSimpleRsp
{
	private String code = Consts.NONE_ERROR_CODE;
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
