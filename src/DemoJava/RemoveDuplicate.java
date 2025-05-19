package DemoJava;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int []arr= {1,2,2,3,4,4,5};
		//System.out.println(Arrays.toString(removeDuplicate(arr)));
		removeDuplicate(arr);
		

	}
	public static void removeDuplicate(int []arr)
	{
		
	     int count =0;
	    
		for(int i=0;i<arr.length;i++)
		{
			
			if(i<arr.length-1 && arr[i]==arr[i+1])
			{
			 continue;
			}
			else
			{
				arr[count++]=arr[i];
			}
			
		}
		for(int i=0; i<count;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
