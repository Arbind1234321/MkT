package javabasic;

public class Power {

	public static void main(String[] args) {
		int a=6;
		int n=1000000000;
		int p=58888888;
		long ans=1;
		
		for(int i=1;i<=n;i++)
		{
			ans=(ans*a)%p;
		}
		System.out.println(ans);

	}

}
