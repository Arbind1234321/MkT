package assignment;

import java.util.Scanner;

import javabasic.Scanneer;

public class FiveDifferntMethod {
	
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	static void sub(int a, int b)
	{
		System.out.println(a-b);
	}
	static void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	static void div(int a, int b)
	{
		System.out.println(a/b);
	}
	static void mod(int a, int b)
	{
		System.out.println(a%b);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		add(a,b);
		

	}

}
