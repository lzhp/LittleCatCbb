package com.littlecat.cbb.query;

/**
 * 分页查询参数 amydady
 *
 */
public class PageParam
{
	public static final int DEFAULT_PAGESIZE = 200;
	public static final String SORT_TYPE_ASC = "asc";
	public static final String SORT_TYPE_DESC = "desc";

	private int pageSize = DEFAULT_PAGESIZE;
	private int pageIndex = 0;
	private String sortFields; // 排序字段，以逗号分隔
	private String sortType = SORT_TYPE_ASC; // 排序方式，默认升序

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

	public String getSortType()
	{
		return sortType;
	}

	public void setSortType(String sortType)
	{
		this.sortType = sortType;
	}
	
}
