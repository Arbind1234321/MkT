package assignment;

import java.util.Date;
//write a program to get 10 days before the current time and 10 days after the current time using Date Class?
public class Assignment42 {

	public static void main(String[] args) {
	Date d=new Date();
	//future 10 days 
	Date d1=new Date(d.getTime()+(1000*60*60*24*10));
	System.out.println(d);
	//past 10 days
	Date d2=new Date(d.getTime()-(1000*60*60*24*10));
//	String str=d.toString();
//	System.out.println(str.substring(4, 7));
//	System.out.println(str.substring(8,10));
//	System.out.println(str.substring(24,28));
	System.out.println(d1);
	System.out.println(d2);

	}

}
