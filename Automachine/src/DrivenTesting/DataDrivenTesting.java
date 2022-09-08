package DrivenTesting;

import java.util.ArrayList;
import java.util.HashMap;

public class DataDrivenTesting 
{
	public static void main(String[] args) 
	{
		ArrayList<String>a1=new ArrayList<String>();
		a1.add("https://demo.actitime.com/");
		a1.add("admin");
		a1.add("admin@actitime.com");
		a1.add("manager");
		System.out.println(a1.get(2));
		
		HashMap<String,String> hs=new HashMap<String,String>();
		hs.put("url", "https://demo.actitime.com/");
		hs.put("username", "admin");
		hs.put("email", "https://demo.actitime.com/");
		hs.put("password", "manager");
		System.out.println(hs.get("password"));
	}

}
