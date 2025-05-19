package DemoJava;

public class SumPair {

	public static void main(String[] args) {
	 int []arr= {1,2,3,4,6,7};
	 int target=13;
	 sumPair(arr, target);

	}
	public static void sumPair(int []arr,int target)
	{
		boolean b=true;
		int start=0;
		int end=arr.length-1;
		while(start<end)
		{
			if(arr[start]+arr[end]>target)
			{
				end--;
			}
			else if(arr[start]+arr[end]<target)
			{
				start++;
			}
			else if(arr[start]+arr[end]==target)
			{
				System.out.println("("+arr[start]+","+arr[end]+")");
				start++;
				end--;
				b=false;
			}
			
			
		}
		if(b)
		{
			System.out.println("no such pair exist");
		}
	}

}
