package group.zero.duwi.dto;

import java.util.List;

public class Req
{
	private List<Integer> types;

	public Req()
	{
	}

	public Req(List<Integer> types)
	{
		super();
		this.types = types;
	}

	public List<Integer> getTypes()
	{
		return types;
	}

	public void setTypes(List<Integer> types)
	{
		this.types = types;
	}
}
