package javabasic;

import java.util.Scanner;

public class Scanneer {

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void sub(int a, int b) {
		System.out.println(a - b);
	}

	void mult(int a, int b) {
		System.out.println(a * b);
	}

	void div(int a, int b) {
		System.out.println(a / b);
	}

	void mod(int a, int b) {
		System.out.println(a % b);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		Scanneer c = new Scanneer();
		
		int a = s.nextInt();
		int b = s.nextInt();
		//c.add(a, b);
		c.sub(a, b);//40 20=20
		c.mult(a, b);//800
		int sum=a+b;//60
		System.out.println(sum);
//		

	}

}
