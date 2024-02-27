package assignment;

import java.util.Scanner;

//declare and initialise all type of scanners
public class Assignment26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Intger number");
		int a=sc.nextInt();
		System.out.println("Enter byte number");
		byte b=sc.nextByte();
		System.out.println("Enter double number");
		double d=sc.nextDouble();
		System.out.println("Enter float number");
		float f=sc.nextFloat();
		System.out.println("Enter short number");
		short s=sc.nextShort();
		System.out.println("Enter  char");
	          char c=sc.next().charAt(0);
		System.out.println("Enter Enter string ");
		String str=sc.next();
		System.out.println("Enter boolean");
		boolean bl=sc.nextBoolean();
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);
		System.out.println(s);
		System.out.println(c);
		System.out.println(bl);
		System.out.println(str);
		
		

	}

}
