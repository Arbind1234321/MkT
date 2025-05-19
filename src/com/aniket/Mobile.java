package com.aniket;

public class Mobile{
	
public static int gcd(int a,int b)
{
	if(a==0)
		return b;
	return gcd((b%a),a);
}
public static int gcd1(int a,int b)
{
	if(a==b)
		return b;
	if(a>b)
    return gcd1(a-b,b);
	else
		return gcd1(a,b-a);
}
public static void main(String[] args) {
	System.out.println(hcf(30,0));
}
  public static int hcf(int a,int b)
  {
	  int result=Math.min(a, b);
	  while(result>0)
	  {
		  if(a%result==0 && b%result==0)
		  {
			  break;
		  }
		  result--;
	  }
	return result;  
  }	
}
 
     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
