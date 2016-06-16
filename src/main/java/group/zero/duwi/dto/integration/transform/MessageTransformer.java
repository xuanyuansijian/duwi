package group.zero.duwi.dto.integration.transform;

import com.google.gson.Gson;

public class MessageTransformer
{
	private static MessageTransformer transformer = null;
	private Gson g;

	private MessageTransformer()
	{
		g = new Gson();
	}

	synchronized public static MessageTransformer getInstance()
	{
		if (transformer == null)
		{
			transformer = new MessageTransformer();
		}
		return transformer;
	}

	public int decodeType(String message)
	{
		MessageTransition trans = g.fromJson(message, MessageTransition.class);
		Header header = g.fromJson(trans.getHeader(), Header.class);
		return header.getType();
	}

	public <T> Message<T> decode(String message, Class<T> clazz)
	{
		Message<T> rta = new Message<T>();
		MessageTransition trans = g.fromJson(message, MessageTransition.class);
		Header header = g.fromJson(trans.getHeader(), Header.class);
		rta.setHeader(header);
		T body = g.fromJson(trans.getBody(), clazz);
		rta.setBody(body);
		return rta;
	}

	public <T> String encode(Message<T> rta, Class<T> clazz)
	{
		String header = g.toJson(rta.getHeader(), Header.class);
		String body = g.toJson(rta.getBody(), clazz);
		MessageTransition trans = new MessageTransition();
		trans.setHeader(header);
		trans.setBody(body);
		String message = g.toJson(trans, MessageTransition.class);
		return message;
	}

	public Gson getGson()
	{
		return g;
	}
}
