package assignment;
import java.util.Scanner;
//Create a class and write 5 static methods each for addition, subtration, multiplication, devision and modules, call it in the main method
public class Assignment7 {
		static void add(int a, int b)
		{
			System.out.println(a+b);
		}
		static void sub(int a, int b)
		{
			System.out.println(a-b);
		}
		static void mul(int a, int b)
		{
			System.out.println(a*b);
		}
		static void div(int a, int b)
		{
			System.out.println(a/b);
		}
		static void mod(int a, int b)
		{
			System.out.println(a%b);
		}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of a and b");
			int a=sc.nextInt();
			int b=sc.nextInt();
			add(a,b);
			sub(a, b);
			mul(a, b);
			div(a, b);
			mod(a, b);
	}

}
