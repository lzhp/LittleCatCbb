package com.littlecat.cbb.rest;

import java.util.ArrayList;
import java.util.List;

import com.littlecat.cbb.common.Consts;

/**
 * Rest接口返回Model
 * amydady
 *
 * @param <T>
 */
public class RestRsp<T>
{
	private static final int INVALID_TOTALNUM = -1;
	
	private String code = Consts.ERROR_CODE_NONE;
	private String message;
	private int totalNum = INVALID_TOTALNUM; 
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
	public int getTotalNum()
	{
		return totalNum;
	}
	public void setTotalNum(int totalNum)
	{
		this.totalNum = totalNum;
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
