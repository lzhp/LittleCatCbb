package com.littlecat.cbb.base;

import com.littlecat.cbb.utils.UUIDUtil;

/**
 * MO基类
 * 
 * @author amydady
 *
 */
public class BaseMO
{
	private String id;

	public BaseMO()
	{
		this.id = UUIDUtil.createUUID();
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}
}
