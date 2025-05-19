package com.aniket;

public class MainTest {
	public static void main(String[] args) {
		//System.out.println(isPalindrome(313));
		p(5);
		//primePalindrome(101);
		//System.out.println(newtonSqureRoot(4));
	}

	// perfact number :1+2+4+7+14=perfact

	// 313 --->prime ----palindrome 11---prime palindrome
	//  12---.3 digit count ----> + 2^2+1^2===
	public static double newtonSqureRoot(int n)
	{
		double x=n;
		double root;
		while(true) {
			root=.5*(x+(n/x));
			if(Math.abs(root-x)< 0.5)
			{
				break;
			}
			x=root;
		}
		return root;
	}
	
	
	//WAP to check that given number is prime palindrome
	public static boolean isprime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isPalindrome(int n) {
		int temp = n;
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		// if(temp==rev) return true;
		// else
		// return false;
		return temp == rev;
	}

	public static void primePalindrome(int n) {
		if (isprime(n)) {
			if(isPalindrome(n))
			{
				System.out.println("prime palindrome");
			}
			else
			{
				System.out.println(" number is prime but  not palindrome");
			}

		} else {
			System.out.println("not a prime palindrome");

		}
	}

	public static void p(int n) {
		for (int i = 1; i <= n; i++) {

			int space = i > n ? i - n : n - i;
			int col = i <= n ? 2 * i - 1 : 2 * n - 2 * space - 1;
			// int ele=i<n?2*(n-i)-1:(2*i+1)/2;
			for (int s = 1; s <= space; s++) {
				System.out.print(" ");
			}
			int k = 1;
			for (int j = 1; j <= col; j++) {
				System.out.print("" + k);
				if (j < (2 * i + 1) / 2)
					k++;
				else
					k--;
			}

			System.out.println();
		}
		n = n - 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			int k = 1;
			for (int j = 0; j < 2 * (n - i) - 1; j++) {
				System.out.print("" + k);
				if (j < (2 * (n - i) - 1) / 2)
					k++;
				else
					k--;
			}

			System.out.println();
		}
	}

}
