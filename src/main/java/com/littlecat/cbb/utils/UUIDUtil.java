package com.littlecat.cbb.utils;

import java.util.UUID;

public final class UUIDUtil
{
	private UUIDUtil()
	{
		
	}
	
	public static String createUUID()
	{
		return UUID.randomUUID().toString();
	}
	
//	public static void main(String[] args)
//	{
//		System.out.println(createUUID());
//	}
}
