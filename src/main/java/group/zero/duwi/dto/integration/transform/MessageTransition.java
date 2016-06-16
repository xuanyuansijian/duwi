package group.zero.duwi.dto.integration.transform;

public class MessageTransition
{
	private String header;
	private String body;

	public String getHeader()
	{
		return header;
	}

	public MessageTransition()
	{
		super();
	}

	public MessageTransition(String header, String body)
	{
		super();
		this.header = header;
		this.body = body;
	}

	public void setHeader(String header)
	{
		this.header = header;
	}

	public String getBody()
	{
		return body;
	}

	public void setBody(String body)
	{
		this.body = body;
	}
}
