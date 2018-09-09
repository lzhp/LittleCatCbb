package com.littlecat.cbb.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.type.TypeReference;

public final class JsonUtil
{
	private static ObjectMapper objectMapper = new ObjectMapper();

	static
	{
		// 对象字段全部列入
		objectMapper.setSerializationInclusion(Inclusion.NON_DEFAULT);

		// 取消默认转换timestamps形式
		objectMapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);

		// 忽略空bean转json的错误
		objectMapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);

		// 统一日期格式yyyy-MM-dd HH:mm:ss
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

		// 忽略在json字符串中存在,但是在java对象中不存在对应属性的情况
		objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	private JsonUtil()
	{
		
	}

	public static <T> String toJson(T obj)
	{
		if (obj == null)
		{
			return null;
		}
		try
		{
			return obj instanceof String ? (String) obj : objectMapper.writeValueAsString(obj);
		} 
		catch (Exception e)
		{
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T fromJson(String str, Class<T> clazz)
	{
		if (StringUtil.isEmpty(str))
		{
			return null;
		}

		try
		{
			return clazz.equals(String.class) ? (T) str : objectMapper.readValue(str, clazz);
		} 
		catch (IOException e)
		{
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T fromJson(String str, TypeReference<T> typeReference)
	{
		if (StringUtil.isEmpty(str) || typeReference == null)
		{
			return null;
		}
		
		try
		{
			return (T) (typeReference.getType().equals(String.class) ? str : objectMapper.readValue(str, typeReference));
		} 
		catch (IOException e)
		{
			return null;
		}
	}
}
