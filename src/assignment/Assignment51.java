package assignment;
//Find the factorial of numbers
import java.util.Scanner;
public class Assignment51 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number");
		 int n=sc.nextInt();
		 
		 int fact=1;
		 for(int i=n;i>=1;i--)
		 {
			 fact=fact*i;
		 }
		 System.out.println("Factorial of a number : "+fact);

	}

}
