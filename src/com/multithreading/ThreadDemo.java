package com.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();// starting thred
	//	System.out.println(t.getClass().getName());
		for(int i=0;i<=1;i++)
		{
			System.out.println("Main thread");
		}
	}

}
