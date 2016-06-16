package group.zero.duwi.dto.integration;

import group.zero.duwi.dto.integration.property.ExtraInfo;
import group.zero.duwi.dto.integration.property.Location;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 账户信息
public class Account
{
	// 系统分配id
	private long id;
	// 用户�?(可使用其注册我们系统的用户名来登�?)
	private String username;
	// 密码
	private String password;
	// 验证信息
	private Map<String, String> pwdProtection = new HashMap<String, String>();
	// 昵称
	private String nickname;
	// 真实姓名
	private String realName;
	// 年龄
	private String age;
	// 身份�?
	private String identity;
	// 地址
	// �?在位置坐�?
	// *这个没必要我们是基于LBS的不�?要地�? -> 这个先留�?�?, 里面可以至少存储�?在城市的信息, 因为在favor里面会有区域搜索�?
	private Location location;
	// 其他关联帐号(电话号码,电子邮件,QQ,微博,微信,等登录类�?)
	private Map<String, String> loginInfoMap = new HashMap<String, String>();
	// 用户创建时间
	private Timestamp createTime;
	// 用户个人信息展示
	private List<ExtraInfo> selfInfos = new ArrayList<ExtraInfo>();

	public Account()
	{
	}

	public Account(String username, String password, Map<String, String> pwdProtection, String nickname, String realName, String age,
			String identity, Location location, Map<String, String> loginInfoMap, Timestamp createTime, List<ExtraInfo> selfInfos)
	{
		this.username = username;
		this.password = password;
		this.pwdProtection = pwdProtection;
		this.nickname = nickname;
		this.realName = realName;
		this.age = age;
		this.identity = identity;
		this.location = location;
		this.loginInfoMap = loginInfoMap;
		this.createTime = createTime;
		this.selfInfos = selfInfos;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Map<String, String> getPwdProtection()
	{
		return pwdProtection;
	}

	public void setPwdProtection(Map<String, String> pwdProtection)
	{
		this.pwdProtection = pwdProtection;
	}

	public long getId()
	{
		return id;
	}

	public String getNickname()
	{
		return nickname;
	}

	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	public String getRealName()
	{
		return realName;
	}

	public void setRealName(String realName)
	{
		this.realName = realName;
	}

	public String getAge()
	{
		return age;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public Location getLocation()
	{
		return location;
	}

	public void setLocation(Location location)
	{
		this.location = location;
	}

	public List<ExtraInfo> getSelfInfos()
	{
		return selfInfos;
	}

	public void setSelfInfos(List<ExtraInfo> selfInfo)
	{
		this.selfInfos = selfInfo;
	}

	public String getIdentity()
	{
		return identity;
	}

	public void setIdentity(String identity)
	{
		this.identity = identity;
	}

	public Timestamp getCreateTime()
	{
		return createTime;
	}

	public Map<String, String> getLoginInfoMap()
	{
		return loginInfoMap;
	}

	public void setLoginInfoMap(Map<String, String> loginInfoMap)
	{
		this.loginInfoMap = loginInfoMap;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public void setCreateTime(Timestamp createTime)
	{
		this.createTime = createTime;
	}
}
