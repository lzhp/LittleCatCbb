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
		if(condition == null)
		{
			return null;
		}
		
		if(CollectionUtils.isEmpty(condition.getCondItems()))
		{
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		for (ConditionItem condItem : condition.getCondItems())
		{
			if(StringUtil.isEmpty(condItem.getFieldName()))
			{
				continue;
			}
			switch (condItem.getOpType())
			{
			case euql:
				
				break;
			default:
				break;
			}
		}
		
		return null;
	}
	
	
}
