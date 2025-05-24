package com.aniket;

public class ArrrayDemo2 {

	public static void main(String[] args) {
		//WAP to print sum of all array
		int [] arr= {1,3,4,5,8};//21
		
		
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]&1)==0)
			{
				System.out.println(arr[i]);
			}
		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		int sum=0;
//		for(int i=0;i< arr.length;i++)
//		{
//			System.out.println(i );
//			sum=sum+arr[i];//1+3=4+5
//			System.out.println(sum);
//		}
//		System.out.println(sum);
//		
//		//product 
//		int prod=1;
//		for(int i=0;i<arr.length;i++)
//		{
//			prod=prod*arr[i];
//		}
//		System.out.println(prod);
//	
//		for(int a:arr) 
//		{
//			sum +=a;
//		}
//		System.out.println(sum);
//		for(int a:arr)
//		{
//			if(isPrime(a))
//			{
//				System.out.println(a);
//			}
//		}
//		
//		
//	}
//
//	public static boolean isPrime(int a) {
//		 if(a<=1)
//		 {
//			 return false;
//		 }
//		 for(int i=2;i<=a/2;i++)
//		 {
//			 if(a%i==0)
//			 {
//				 return false;
//			 }
//		 }
//		 return true;
//			 
//	}
	}
}

			 
			 
			 
			 
			 
			 
			 
			 