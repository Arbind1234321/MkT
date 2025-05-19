package com.aniket;
//Square of number 2^5=32  #3^3=27
public class MathsDemo {
	
	public static int power(int a,int b)// 2*2*2
	{
		int p=1;
		for(int i=1;i<=b;i++)
		{
			p=a*p;
		}
		return p;
	}
	public static int powOfNum(int num, int pow) {//2 3 2 1 0
		int pw=1;//pw=4
		while(pow>0)
		{
			pw=pw*num;//8
			pow--;//
		}
		return pw;
	}

	public static void main(String[] args) {//8^5==8*8*8*8*8
		  System.out.println(power(6,10));
       
	}

}
