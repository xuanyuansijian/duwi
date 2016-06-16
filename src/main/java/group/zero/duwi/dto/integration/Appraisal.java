package group.zero.duwi.dto.integration;

import group.zero.duwi.dto.integration.property.ExtraInfo;

// 活动评价
public class Appraisal
{
	// 受评活动Id
	private long acivityId;
	// 受评账户Id
	private long accountId;
	// 活动好评*好评和差评是否仿照主流的评价机制，用�?个区间内的数字表示，1-3差评�?4-5 好评
	private int good;
	// 活动差评
	private int poor;
	// 活动评论
	private ExtraInfo selfInfo;

	public Appraisal()
	{
	}

	public Appraisal(long acivityId, long accountId, int good, int poor, ExtraInfo selfInfo)
	{
		this.acivityId = acivityId;
		this.accountId = accountId;
		this.good = good;
		this.poor = poor;
		this.selfInfo = selfInfo;
	}

	public long getAcivityId()
	{
		return acivityId;
	}

	public void setAcivityId(long acivityId)
	{
		this.acivityId = acivityId;
	}

	public long getAccountId()
	{
		return accountId;
	}

	public void setAccountId(long accountId)
	{
		this.accountId = accountId;
	}

	public int getGood()
	{
		return good;
	}

	public void setGood(int good)
	{
		this.good = good;
	}

	public int getPoor()
	{
		return poor;
	}

	public void setPoor(int poor)
	{
		this.poor = poor;
	}

	public ExtraInfo getSelfInfo()
	{
		return selfInfo;
	}

	public void setSelfInfo(ExtraInfo selfInfo)
	{
		this.selfInfo = selfInfo;
	}
}
