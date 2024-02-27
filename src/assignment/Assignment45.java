package assignment;
//write a program in Array by getting the size of an array using Scanner class?
import java.util.Scanner;
public class Assignment45 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array");
		int size=sc.nextInt();
		int [] arr =new int[size];
		System.out.println("The size of arrays : "+arr.length);

	}

}
