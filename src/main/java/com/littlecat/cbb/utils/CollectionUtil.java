package com.littlecat.cbb.utils;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;

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
}
