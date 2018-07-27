package com.littlecat.cbb.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 角色Model
 * amydady
 *
 */
public class RoleMO<MemberType> extends ModelBase
{
	private String name;
	private String departMentUuid;
	private List<MenuMO> menus;
	private List<ActionMO> functions;
	private List<MemberType> members = new ArrayList<MemberType>();
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDepartMentUuid()
	{
		return departMentUuid;
	}
	public void setDepartMentUuid(String departMentUuid)
	{
		this.departMentUuid = departMentUuid;
	}
	public List<MenuMO> getMenus()
	{
		return menus;
	}
	public void setMenus(List<MenuMO> menus)
	{
		this.menus = menus;
	}
	public List<ActionMO> getFunctions()
	{
		return functions;
	}
	public void setFunctions(List<ActionMO> functions)
	{
		this.functions = functions;
	}
	public List<MemberType> getMembers()
	{
		return members;
	}
	public void setMembers(List<MemberType> members)
	{
		this.members = members;
	}
	
}
