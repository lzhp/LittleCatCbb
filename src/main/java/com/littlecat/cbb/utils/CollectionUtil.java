package com.littlecat.cbb.utils;

import java.util.Collection;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;

public final class CollectionUtil
{
	private CollectionUtil()
	{
	}

	public static boolean isEmpty(Collection<?> coll)
	{
		return CollectionUtils.isEmpty(coll);
	}

	public static boolean isNotEmpty(Collection<?> coll)
	{
		return !CollectionUtil.isEmpty(coll);
	}

	@SuppressWarnings("rawtypes")
	public static boolean isEmpty(Map map)
	{
		return MapUtils.isEmpty(map);
	}

	@SuppressWarnings("rawtypes")
	public static boolean isNotEmpty(Map map)
	{
		return MapUtils.isNotEmpty(map);
	}
}
