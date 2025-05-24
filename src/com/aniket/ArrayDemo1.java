package com.aniket;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// how to declare array
		// int []arr=new int [4];
//		int arr[]= {4,5,6,2};// declaration + initialization
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);//4 5  6 
//		}
		// Array input output
		// To find the length of array =---->length
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
//		arr[0]=sc.nextInt();
//		arr[1]=sc.nextInt();
//		arr[2]=sc.nextInt();
//		arr[4]=sc.nextInt();
		// for input
		for (int i = 0; i < arr.length; i++)// 2,3,4 7--index-->0 1 2 3
		{
			arr[i] = sc.nextInt();
		}
		// output
//		System.out.println(" Normal***********");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]+" ");///2 3 4 7
//		}
//		//reverse
//		System.out.println();
//		System.out.println(" Reverse ***********");
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+" ");
//		}

		// for each loop 1.8
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
