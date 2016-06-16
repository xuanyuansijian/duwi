package group.zero.duwi.dto.integration;

import group.zero.duwi.dto.integration.property.ExtraInfo;

// 加入活动信息
public class Join
{
	// 活动Id
	private long activityId;
	// 参与者的注释信息
	private ExtraInfo remark;

	public Join()
	{
	}

	public Join(long activityId, ExtraInfo remark)
	{
		this.activityId = activityId;
		this.remark = remark;
	}

	public long getActivityId()
	{
		return activityId;
	}

	public void setActivityId(long activityId)
	{
		this.activityId = activityId;
	}

	public ExtraInfo getRemark()
	{
		return remark;
	}

	public void setRemark(ExtraInfo remark)
	{
		this.remark = remark;
	}
}
