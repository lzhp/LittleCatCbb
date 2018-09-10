package com.littlecat.cbb.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.type.TypeReference;

import com.littlecat.cbb.common.Consts;
import com.littlecat.cbb.exception.LittleCatException;

/**
 * Json工具类
 * 
 * @author amydady
 *
 */
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
			throw new LittleCatException(Consts.ERROR_CODE_TO_JSON_ERROR,Consts.ERROR_CODE_TO_JSON_ERROR,e);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T fromJson(String str, Class<T> clazz) throws LittleCatException
	{
		if (StringUtil.isEmpty(str))
		{
			throw new LittleCatException(Consts.ERROR_CODE_FROM_JSON_ERROR,Consts.ERROR_CODE_FROM_JSON_ERROR);
		}

		try
		{
			return clazz.equals(String.class) ? (T) str : objectMapper.readValue(str, clazz);
		} 
		catch (IOException e)
		{
			throw new LittleCatException(Consts.ERROR_CODE_FROM_JSON_ERROR,Consts.ERROR_CODE_FROM_JSON_ERROR,e);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T fromJson(String str, TypeReference<T> typeReference) throws LittleCatException
	{
		if (StringUtil.isEmpty(str) || typeReference == null)
		{
			throw new LittleCatException(Consts.ERROR_CODE_FROM_JSON_ERROR,Consts.ERROR_CODE_FROM_JSON_ERROR);
		}
		
		try
		{
			return (T) (typeReference.getType().equals(String.class) ? str : objectMapper.readValue(str, typeReference));
		} 
		catch (IOException e)
		{
			throw new LittleCatException(Consts.ERROR_CODE_FROM_JSON_ERROR,Consts.ERROR_CODE_FROM_JSON_ERROR,e);
		}
	}
}
