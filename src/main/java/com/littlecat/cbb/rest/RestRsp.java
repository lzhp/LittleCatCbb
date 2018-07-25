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
	private static final int INVALID_TOTALNUM = -1;
	private String code;
	private String message;
	private int totalNum = INVALID_TOTALNUM; //分页查询时关注此字段，为总记录数（不是当前返回这批数据的记录数）
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
