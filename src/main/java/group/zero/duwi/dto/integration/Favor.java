package group.zero.duwi.dto.integration;

// 用户个人参与活动的偏�?(以及搜索偏好)
// *是否加个偏好热度，有些偏好可能很热，有些很冷，后期数据统计也方便�?�? -> 热度统计应该是一个单独的功能,就好比百度的关键字排�?, 否则每次都去�?索一次�?�数, 会降低数据库的执行效�?
public class Favor
{
	// 活动类型关键�?
	private String keyword;
	// 该活动类型是否可�?
	private boolean isUsed;

	public Favor()
	{
	}

	public Favor(String keyword, boolean isUsed)
	{
		this.keyword = keyword;
		this.isUsed = isUsed;
	}

	public String getKeyword()
	{
		return keyword;
	}

	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}

	public boolean isUsed()
	{
		return isUsed;
	}

	public void setUsed(boolean isUsed)
	{
		this.isUsed = isUsed;
	}
}
