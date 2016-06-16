package group.zero.duwi.dto.zero.test;

import java.util.Date;

import com.google.gson.Gson;

public class Testing
{
	public static void main(String[] args)
	{
		Gson g = new Gson();
		String t = g.toJson(new Date());
		Date d = g.fromJson(t, Date.class);
		System.out.println(d.toString());
	}
}
