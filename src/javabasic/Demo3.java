package javabasic;
//this  is the solution  without using constructor or without passing parameter in methods without
//Creating object in main method
import java.util.Scanner;

public class Demo3 {
	int a;
	int b;
	static void add() {
	   Demo3 d=new Demo3();
	   Scanner sc = new Scanner(System.in);
	   d.a = sc.nextInt();
	   d.b = sc.nextInt();
	   System.out.println();
	  System.out.println(d.a+d.b);
	}
	
	public static void main(String[] args)
	{
		add();
	}

}
