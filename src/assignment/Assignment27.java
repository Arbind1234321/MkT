package assignment;
import java.util.Scanner;
//create 5 methods for addition , subtraction , multiplication ,divison , modulus using scanner class with global variable
public class Assignment27 {
	static  int a;
	 static int b;
	
	static void Addition(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}
	static void substractin(int a,int b) {
		int sub=a-b;
		System.out.println(sub);
	}
	static void Multiplication(int a,int b) {
		int mul=a*b;
		System.out.println(mul);
	}
	static void div(int a,int b) {
		int div=a/b;
		System.out.println(div);
	}
	static void mod(int a,int b) {
		int mod=a%b;
		System.out.println(mod);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the value of a and b");
		 a=sc.nextInt();
		 b=sc.nextInt();
		Addition(a, b);
		substractin(a, b);
		Multiplication(a, b);
		div(a, b);
		mod(a, b);
		

	}

}
