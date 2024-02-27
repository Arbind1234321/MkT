package assignment;

import java.util.Scanner;

//Create an array of length 3 of int data type and add its value at the runtime
public class Assignment44 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int [] arr=new int[3];
		 int l=arr.length;
		 for (int i = 0; i < l; i++) 
		 {
			System.out.println("Enter the value");
			arr[i]=sc.nextInt();
	   	 }
		 for (int i = 0; i < l; i++) 
		 {
			System.out.println(arr[i]);
			
	   	 }

	}

}
