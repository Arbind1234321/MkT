package javabasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovingAllSpecial {

	public static void main(String[] args) {
	String str="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	str=str.replaceAll("[^a-zA-Z]", " ");
  
	
	System.out.println(str);
	List<String > l=new ArrayList<>();
	String s[]=str.split("\\s+");
	System.out.println(Arrays.toString(s));
//	for(String t:s)
//	{
//		l.add(t);
//	}
//	System.out.println(l);
//
   }
	

}
