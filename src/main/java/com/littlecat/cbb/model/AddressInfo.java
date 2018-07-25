package com.littlecat.cbb.model;

/**
 * 行政地址信息
 * amydady
 *
 */
public class AddressInfo
{
	private int country;
	private int province;
	private int city;
	private int area;
	private int street;
	private String otherInfo;
	private String postCode;
	
	public int getCountry()
	{
		return country;
	}
	public void setCountry(int country)
	{
		this.country = country;
	}
	public int getProvince()
	{
		return province;
	}
	public void setProvince(int province)
	{
		this.province = province;
	}
	public int getCity()
	{
		return city;
	}
	public void setCity(int city)
	{
		this.city = city;
	}
	public int getArea()
	{
		return area;
	}
	public void setArea(int area)
	{
		this.area = area;
	}
	public int getStreet()
	{
		return street;
	}
	public void setStreet(int street)
	{
		this.street = street;
	}
	public String getOtherInfo()
	{
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo)
	{
		this.otherInfo = otherInfo;
	}
	public String getPostCode()
	{
		return postCode;
	}
	public void setPostCode(String postCode)
	{
		this.postCode = postCode;
	}
	
}
