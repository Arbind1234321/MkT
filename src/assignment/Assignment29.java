package assignment;

import java.util.Scanner;

public class Assignment29 {
	static void add(int a, int b)
	{
	int sum=a+b;
	System.out.println(sum);
	}
	static void sub(int a, int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
	static void mul(int a, int b)
	{
		int mul=a*b;
		System.out.println(mul);
	}
	static void div(int a, int b)
	{
		int div= a/2;
		System.out.println(div);
	}
	static void mod(int a, int b)
	{
		int mod=a%b;
		System.out.println(mod);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		add(a,b);
		sub(a, b);
		mul(a, b);
		div(a, b);
		mod(a, b);
	   
	

	}

}
