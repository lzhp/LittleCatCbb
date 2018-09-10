package com.littlecat.cbb.query;

/**
 * 分页查询参数
 * 
 * @author amydady
 *
 */
public class PageParam
{
	public static final int DEFAULT_PAGESIZE = 200;
	public static final int DEFAULT_PAGEINDEX = 1;
	public static final String SORT_TYPE_ASC = "asc";
	public static final String SORT_TYPE_DESC = "desc";

	private int pageSize = DEFAULT_PAGESIZE;
	private int pageIndex = DEFAULT_PAGEINDEX;
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
	
	public String getPageString()
	{
		int start = (this.pageIndex - 1) * this.pageSize + 1;
		return new StringBuilder().append(" order by ").append(this.sortFields).append(" ").append(this.sortType).append(" limit ").append(String.valueOf(start)).append(",").append(String.valueOf(this.getPageSize())).toString();
	}
}
