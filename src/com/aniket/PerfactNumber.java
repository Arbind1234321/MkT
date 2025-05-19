package com.aniket;

public class PerfactNumber {
	
	public static  boolean perfact(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
			return true;
		else
			return false;
	}
	public static  void perfactAll()
	{
		for(int i=1;i<=500;i++)
		{
			if(perfact(i))
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
	 //System.out.println(perfact(121));
		perfactAll();
	}

}
