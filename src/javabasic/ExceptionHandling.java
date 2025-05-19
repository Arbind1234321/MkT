package javabasic;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter number");
	  try {
		  sc.nextInt();
	  }
	  catch (InputMismatchException e) {
		 
		  try {
			  System.out.println("second attempt");
			  System.out.println("enter number");
			  Scanner s=new Scanner(System.in);
			  s.nextInt();
			  
			  
			   
		  }
		  catch(InputMismatchException t)
		  {
			  System.out.println("Eneter integer");  
		  }
		  System.out.println("2st attempt");  
	  }

	}

}
