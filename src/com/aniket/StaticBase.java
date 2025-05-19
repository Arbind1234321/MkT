package com.aniket;

public class StaticBase {
//	static int i=10;
//	static{
//		m1();
//		System.out.println("First static block");	
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//     m1();
//     System.out.println("main method");
//     
//	}
//	
//	public static void m1()
//	{
//		System.out.println(j);
//	}
//	static  {
//		System.out.println("second static block");
//	}
//	static int j=20;
	
	   static {
	        System.out.println("Hello from static block!");
	        System.exit(0); // to avoid 'main method not found' error
	    }

}
