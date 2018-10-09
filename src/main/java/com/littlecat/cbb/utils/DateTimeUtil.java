package com.littlecat.cbb.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.littlecat.cbb.common.Consts;
import com.littlecat.cbb.exception.LittleCatException;

public final class DateTimeUtil
{
	public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final SimpleDateFormat defaultDateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);// 设置日期格式

	private DateTimeUtil()
	{

	}

	public static long getCurrentTime()
	{
		return new Date().getTime();
	}

	public static String getCurrentTimeForDisplay()
	{
		return getCurrentTimeForDisplay(defaultDateFormat);
	}

	public static String getCurrentTimeForDisplay(SimpleDateFormat df)
	{
		return getTimeForDisplay(new Date(), df);
	}

	public static String getTimeForDisplay(Date date, SimpleDateFormat df)
	{
		return df.format(date);
	}
	
	public static String getTimeForDisplay(long date, SimpleDateFormat df)
	{
		return df.format(new Date(date));
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

	public static int getDurationDays(long dateValueStart, long dateValueEnd)
	{
		long dayStart = dateValueStart / (1000 * 3600 * 24);
		long dayEnd = dateValueEnd / (1000 * 3600 * 24);
		return (int) (dayEnd - dayStart);
	}

	/**
	 * 获取两个日期之间相隔的天数
	 * 
	 * @param dateStrStart
	 *            开始日期，字符串：yyyy-MM-dd HH:mm:ss
	 * @param dateStrEnd
	 *            结束日期，字符串：yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static int getDurationDays(String dateStrStart, String dateStrEnd)
	{
		try
		{
			long dayStart = defaultDateFormat.parse(dateStrStart).getTime();
			long dayEnd = defaultDateFormat.parse(dateStrEnd).getTime();

			return getDurationDays(dayStart, dayEnd);
		}
		catch (ParseException e)
		{
			throw new LittleCatException(Consts.ERROR_CODE_PARSE_DATE_ERROR, "parse date from string error", e);
		}
	}

	public static int getDurationDays(String dateStrStart)
	{
		try
		{
			return getDurationDays(defaultDateFormat.parse(dateStrStart).getTime(), new Date().getTime());
		}
		catch (ParseException e)
		{
			throw new LittleCatException(Consts.ERROR_CODE_PARSE_DATE_ERROR, "parse date from string error", e);
		}
	}

	public static void main(String[] args) throws ParseException
	{
		Date date = new Date();

		System.out.println(date.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		System.out.println(df.format(new Date()));// new Date()为获取当前系统时间

		System.out.println(getCurrentTimeForDisplay());
		System.out.println(getYear(date.getTime()));
		System.out.println(getMonth(date.getTime()));
		System.out.println(getDay(date.getTime()));

		System.out.println(getDurationDays(new Date().getTime(), new Date().getTime() + 1000 * 3600 * 24 * 3 + 1000 * 3600));
		System.out.println(getCurrentTime());
		System.out.println(df.format(df.parse("2018-09-30 16:48:09.0")));

		System.out.println(getDurationDays("2018-11-01 16:48:09", "2018-10-2 16:48:09"));

	}
}
