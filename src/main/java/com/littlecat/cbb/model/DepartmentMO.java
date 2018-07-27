package com.littlecat.cbb.model;

import java.util.List;

/**
 * 部门Model
 * amydady
 *
 */
public class DepartmentMO<MemberType> extends ModelBase
{
	private String name;
	private String parentUuid;
	private List<DepartmentMO<MemberType>> childDeparts;
	private List<RoleMO<MemberType>> roles;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getParent()
	{
		return parentUuid;
	}
	public void setParent(String parent)
	{
		this.parentUuid = parent;
	}
	public List<DepartmentMO<MemberType>> getChildDeparts()
	{
		return childDeparts;
	}
	public void setChildDeparts(List<DepartmentMO<MemberType>> childDeparts)
	{
		this.childDeparts = childDeparts;
	}
	public List<RoleMO<MemberType>> getRoles()
	{
		return roles;
	}
	public void setRoles(List<RoleMO<MemberType>> roles)
	{
		this.roles = roles;
	}
	
	
}
