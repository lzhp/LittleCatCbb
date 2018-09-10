package com.littlecat.cbb.query;


import org.apache.commons.collections.CollectionUtils;

import com.littlecat.cbb.utils.StringUtil;

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
	
	public String getConditionString()
	{
		if(condition == null || CollectionUtils.isEmpty(condition.getCondItems()))
		{
			return "";
		}
		
		StringBuilder sb = new StringBuilder("where 1 = 1 ");
		
		for (ConditionItem condItem : condition.getCondItems())
		{
			String condItemString = condItem.getConditionString();
			if(StringUtil.isEmpty(condItemString))
			{
				continue;
			}
			
			sb.append(this.condition.getLogicType().name()).append(" ").append(condItemString).append(" ");
		}
		
		if(this.pageParam != null)
		{
			sb.append(this.pageParam.getPageString());
		}

		return sb.toString();
	}
}
