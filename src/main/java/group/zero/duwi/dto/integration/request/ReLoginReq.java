package group.zero.duwi.dto.integration.request;

import java.util.List;
import group.zero.duwi.dto.Req;

public class ReLoginReq extends Req
{
	private String sessionId;

	public ReLoginReq()
	{
	}

	public ReLoginReq(String sessionId, List<Integer> types)
	{
		super(types);
		this.sessionId = sessionId;
	}

	public String getSessionId()
	{
		return sessionId;
	}

	public void setSessionId(String sessionId)
	{
		this.sessionId = sessionId;
	}
}
