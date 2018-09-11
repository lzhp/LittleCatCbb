package com.littlecat.cbb.test.model;

import java.util.ArrayList;
import java.util.List;

import com.littlecat.cbb.query.ConditionOperatorType;

public class TestModel
{
	private String strValue;
	private int intValue;
	private long longVlaue;
	private ConditionOperatorType operatorType;
	
	private List<Integer> intList = new ArrayList<Integer>();
	
	private SubModel subModel;
	private List<SubModel> subModelList = new ArrayList<SubModel>();

	public String getStrValue()
	{
		return strValue;
	}

	public void setStrValue(String strValue)
	{
		this.strValue = strValue;
	}

	public int getIntValue()
	{
		return intValue;
	}

	public void setIntValue(int intValue)
	{
		this.intValue = intValue;
	}

	public long getLongVlaue()
	{
		return longVlaue;
	}

	public void setLongVlaue(long longVlaue)
	{
		this.longVlaue = longVlaue;
	}

	public List<Integer> getIntList()
	{
		return intList;
	}

	public void setIntList(List<Integer> intList)
	{
		this.intList = intList;
	}

	public SubModel getSubModel()
	{
		return subModel;
	}

	public void setSubModel(SubModel subModel)
	{
		this.subModel = subModel;
	}

	public List<SubModel> getSubModelList()
	{
		return subModelList;
	}

	public void setSubModelList(List<SubModel> subModelList)
	{
		this.subModelList = subModelList;
	}

	public ConditionOperatorType getOperatorType()
	{
		return operatorType;
	}

	public void setOperatorType(ConditionOperatorType operatorType)
	{
		this.operatorType = operatorType;
	}
	
	
}