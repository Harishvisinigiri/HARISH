package DrivenTesting;

import java.io.IOException;

public class DemoLibrary {

	public static void main(String[] args) throws IOException 
	{
		FileLib f=new FileLib();
		String url = f.getpropertyData("url");
		String un = f.getpropertyData("username");
		String pw = f.getpropertyData("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		String cn = f.getExelData("createCustomer", 1, 1);
		System.out.println(cn);
	}
}
