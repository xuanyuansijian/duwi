package group.zero.duwi.dto.integration.request;

import java.util.List;
import group.zero.duwi.dto.Req;

public class LoginReq extends Req
{
	private String loginId;
	private String password;
	private String loginType;
	private List<Double> coordinate;

	public LoginReq()
	{
		super();
	}

	public LoginReq(String loginId, String password, String loginType, List<Double> coordinate)
	{
		super();
		this.loginId = loginId;
		this.password = password;
		this.loginType = loginType;
		this.coordinate = coordinate;
	}

	public String getLoginType()
	{
		return loginType;
	}

	public void setLoginType(String loginType)
	{
		this.loginType = loginType;
	}

	public List<Double> getCoordinate()
	{
		return coordinate;
	}

	public void setCoordinate(List<Double> coordinate)
	{
		this.coordinate = coordinate;
	}

	public String getLoginId()
	{
		return loginId;
	}

	public void setLoginId(String loginId)
	{
		this.loginId = loginId;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}
