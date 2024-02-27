package javabasic;

import java.util.Scanner;

public class Arrayaverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value in arrays");
		int [] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//for sum
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum +arr[i];
		}
		System.out.println(sum/arr.length);

	}

}
