package com.littlecat.cbb.utils;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public final class StringUtil
{
	private static final String DEFAULT_SPLIT_CHAR = ",";

	private StringUtil()
	{
	}

	public static boolean isEmpty(String str)
	{
		return StringUtils.isEmpty(str);
	}

	public static boolean isNotEmpty(String str)
	{
		return !StringUtils.isEmpty(str);
	}

	public static List<String> split2List(String str)
	{
		return split2List(str,DEFAULT_SPLIT_CHAR);
	}
	
	public static List<String> split2List(String str,String splitChar)
	{
		if(StringUtil.isEmpty(str) || splitChar == null)
		{
			return null;
		}
		
		return Arrays.asList(StringUtils.split(str, splitChar));
	}
	
	public static String replace(String src,String oldStr,String newStr)
	{
		return StringUtils.replace(src, oldStr, newStr);
	}
}
