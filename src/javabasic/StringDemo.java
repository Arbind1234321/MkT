package javabasic;

import java.util.Arrays;
import java.util.Collections;

public class StringDemo {

	public static void main(String[] args) {
	String name= "Arbind";
	 int l=name.length();
	 StringBuilder input1 = new StringBuilder();
	 String r="";
	 for(int i=l-1;i>=0;i--)
	 {
		char s=name.charAt(i); 
		r=r+s;
		 //System.out.print(s);
		
	 }
	//System.out.print(r);
	//System.out.println();
	 System.out.println(input1.append(name));
	 System.out.println(input1.reverse());
	 

	}

}

