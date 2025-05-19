package com.aniket;

public class StrongNumber {
	
	public static int fact(int n)
	{ int prod=1;
		for(int i=1;i<=n;i++)
		{
			prod=prod*i;
		}
		return prod;
	}
	
	public static boolean strong(int n)// 145
	{
		int sum=0;
		int temp=n;///145
		while(n!=0)
		{
			int r=n%10;///r=5  r=4 r=1
			sum=sum+fact(r);//120+24+1
			n=n/10;//14  //1  //0
		}
		if(sum==temp)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(strong(405));
	}

}
