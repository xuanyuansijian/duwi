package group.zero.duwi.dto.integration.request;

import java.util.List;
import group.zero.duwi.dto.integration.Favor;
import group.zero.duwi.dto.integration.property.Location;

// *搜索请求还应该有更复杂的类型，过滤条件应包括这些：偏好，区域（哪个城市地�?)，时间，关键字词组， 费用预算限制 ...
// 高级的搜索这些条件都应该允许用户定制，基本的搜索部分条件逐个给默认�??
// 查找周边活动
public class SearchReq
{
	// 用户偏好列表
	private List<Favor> favors;
	// 搜索区域
	private Location location;
	// 搜索范围半径
	private double radius;

	public SearchReq()
	{
	}

	public SearchReq(List<Favor> favors, Location location, double radius)
	{
		this.favors = favors;
		this.location = location;
		this.radius = radius;
	}

	public List<Favor> getFavors()
	{
		return favors;
	}

	public Location getLocation()
	{
		return location;
	}

	public void setLocation(Location location)
	{
		this.location = location;
	}

	public void setFavors(List<Favor> favors)
	{
		this.favors = favors;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}
}
