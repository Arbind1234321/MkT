package DemoJava;

import java.util.Arrays;

public class UppercaseFirst {

	public static void main(String[] args) {
		String str="abc fgh df rhs son";
		System.out.println(str );
     System.out.println(upper(str));
	}
	public static  String  upper(String str)
	{
		String st="";
		String [] s=str.split(" ");
		
		System.out.println(s.length);
		
		for(int i=0;i<s.length;i++)
		{
			st=st+s[i].substring(0,1).toUpperCase()+s[i].substring(1)+" ";
		}
		return st;
	}

}
