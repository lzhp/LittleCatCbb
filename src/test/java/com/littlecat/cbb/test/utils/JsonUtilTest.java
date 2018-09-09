package com.littlecat.cbb.test.utils;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.type.TypeReference;
import org.junit.Test;

import com.littlecat.cbb.test.model.SubModel;
import com.littlecat.cbb.test.model.TestModel;
import com.littlecat.cbb.utils.JsonUtil;

public class JsonUtilTest
{
	@Test
	public void testToJson()
	{
		TestModel testModel = new TestModel();
		testModel.setIntValue(100);
		testModel.setStrValue("haha");
		testModel.setLongVlaue(1000L);
		testModel.getIntList().add(1);
		testModel.getIntList().add(2);
		testModel.getIntList().add(3);
		
		SubModel subModel = new SubModel();
		subModel.setIntValue(200);
		subModel.setStrValue("hoho");
		
		testModel.setSubModel(subModel);
		
		testModel.getSubModelList().add(subModel);
		testModel.getSubModelList().add(subModel);
		
		String json = JsonUtil.toJson(testModel);
		System.out.println(json);
	}
	
	@Test
	public void testFromJsonToObject()
	{
		String json = "{\"strValue\":\"haha\",\"intValue\":100,\"longVlaue\":1000,\"intList\":[1,2,3],\"subModel\":{\"strValue\":\"hoho\",\"intValue\":200},\"subModelList\":[{\"strValue\":\"hoho\",\"intValue\":200},{\"strValue\":\"hoho\",\"intValue\":200}]}";
		TestModel model = JsonUtil.fromJson(json, TestModel.class);
		System.out.println(JsonUtil.toJson(model));
	}
	
	@Test
	public void testFromJsonToTypeReference()
	{
		String json = "[{\"strValue\":\"haha\",\"intValue\":100,\"longVlaue\":1000,\"intList\":[1,2,3],\"subModel\":{\"strValue\":\"hoho\",\"intValue\":200},\"subModelList\":[{\"strValue\":\"hoho\",\"intValue\":200},{\"strValue\":\"hoho\",\"intValue\":200}]},{\"strValue\":\"haha\",\"intValue\":100,\"longVlaue\":1000,\"intList\":[1,2,3],\"subModel\":{\"strValue\":\"hoho\",\"intValue\":200},\"subModelList\":[{\"strValue\":\"hoho\",\"intValue\":200},{\"strValue\":\"hoho\",\"intValue\":200}]}]";
		List<TestModel> modelList = JsonUtil.fromJson(json, new TypeReference<ArrayList<TestModel>>() {});
		System.out.println(JsonUtil.toJson(modelList));
	}
	
}

