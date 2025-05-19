package com.pattern;

public class BasicPattern {
//Star rectangle
	public  static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public  static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public  static void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1 ;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public  static void pattern4(int n)
	{
		for(int i=1;i<=n;i++)
		{
		   for(int s=1;s<n-i+1;s++)
		   {
			   System.out.print(" ");
		   }
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//pyramid pattern
	public  static void pattern5(int n)
	{
		int st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print("*");
			}
			st=st+2;
			System.out.println();
		}
	}
public static  void pattern6(int n)//method called
{
	for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }

        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
        }

        for(int j=i-1;j>=1;j--)
        {
            System.out.print(j);
        }
        System.out.println();
    }
}

	public static void main(String[] args) {
	  pattern6(5);//calling	

	}

}
