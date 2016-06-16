package group.zero.duwi.dto.integration.property;

// �?在地
public class Location
{
	// 经度
	private double longitude;
	// 纬度
	private double latitude;
	// 国家
	private String country;
	// �?
	private String province;
	// �?
	private String city;
	// 区或者县
	private String district;
	// 具体地址
	private String definiteAddress;

	public Location()
	{
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public Location(double longitude, double latitude, String country, String province, String city, String district, String definiteAddress)
	{
		super();
		this.longitude = longitude;
		this.latitude = latitude;
		this.country = country;
		this.province = province;
		this.city = city;
		this.district = district;
		this.definiteAddress = definiteAddress;
	}

	public double getLongitude()
	{
		return longitude;
	}

	public void setLongitude(double longitude)
	{
		this.longitude = longitude;
	}

	public double getLatitude()
	{
		return latitude;
	}

	public void setLatitude(double latitude)
	{
		this.latitude = latitude;
	}

	public String getProvince()
	{
		return province;
	}

	public void setProvince(String province)
	{
		this.province = province;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getDistrict()
	{
		return district;
	}

	public void setDistrict(String district)
	{
		this.district = district;
	}

	public String getDefiniteAddress()
	{
		return definiteAddress;
	}

	public void setDefiniteAddress(String definiteAddress)
	{
		this.definiteAddress = definiteAddress;
	}
}
