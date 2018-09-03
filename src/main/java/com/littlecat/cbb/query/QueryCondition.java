package com.littlecat.cbb.query;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询条件
 * amydady
 *
 */
public class QueryCondition
{
	private ConditionLogicType logicType = ConditionLogicType.and;
	private List<ConditionItem> condItems = new ArrayList<ConditionItem>();
	
	public ConditionLogicType getLogicType()
	{
		return logicType;
	}
	public void setLogicType(ConditionLogicType logicType)
	{
		this.logicType = logicType;
	}
	public List<ConditionItem> getCondItems()
	{
		return condItems;
	}
	public void setCondItems(List<ConditionItem> condItems)
	{
		this.condItems = condItems;
	}
	
	
}
