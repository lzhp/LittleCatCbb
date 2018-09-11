package com.littlecat.cbb.query;

/**
 * 分页查询参数
 * 
 * @author amydady
 *
 */
public class PageParam
{
	public static final int DEFAULT_PAGESIZE = 20;
	public static final int DEFAULT_PAGEINDEX = 1;

	private int pageSize = DEFAULT_PAGESIZE;
	private int pageIndex = DEFAULT_PAGEINDEX;


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
	
	public String getPageString()
	{
		int start = (this.pageIndex - 1) * this.pageSize + 1;
		return new StringBuilder().append(" limit ").append(String.valueOf(start)).append(",").append(String.valueOf(this.getPageSize())).toString();
	}
}
