package StringBasic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo1 {
	public static void main(String[] args) {
//		Object o= new String();
//	//	Object o=new StringBuilder();
//		Class c=o.getClass();//to get runtime class definition of object
//		//System.out.println(c.getName());//get  fully qualified class name of the object
//		Method[] m=c.getDeclaredMethods();//get the all method declared in that class
//		Constructor[] n=c.getDeclaredConstructors();
//		int count =0;
//		for(Method m1:m) {
//		
//			System.out.println(m1.getName());
//			count++;
//		}
//		System.out.println(count);
//		String s="abcadaedf";
//		System.out.println(s.replace('a', 'E'));
//		char c[]=s.toCharArray();
//		String t ="arbind kumar love";//convert first letter to upper case
//		String [] st=t.split(" ");//converting String to  string array.
//		for(int i=0;i<s.length();i++)
//		{
//			System.out.println(s.substring(i)+""+s.substring(0,i));//abcd //bcda //cdab
//		}
//		for(String n:st)
//		{
//			System.out.println(n.substring(0,1).toUpperCase()+n.substring(1));//converting first latter to upper case.
//		}
//		String p="";
////		
//		int count =1;
//		for(char t:c)
//		{
//			if(t=='a')
//			{
//				p=p+'a'+count;
//				count++;
//			}
//			else {
//				p=p+t;
//			}
//		}
//		System.out.println(p);
		
	//	Remove All uneven  distributed space  "\s+"  :+ indicate for all  
//		//for multiple character regex=[\s,?]+
//		String str="Arbind? kumar    singh,indian";
//	System.out.println(str.replaceAll("[\s,?]+", " "));
	
//		String  p=new String("arbind");
//		
//		
////		String s="arbind";
////		String t="arbind";
////		System.out.println(s.hashCode());
////		System.out.println(t.hashCode());
//		System.out.println(p.hashCode());
		
//		
//		
//		String str="aebcfdedfh";
//		System.out.println(str.indexOf("bc"));
//		System.out.println(str.lastIndexOf('e'));
//		StringBuffer sb=new StringBuffer(str);
//		sb.setCharAt(str.lastIndexOf('e'), 'T');
//		System.out.println(sb);
		
		Object o=new StringBuffer();
		Class c=o.getClass();
		Method m[]=c.getDeclaredMethods();
		for(Method m1:m)
		{
			System.out.println(m1.getName());
		}
		
		
		
		

	}

}
