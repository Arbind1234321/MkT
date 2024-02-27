
package javabasic;

import java.util.Arrays;

public class Demo2 {
 void add() {
	System.out.println("helo"); 
 }
 Demo2(int a) {
	
	 System.out.println("hii122");
 }	 
 Demo2() {
	 this(10);
	 System.out.println("hii");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Demo2 d=new Demo2();
//		StringBuffer sb=new StringBuffer("Arbind");
//		System.out.println(sb.charAt(2));
//		System.out.println(sb.capacity());
//		//System.out.println(sb.charAt(8));
		String str="Arbind";
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());

	}

}
