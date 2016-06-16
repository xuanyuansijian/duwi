package group.zero.duwi.dto.integration.request;

public class LogoutReq
{
	private String sessionId;

	public LogoutReq()
	{
	}

	public LogoutReq(String sessionId)
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
