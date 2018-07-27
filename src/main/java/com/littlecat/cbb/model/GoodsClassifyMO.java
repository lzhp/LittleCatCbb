package com.littlecat.cbb.model;

import java.util.List;

/**
 * 系统预置的商品类目（最多三层）
 * amydady
 *
 */
public class GoodsClassifyMO
{
	private String id;
	private String name;
	private String parentId;
	private List<GoodsClassifyMO> childClassifys;
	private String enable;
	
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
	public String getEnable()
	{
		return enable;
	}
	public void setEnable(String enable)
	{
		this.enable = enable;
	}
	public String getParentId()
	{
		return parentId;
	}
	public void setParentId(String parentId)
	{
		this.parentId = parentId;
	}
	public List<GoodsClassifyMO> getChildClassifys()
	{
		return childClassifys;
	}
	public void setChildClassifys(List<GoodsClassifyMO> childClassifys)
	{
		this.childClassifys = childClassifys;
	}
}
