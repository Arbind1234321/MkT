package StringBasic;

import java.lang.reflect.Method;

public class DemoTest {
	
	String name;
	int roll;
	public DemoTest(String name,int roll)
	{ 
		this.name=name;
		this.roll=roll;
	}
	
//	public boolean equals(Object obj)
//	{  try {
//		String name1=this.name;
//		int roll1=this.roll;
//		DemoTest d=(DemoTest)obj;
//		String name2=d.name;
//		int roll2=d.roll;
//		if(name1.equals(name2) && roll1==roll2)
//		{
//			return true;
//		}
//		else {
//			return false;
//		}
//	}catch(ClassCastException | NullPointerException e)
//	{
//		return false;
//	}
//	}
//	
//public boolean equals(Object obj)
//{
//	try {
//	DemoTest d=(DemoTest)obj;
//	if(name.equals(d.name)&& roll==d.roll)
//	{
//		return true;
//	}
//	else {
//		return false;
//	}
//	}catch (ClassCastException | NullPointerException e) {
//	   return false;	
//	}
//	
//}
	
	public boolean equals(Object obj)
	{
		if(obj==this)
		{
			return true;
		}
		if(obj instanceof DemoTest) {
			 DemoTest d=(DemoTest)obj;
			 if(name.equals(d.name)&& roll==d.roll)
			 {
				 return true;
			 }
			 else {
				 return false;
			 }
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int count=0;
//		
//		Object o = new String("Arbind");
//		Class c=o.getClass();//get the run time class  definition of object
//		System.out.println(c.getName());
//	Method[] m=	c.getDeclaredMethods();
//	for(Method m1:m)
//	{
//		count++;
//		System.out.println(m1.getName());
//	}
//	System.out.println(count);
		
		
		String s="";
		String t=null;
		System.out.println(s.length()+" ");

	}

}
