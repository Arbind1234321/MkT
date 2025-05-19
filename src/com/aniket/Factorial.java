package com.aniket;

import java.util.Scanner;

public class Factorial {
	
	public static int  factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product=product*i;
		}
		return product;
	}
	public static void main(String[] args) {//4=24
		//System.out.println(factorial(6));
		
		for(int i=4;i<=8;i++)
		{
			System.out.println(factorial(i));
		}
			}

}
