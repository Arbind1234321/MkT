package DemoJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;



public class Demo {
	


	public static void main(String[] args)
	{
	   
	  //System.out.println(sum(1,2,57,0,4));
	  //System.out.println(product(2,3,));

	  
       

	}
    public static int sum(int ...x)
    { 
    	int sum=0;
    	for(int a:x)
    	{
    		sum=sum+a;
    	}
    	return sum;
    	
    }
    public static int product(int ...x)
    {
    	int prod=1;
    	for(int m:x)
    	{
    		prod=prod*m;
    	}
    	return prod;
    }
    
}
