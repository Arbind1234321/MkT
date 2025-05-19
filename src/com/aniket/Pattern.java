package com.aniket;

public class Pattern {

	public static void main(String[] args) {
		pattern36(5);

	}
//    1
//	 121
//  12321
// 1234321
//123454321
// 1234321
//  12321
//   121
//    1	
	public static void pattern36(int n)
	{
		for(int i=1;i<=2*n-1;i++)
		{
			
			int space=i>n?i-n:n-i;
			int col=i<=n?2*i-1:2*n-2*space-1;
			int ele=i<=n?(2*i+1)/2:(2*(n-space)+1)/2;
			for(int  s=1;s<=space;s++)
			{
				System.out.print(" ");
			}
			int k =1;
			for(int j=1;j<=col;j++)
			{
				System.out.print(""+k); 
			    if (j<ele) 
			    k++; 
			    else 
			    k--;
			}
			
			System.out.println();
		}
	}
	public static void pattern21(int n)
	{
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a++);
			}
			System.out.println();
		}
	}

	public static void pattern15(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			int space = i <= n ? n - i : i - n;
			int col = i <= n ? 2 * i - 1 : 2 * n - 2 * space - 1;
			for (int s = 1; s <= space; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= col; j++) {
				if (j == 1 || j == col)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void pattern12(int n) {

		for (int i = 1; i <= 2 * n; i++) {
			int space = i <= n ? i - 1 : 2 * n - i;

			int col = i > n ? n - space : n - i + 1;
			for (int s = 1; s <= space; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern9(int n) {

		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= i - 1; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern8(int n) {

		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {

		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {

		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern27(int n) {
		int a = 1;
		int b = 17;
		int t = 17;
		for (int i = 1; i <= n; i++) {

			for (int s = 1; s <= i - 1; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(a++ +" ");

			}
			for (int c = 1; c <= n - i + 1; c++)// 17 16 15 16
			{
				System.out.print(b++ + " ");
			
				t--;
			}
			 System.out.println(t);
			b = t + i;
			System.out.println();
		}
	}

	public static void pattern13(int n) {

		for (int i = 1; i <= n; i++) {
			// Print leading spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			// Print stars and spaces
			for (int k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || k == (2 * i - 1) || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

	public static void pattern10(int n) {
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern11(int n) {
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= i - 1; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern14p(int n) {
		for (int r = 1; r <= 2 * n - 1; r++) {
			System.out.print("*");
		}
		System.out.println();
		int r = 1;
		int sp = 2 * n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (j == r || j == sp)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			sp--;
			r++;
		}
	}

	// pattern14
	public static void pattern14(int n) {

		// First line: full stars
		for (int i = 1; i <= 2 * n - 1; i++) {
			System.out.print("*");
		}
		System.out.println();

		// Lower part
		for (int i = 1; i < n; i++) {
			// Leading spaces
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			// First star
			System.out.print("*");

			// Spaces between stars
			int spaceBetween = (2 * (n - i) - 3);
			for (int j = 1; j <= spaceBetween; j++) {
				System.out.print(" ");
			}

			// Second star (skip if on last row)
			if (i != n - 1) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	// pattern 1
	public static void pattern1(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern2(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// pattern 3
	public static void pattern3(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = n - i + 1; j > 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// pattern 4

	public static void pattern4(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	// pattern 5
	public static void pattern5(int n) {
		int k = n;
		for (int i = 0; i <= 2 * n - 1; i++) {
			if (i <= n) {
				for (int j = 1; j <= i; j++) {
					System.out.print("* ");
				}
			} else {
				for (int j = k - 1; j >= 1; j--) {
					System.out.print("* ");
				}
				k--;
			}
			System.out.println();
		}
	}

	public static void pattern16(int n) {
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)//
			{
				if (i == 1 || j == 1) {
					k = 1;

				} else {
					k = k * (i - j + 1) / (j - 1);

				}

				System.out.print(k + " ");

			}
			System.out.println();
		}
	}

	public static void pattern22(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}

			System.out.println();
		}
	}

	public static void pattern17(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			int total_space = i >= n ? i - n : n - i;
			int col = i > n ? 2 * n - i : i;

			for (int sp = 0; sp <= total_space; sp++) {
				System.out.print(" ");
			}
			for (int j = col; j >= 1; j--) {
				System.out.print(j);
			}
			for (int c = 2; c <= col; c++) {
				System.out.print(c);
			}

			System.out.println();
		}
	}

	public static void pattern30(int n) {
		for (int i = 1; i <= n; i++) {
			for (int s = 1; s <= n - i; s++) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			for (int c = 2; c <= i; c++) {
				System.out.print(c + " ");

			}

			System.out.println();
		}
	}

	public static void pattern28(int n) {

		for (int i = 1; i <= 2 * n - 1; i++) {
			// space
			int totalcol = i >= n ? 2 * n - i : i;

			int sp = i <= n ? n - i : i - n;

			// int sp=n-totalcol;
			for (int s = 1; s <= sp; s++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= totalcol; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	// pattern 5
	public static void pattern05(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			int totalcol = i >= n ? 2 * n - i : i;
			for (int j = 1; j <= totalcol; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
