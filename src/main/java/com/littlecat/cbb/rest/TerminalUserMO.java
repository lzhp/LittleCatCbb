package com.littlecat.cbb.rest;

/**
 * 终端用户
 * 
 * @author amydady
 *
 */
public class TerminalUserMO
{
	private String id;
	private String wxCode;
	private String createTime;
	private String isTuanZhang; // 是否为团长（社圈长）
	private String isMaiShou; // 是否为买手
	private String enable;

	public TerminalUserMO()
	{
		super();
	}

	public String getWxCode()
	{
		return wxCode;
	}

	public void setWxCode(String wxCode)
	{
		this.wxCode = wxCode;
	}

	public String getCreateTime()
	{
		return createTime;
	}

	public void setCreateTime(String createTime)
	{
		this.createTime = createTime;
	}

	public String getIsTuanZhang()
	{
		return isTuanZhang;
	}

	public void setIsTuanZhang(String isTuanZhang)
	{
		this.isTuanZhang = isTuanZhang;
	}

	public String getIsMaiShou()
	{
		return isMaiShou;
	}

	public void setIsMaiShou(String isMaiShou)
	{
		this.isMaiShou = isMaiShou;
	}

	public String getEnable()
	{
		return enable;
	}

	public void setEnable(String enable)
	{
		this.enable = enable;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}
}
