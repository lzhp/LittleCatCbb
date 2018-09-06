package com.littlecat.cbb.utils;

import org.apache.commons.lang3.StringUtils;

public final class StringUtil
{
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
}
