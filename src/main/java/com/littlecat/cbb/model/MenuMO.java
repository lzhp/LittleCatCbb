package com.littlecat.cbb.model;

import java.util.List;

/**
 * 系统菜单（后台管理系统用） amydady
 *
 */
public class MenuMO
{
	private String id;
	private String name;
	private String parentId;
	private List<MenuMO> childMenus;
	private String url;
	private int orderNo; // 同级菜单中的序号

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getParentId()
	{
		return parentId;
	}

	public void setParentId(String parentId)
	{
		this.parentId = parentId;
	}

	public List<MenuMO> getChildMenus()
	{
		return childMenus;
	}

	public void setChildMenus(List<MenuMO> childMenus)
	{
		this.childMenus = childMenus;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public int getOrderNo()
	{
		return orderNo;
	}

	public void setOrderNo(int orderNo)
	{
		this.orderNo = orderNo;
	}

}
