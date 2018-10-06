package com.littlecat.cbb.query;

import org.apache.commons.collections.CollectionUtils;

import com.littlecat.cbb.utils.StringUtil;

/**
 * Rest接口查询参数
 * 
 * @author amydady
 *
 */
public class QueryParam
{
	public static final String SORT_TYPE_ASC = "asc";
	public static final String SORT_TYPE_DESC = "desc";

	private QueryCondition condition;
	private PageParam pageParam;
	private String sortFields; // 排序字段，以逗号分隔
	private String sortType = SORT_TYPE_ASC; // 排序方式，默认升序

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

	/**
	 * 是否需要分页查询
	 * 
	 * @return
	 */
	public boolean needPage()
	{
		return pageParam != null;
	}

	public String getQueryCountConditionString()
	{
		return new StringBuilder().append(getWhereString()).toString();
	}

	public String getQueryDataConditionString()
	{
		return new StringBuilder().append(getWhereString()).append(getOrderString()).append(getPageString()).toString();
	}

	private String getWhereString()
	{
		if (condition == null || CollectionUtils.isEmpty(condition.getCondItems()))
		{
			return "";
		}

		StringBuilder sb = new StringBuilder(" where 1 = 1 ");

		for (ConditionItem condItem : condition.getCondItems())
		{
			String condItemString = condItem.getConditionString();
			if (StringUtil.isEmpty(condItemString))
			{
				continue;
			}

			sb.append(this.condition.getLogicType().name()).append(" ").append(condItemString).append(" ");
		}

		return sb.toString();
	}

	private String getOrderString()
	{
		if (StringUtil.isEmpty(sortFields))
		{
			return "";
		}

		return " order by " + sortFields + " " + this.sortType;
	}

	private String getPageString()
	{
		if (pageParam == null)
		{
			return "";
		}

		return this.pageParam.getPageString();
	}

}
