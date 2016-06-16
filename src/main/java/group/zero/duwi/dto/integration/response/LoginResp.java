package group.zero.duwi.dto.integration.response;

import java.util.List;
import group.zero.duwi.dto.integration.Account;
import group.zero.duwi.dto.integration.Activity;
import group.zero.duwi.dto.integration.Appraisal;
import group.zero.duwi.dto.integration.Credit;
import group.zero.duwi.dto.integration.Favor;

public class LoginResp
{
	private Account account;
	private Appraisal appraisal;
	private Credit credit;
	private List<Favor> favors;
	private List<Activity> createActivities;
	private List<Activity> joinActivities;

	public LoginResp()
	{
		super();
	}

	public LoginResp(Account account, Appraisal appraisal, Credit credit, List<Favor> favors,
			List<Activity> createActivities, List<Activity> joinActivities)
	{
		super();
		this.account = account;
		this.appraisal = appraisal;
		this.credit = credit;
		this.favors = favors;
		this.createActivities = createActivities;
		this.joinActivities = joinActivities;
	}

	public Account getAccount()
	{
		return account;
	}

	public void setAccount(Account account)
	{
		this.account = account;
	}

	public List<Activity> getCreateActivities()
	{
		return createActivities;
	}

	public void setCreateActivities(List<Activity> createActivities)
	{
		this.createActivities = createActivities;
	}

	public List<Activity> getJoinActivities()
	{
		return joinActivities;
	}

	public void setJoinActivities(List<Activity> joinActivities)
	{
		this.joinActivities = joinActivities;
	}

	public Appraisal getAppraisal()
	{
		return appraisal;
	}

	public void setAppraisal(Appraisal appraisal)
	{
		this.appraisal = appraisal;
	}

	public List<Favor> getFavors()
	{
		return favors;
	}

	public void setFavors(List<Favor> favors)
	{
		this.favors = favors;
	}

	public Credit getCredit()
	{
		return credit;
	}

	public void setCredit(Credit credit)
	{
		this.credit = credit;
	}
}
