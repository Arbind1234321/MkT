package javabasic;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
			System.out.println(sum  +" "+i );
		}
		System.out.println("Average is "+sum/10);

	}

}
