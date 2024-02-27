package assignment;

import java.util.Scanner;

public class Assignment30 {
	static final double  pi=3.14;
	static void areaOfCircle(double r)
	{   double area=pi*r*r;
		System.out.println("Area of circle "+area);
	}
	static void circumfranceOfCircle(double r)
	{
		double circumfrance=2*pi*r;
		System.out.println("Circumfrance of circle"+circumfrance);
	}
	static void areaOfSqure( int a)
	{
		System.out.println("Area of squre "+ a*a);
	}
	static void circumfranceOfSqure( int a)
	{
		System.out.println("Area of squre "+ 4*a);
	}
	static void areaOfTringle( int a , int h)
	{
		double area=.5*(a*h);
		System.out.println("Area of rihgt angke Tringle "+area );
	}
	static void circumfranceofTringle(int a)
	{
		System.out.println("Circumfrnce of equilateral tringle "+ 3*a);
	}
	static void areaOfTrapizium( int side1 , int side2,int h)
	{
		double area=.5*(side1+side2)*h;
		System.out.println("Area of Trapizium "+area );
	}
	static void circumfranceofTrapizium(int a, int b ,int c,int d)
	{
		System.out.println("Circumfrnce of equilateral tringle "+ a+b+c+d);
	}
	static void areaOfRectanlge( int l , int b)
	{
		double area=l*b;
		System.out.println("Area of rectangle "+area );
	}
	static void circumfranceofRectangle(int l,int b)
	{
		System.out.println("Circumfrnce of Rectangle "+ 2*(l+b));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int c=sc.nextInt();
	    areaOfCircle(c);
	    circumfranceOfCircle(c);
		System.out.println("Enter side of square");
		int s=sc.nextInt();
	    areaOfSqure(s);
	     circumfranceOfSqure(s);
	     System.out.println("Enter side of tringle"); 
	     int h=sc.nextInt();
	     int b=sc.nextInt();
	      areaOfTringle(h,b);
	      System.out.println("Enter side of equilateral tringle");
	      int side=sc.nextInt();
	      circumfranceofTringle(side);
	      System.out.println("Enter side rectangle");
	      int l=sc.nextInt();
	      int w=sc.nextInt();
	       areaOfRectanlge(l,w);
	      circumfranceofRectangle(l, w);
	      System.out.println("Enter side of trapizium");
	      int s1=sc.nextInt();
	      int s2=sc.nextInt();
	      int s3=sc.nextInt();
	      areaOfTrapizium(s1, s2, s3);
	      System.out.println("Enter side of trapizium");
	      int a1=sc.nextInt();
	      int a2=sc.nextInt();
	      int a3=sc.nextInt();
	      int a4=sc.nextInt();
	      circumfranceofTrapizium(a1,a2,a3,a4);

		

	}

}
