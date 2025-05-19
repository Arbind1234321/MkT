package DemoJava;

public class SqureRootOfNumber {
	static int count;
	public static void squreRoot(int a )
	{
		
		for(int i=1;i*i<=a;i++)
		{
		   if(i*i==a)
		   {
			  
			  count++;  
		   }
		 
		}
		if(count==5)
		{
			System.out.println(a);
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		int n=1000;
		
		for(int i=1;i<=n;i++)
		{
			squreRoot(i);
		}
		
	

	}

}
