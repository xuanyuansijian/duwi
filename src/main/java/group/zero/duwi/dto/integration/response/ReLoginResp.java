package group.zero.duwi.dto.integration.response;

public class ReLoginResp
{
	private String sessionId;

	public ReLoginResp()
	{
		super();
	}

	public ReLoginResp(String sessionId)
	{
		super();
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
