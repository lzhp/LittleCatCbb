package com.littlecat.cbb.exception;

public class LittleCatException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	private String errorCode;

	public LittleCatException(String message)
	{
		super(message);
	}

	public LittleCatException(String errorCode, String message)
	{
		super(message);
		this.errorCode = errorCode;
	}

	public LittleCatException(String errorCode, String message, Throwable cause)
	{
		super(message, cause);
		this.errorCode = errorCode;
	}

	public LittleCatException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public String getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}

	//测试代码
	public static void main(String[] args)
	{
		try
		{
			System.out.println(100 / 0);
		}
		catch (Exception e)
		{
			System.out.println(new LittleCatException("haha", e).getMessage());
			throw new LittleCatException("haha", e);
		}
		throw new LittleCatException("haha");
	}
}
