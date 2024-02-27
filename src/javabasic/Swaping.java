package javabasic;

public class Swaping {
	static void fac(int a)
	{
		
		//5 ==5*4*3*2*1
		int pro=1;
		for(int i=1;i<=a;i++)//pro=120
		{
			
			pro=pro*i;
		}
		System.out.println("Factorial of "+a+" is :"+pro);
	}
	
	static void swapingTird(int a,int b)//2,5
	{
		int tem=a;//tem=2
		  a=b;//a=5
		  b=tem;//b=2
		System.out.println(a);//5
		System.out.println(b);//2
	}
	static void swapingwithOutva(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);//56
		System.out.println(b);//23
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapingTird(2,5);
		//swapingwithOutva(23,56);
		//fac(6);
	}

}
