package com.littlecat.cbb.query;

/**
 * Rest接口查询参数
 * amydady
 *
 */
public class QueryParam
{
	private QueryCondition condition;
	private PageParam pageParam;
	
	public QueryCondition getCondition()
	{
		return condition;
	}
	public void setCondition(QueryCondition condition)
	{
		this.condition = condition;
	}
	public PageParam getPageParam()
	{
		return pageParam;
	}
	public void setPageParam(PageParam pageParam)
	{
		this.pageParam = pageParam;
	}
	
	
}
