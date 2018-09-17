package com.littlecat.cbb.query;

import com.littlecat.cbb.utils.StringUtil;

public class ConditionItem
{
	private String fieldName;
	private String value;
	private ConditionOperatorType opType;
	
	public ConditionItem(String fieldName, String value, ConditionOperatorType opType)
	{
		super();
		this.fieldName = fieldName;
		this.value = value;
		this.opType = opType;
	}
	
	public String getFieldName()
	{
		return fieldName;
	}
	public void setFieldName(String fieldName)
	{
		this.fieldName = fieldName;
	}
	public String getValue()
	{
		return value;
	}
	public void setValue(String value)
	{
		this.value = value;
	}
	public ConditionOperatorType getOpType()
	{
		return opType;
	}
	public void setOpType(ConditionOperatorType opType)
	{
		this.opType = opType;
	}
	
	public boolean isValid()
	{
		if (StringUtil.isEmpty(this.getFieldName()))
		{
			return false;
		}
		if (StringUtil.isEmpty(this.getValue()))
		{
			return false;
		}
		if (this.getOpType() == null)
		{
			return false;
		}
		
		return true;
	}
	
	public String getConditionString()
	{
		if(!isValid())
		{
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		switch (getOpType())
		{
			case equal:
				sb.append(this.getFieldName()).append(" = '").append(this.getValue()).append("'");
				break;
			case like:
				sb.append(this.getFieldName()).append(" like '%").append(this.getValue()).append("%'");
				break;
			case startwith:
				sb.append(this.getFieldName()).append(" like '").append(this.getValue()).append("%'");
				break;
			case endwith:
				sb.append(this.getFieldName()).append(" like '%").append(this.getValue()).append("'");
				break;
			case in:
				sb.append(this.getFieldName()).append(" in (").append(this.getValue()).append(")");
				break;
			case gt:
				sb.append(this.getFieldName()).append(" > ").append(this.getValue());
				break;
			case lt:
				sb.append(this.getFieldName()).append(" < ").append(this.getValue());
				break;
			case gte:
				sb.append(this.getFieldName()).append(" >= ").append(this.getValue());
				break;
			case lte:
				sb.append(this.getFieldName()).append(" <= ").append(this.getValue());
				break;
			default:
				return null;
		}
		
		return sb.toString();
	}
	
}
