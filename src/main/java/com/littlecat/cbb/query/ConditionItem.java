package com.littlecat.cbb.query;

public class ConditionItem
{
	private String fieldName;
	private String value;
	private ConditionOperatorType opType;
	
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
	
	
}
