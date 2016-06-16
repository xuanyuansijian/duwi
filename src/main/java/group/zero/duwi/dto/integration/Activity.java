package group.zero.duwi.dto.integration;

import group.zero.duwi.dto.integration.property.ExtraInfo;
import group.zero.duwi.dto.integration.property.Location;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

// 活动信息
public class Activity
{
	private long id;
	// 活动类型
	private String type;
	// 该活动是预定性质的活动还是及时开始�?�质的活�?
	private boolean isImmediate;
	// 活动状�??*这个�?要画个图讨论�?下活动的状�?�和生命周期
	private String status;
	// 活动等级
	private int level;
	// 活动召集人员�?始时�?
	private Timestamp from;
	// 活动召集人员结束时间
	private Timestamp to;
	// 活动的持续时�?
	private long timeRange;
	// 活动地址
	private Location location;
	// 活动人数上限
	private int personMax;
	// 活动人数下限
	private int personMin;
	// 活动备注�?*这个备注可以留着说明�?些召集人员的条件，比如有些活动需要安静的环境，要求参与人员不能太吵之�?
	// 有些活动可能�?要参与人员携带必要的装备
	private String comment;
	// 活动金额:可以是参与�?�缴纳费�?,也可以是创办者支付给参与者费�?
	private double money;
	// 活动信息展示
	private List<ExtraInfo> selfInfos = new ArrayList<ExtraInfo>();
	// 活动次数
	private int times;
	// 活动排名提前等级(该项可用于收�?)
	private int topLevel;

	public Activity()
	{
	}

	public Activity(String type, boolean isImmediate, String status, int level, Timestamp from, Timestamp to, long timeRange,
			Location location, int personMax, int personMin, String comment, double money, List<ExtraInfo> selfInfos, int times, int topLevel)
	{
		this.type = type;
		this.isImmediate = isImmediate;
		this.status = status;
		this.level = level;
		this.from = from;
		this.to = to;
		this.timeRange = timeRange;
		this.location = location;
		this.personMax = personMax;
		this.personMin = personMin;
		this.comment = comment;
		this.money = money;
		this.selfInfos = selfInfos;
		this.times = times;
		this.topLevel = topLevel;
	}

	public Location getLocation()
	{
		return location;
	}

	public void setLocation(Location location)
	{
		this.location = location;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public long getId()
	{
		return id;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public boolean isImmediate()
	{
		return isImmediate;
	}

	public void setImmediate(boolean isImmediate)
	{
		this.isImmediate = isImmediate;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public int getLevel()
	{
		return level;
	}

	public void setLevel(int level)
	{
		this.level = level;
	}

	public Timestamp getFrom()
	{
		return from;
	}

	public void setFrom(Timestamp from)
	{
		this.from = from;
	}

	public Timestamp getTo()
	{
		return to;
	}

	public void setTo(Timestamp to)
	{
		this.to = to;
	}

	public long getTimeRange()
	{
		return timeRange;
	}

	public void setTimeRange(long timeRange)
	{
		this.timeRange = timeRange;
	}

	public int getPersonMax()
	{
		return personMax;
	}

	public void setPersonMax(int personMax)
	{
		this.personMax = personMax;
	}

	public int getPersonMin()
	{
		return personMin;
	}

	public void setPersonMin(int personMin)
	{
		this.personMin = personMin;
	}

	public String getComment()
	{
		return comment;
	}

	public void setComment(String comment)
	{
		this.comment = comment;
	}

	public double getMoney()
	{
		return money;
	}

	public void setMoney(double money)
	{
		this.money = money;
	}

	public int getTimes()
	{
		return times;
	}

	public void setTimes(int times)
	{
		this.times = times;
	}

	public int getTopLevel()
	{
		return topLevel;
	}

	public void setTopLevel(int topLevel)
	{
		this.topLevel = topLevel;
	}

	public List<ExtraInfo> getSelfInfos()
	{
		return selfInfos;
	}

	public void setSelfInfos(List<ExtraInfo> selfInfos)
	{
		this.selfInfos = selfInfos;
	}
}
