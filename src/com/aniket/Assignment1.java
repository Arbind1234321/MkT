package com.aniket;

public class Assignment1 {
	
	public static double myPow(double x, int n) {
        long N = n; // convert to long to handle edge case of Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return fastPow(x, N);
    }

    private  static double fastPow(double x, long n) {
        if (n == 0) return 1.0;
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
	public static void main(String[] args) {
		
	System.out.println(	power(2,3));
	}
	
	public static double power(double x,int n)
	{
      if(n==0) return 1.0;
       if(n==1) return x;
       if(n<0) return power(1/x,-n);
       double res=1.0;
       for(int i=1;i<=n;i++)
       {
    	   res=res*x;
       }
       return res;
	}

}





