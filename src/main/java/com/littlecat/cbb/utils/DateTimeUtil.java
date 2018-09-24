package com.littlecat.cbb.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateTimeUtil
{
	private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	private DateTimeUtil()
	{

	}

	public static long getCurrentTime()
	{
		return new Date().getTime();
	}

	public static String getCurrentTimeForDisplay()
	{
		return getCurrentTimeForDisplay(new SimpleDateFormat(DEFAULT_DATE_FORMAT));
	}

	public static String getCurrentTimeForDisplay(SimpleDateFormat df)
	{
		return getTimeForDisplay(new Date(), df);
	}

	public static String getTimeForDisplay(Date date, SimpleDateFormat df)
	{
		return df.format(date);
	}

	public static int getYear(long dateValue)
	{
		return Integer.valueOf(new SimpleDateFormat("yyyy").format(new Date(dateValue)));
	}

	public static int getMonth(long dateValue)
	{
		return Integer.valueOf(new SimpleDateFormat("MM").format(new Date(dateValue)));
	}

	public static int getDay(long dateValue)
	{
		return Integer.valueOf(new SimpleDateFormat("dd").format(new Date(dateValue)));
	}

	// public static void main(String[] args)
	// {
	// Date date = new Date();
	//
	// System.out.println(date.getTime());
	// SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
	// System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
	//
	// System.out.println(getCurrentTimeForDisplay());
	// System.out.println(getYear(date.getTime()));
	// System.out.println(getMonth(date.getTime()));
	// System.out.println(getDay(date.getTime()));
	// }
}
