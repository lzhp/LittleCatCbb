package com.littlecat.cbb.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateTimeUtil
{
	private DateTimeUtil()
	{
		
	}
	
	public static long getCurrentTime()
	{
		return new Date().getTime();
	}
	
	public static String getCurrentTimeDefaultDisplay()
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		return df.format(new Date());
	}
	
	public static String getCurrentTimeForDisplay(SimpleDateFormat df)
	{
		return df.format(new Date());
	}
	
	public static String getTimeForDisplay(Date date,SimpleDateFormat df)
	{
		return df.format(date);
	}
	
//	public static void main(String[] args)
//	{
//		Date date = new Date();
//		System.out.println(date.getTime());
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
//		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
//	}
}
