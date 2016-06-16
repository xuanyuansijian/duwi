package group.zero.duwi.dto;

public class Message<T>
{
	private Header header;
	private T Body;

	public Message()
	{
		super();
	}

	public Message(Header header, T body)
	{
		super();
		this.header = header;
		Body = body;
	}

	public Header getHeader()
	{
		return header;
	}

	public void setHeader(Header header)
	{
		this.header = header;
	}

	public T getBody()
	{
		return Body;
	}

	public void setBody(T body)
	{
		Body = body;
	}
}
