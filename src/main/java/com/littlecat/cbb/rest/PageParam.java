package com.littlecat.cbb.rest;

/**
 * 分页查询参数 amydady
 *
 */
public class PageParam
{
	public static final int DEFAULT_PAGESIZE = 200;

	private int pageSize = DEFAULT_PAGESIZE;
	private int pageIndex = 0;
	private String sortFields; // 排序字段，以逗号分隔

	public int getPageSize()
	{
		return pageSize;
	}

	public void setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
	}

	public int getPageIndex()
	{
		return pageIndex;
	}

	public void setPageIndex(int pageIndex)
	{
		this.pageIndex = pageIndex;
	}

	public String getSortFields()
	{
		return sortFields;
	}

	public void setSortFields(String sortFields)
	{
		this.sortFields = sortFields;
	}
}
