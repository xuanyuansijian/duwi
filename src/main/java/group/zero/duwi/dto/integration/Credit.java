package group.zero.duwi.dto.integration;

// 个人信誉
// *考虑加个信誉级别，铜级， 银级，金�? ... -> 我们应该有个具体的算法来去计算根据用户自身的具体数据来得出他的等�?, 而不是我们自己设�?
public class Credit
{
	// 创建活动次数
	private int createTimes;
	// 创建活动好评统计
	private int createGoodTotal;
	// 创建活动差评统计
	private int createPoorTotal;
	// 参加活动次数
	private int joinTimes;
	// 参加活动好评统计
	private int joinGoodTotal;
	// 参加活动差评统计
	private int joinPoorTotal;

	public Credit()
	{
		super();
	}

	public Credit(int createTimes, int createGoodTotal, int createPoorTotal, int joinTimes, int joinGoodTotal, int joinPoorTotal)
	{
		super();
		this.createTimes = createTimes;
		this.createGoodTotal = createGoodTotal;
		this.createPoorTotal = createPoorTotal;
		this.joinTimes = joinTimes;
		this.joinGoodTotal = joinGoodTotal;
		this.joinPoorTotal = joinPoorTotal;
	}

	public int getCreateTimes()
	{
		return createTimes;
	}

	public void setCreateTimes(int createTimes)
	{
		this.createTimes = createTimes;
	}

	public int getCreateGoodTotal()
	{
		return createGoodTotal;
	}

	public void setCreateGoodTotal(int createGoodTotal)
	{
		this.createGoodTotal = createGoodTotal;
	}

	public int getCreatePoorTotal()
	{
		return createPoorTotal;
	}

	public void setCreatePoorTotal(int createPoorTotal)
	{
		this.createPoorTotal = createPoorTotal;
	}

	public int getJoinTimes()
	{
		return joinTimes;
	}

	public void setJoinTimes(int joinTimes)
	{
		this.joinTimes = joinTimes;
	}

	public int getJoinGoodTotal()
	{
		return joinGoodTotal;
	}

	public void setJoinGoodTotal(int joinGoodTotal)
	{
		this.joinGoodTotal = joinGoodTotal;
	}

	public int getJoinPoorTotal()
	{
		return joinPoorTotal;
	}

	public void setJoinPoorTotal(int joinPoorTotal)
	{
		this.joinPoorTotal = joinPoorTotal;
	}
}
