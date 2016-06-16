package group.zero.duwi.dto;

import java.util.Map;

public class Header
{
	private int type;
	private String messageId;
	private String systemId;
	private String channel;
	private String control;
	private Map<String, String> expandInfo;
	private int errorCode;
	private String errorMessage;

	public Header()
	{
		super();
	}

	public Header(int type, String messageId, String systemId, String channel, String control,
			Map<String, String> expandInfo, int errorCode, String errorMessage)
	{
		super();
		this.type = type;
		this.messageId = messageId;
		this.systemId = systemId;
		this.channel = channel;
		this.control = control;
		this.expandInfo = expandInfo;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getType()
	{
		return type;
	}

	public void setType(int type)
	{
		this.type = type;
	}

	public String getMessageId()
	{
		return messageId;
	}

	public void setMessageId(String messageId)
	{
		this.messageId = messageId;
	}

	public String getSystemId()
	{
		return systemId;
	}

	public void setSystemId(String systemId)
	{
		this.systemId = systemId;
	}

	public String getChannel()
	{
		return channel;
	}

	public void setChannel(String channel)
	{
		this.channel = channel;
	}

	public String getControl()
	{
		return control;
	}

	public void setControl(String control)
	{
		this.control = control;
	}

	public Map<String, String> getExpandInfo()
	{
		return expandInfo;
	}

	public void setExpandInfo(Map<String, String> expandInfo)
	{
		this.expandInfo = expandInfo;
	}

	public int getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(int errorCode)
	{
		this.errorCode = errorCode;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}
}
