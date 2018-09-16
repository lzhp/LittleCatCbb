package com.littlecat.cbb.utils;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public final class ListUtil
{
	private static final String DEFAULT_JOIN_CHAR = ",";

	private ListUtil()
	{

	}

	public static String join2String(List<String> list)
	{
		return StringUtils.join(list, DEFAULT_JOIN_CHAR);
	}

	public static String join2String(List<String> list, String joinStr)
	{
		return StringUtils.join(list, joinStr);
	}
}
