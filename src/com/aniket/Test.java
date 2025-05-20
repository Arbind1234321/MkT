package com.aniket;

public class Test {
	

	public static void main(String[] args) {
		//skip("","abdgeats");
		//System.out.println(skipRet("abdgeats"));
		comb("","abc");
	}
	//WAP to print all posible combination
	public static void comb(String p,String up )
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		comb(p+ch,up.substring(1));
		comb(p,up.substring(1));
		
	}
	//withreturn
	public static String skipRet(String str) {
		int count=0;
		if(str.isEmpty())
		{
			return "";
		}
		char ch=str.charAt(0);
		if(ch=='a')
		{
			count++;
		}
		if(ch=='a' && count==2)
		{
			return skipRet(str.substring(1));
		}
		else {
			return ch+skipRet(str.substring(1));
			
		}
	
		
	}
	
	//without return
	public static void skip(String p,String up)
	{
		if(up.isEmpty())
		{
			System.out.println(p);
			return;
		}
		char ch=up.charAt(0);
		if(ch=='a')
		{
			skip(p,up.substring(1));
		}
		else {
			skip(p+ch,up.substring(1));
			
		}
	}

}
