package com.multithreading;
//Defining  thread
public class MyThread extends Thread {
	@Override
	public void run()
	{
		//System.out.println(t.getName());
		for(int i=0;i<=1;i++)
		{
			System.out.println("Child thread");
			System.out.println(Thread.currentThread().getName());
		}
	}
	

}
