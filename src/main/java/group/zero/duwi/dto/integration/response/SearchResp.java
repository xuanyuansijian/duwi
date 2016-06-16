package group.zero.duwi.dto.integration.response;

import java.util.List;
import group.zero.duwi.dto.integration.Activity;

public class SearchResp
{
	private List<Activity> activities;

	public SearchResp()
	{
		super();
	}

	public SearchResp(List<Activity> activities)
	{
		super();
		this.activities = activities;
	}

	public List<Activity> getActivities()
	{
		return activities;
	}

	public void setActivities(List<Activity> activities)
	{
		this.activities = activities;
	}
}
