package DemoJava;
public class Test
{
	public static  boolean isprime( int a)
	{
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
				return false;
		}
		return true;
	}
	public static void  sumOfPrime(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(isprime(a[i]))
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}
	public static void main(String args[])
	{
		int arr[]= {3,0,8,9,11,12};
		sumOfPrime(arr);
		
	}
}
