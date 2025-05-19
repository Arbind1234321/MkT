package DemoJava;

import java.util.Arrays;

public class Arrayconcept {
	 public static String toString(Object[] a)  {
	        if (a == null)
	            return "null";

	        int iMax = a.length - 1;
	        if (iMax == -1)
	            return "[]";

	        StringBuilder b = new StringBuilder();
	        b.append('[');
	        for (int i = 0; ; i++) {
	            b.append(String.valueOf(a[i]));
	            if (i == iMax)
	                return b.append(']').toString();
	            if(i==2)
	            {
	            b.append(",");
	            }
	            else
	            {
	            	b.append(" ");
	            }
	        }
	    }

	public static void main(String[] args) throws InterruptedException {
		String str="my name is ram";
	
	Thread.sleep(10);
		String s[]=str.split(" ");
//		for(int i=0;i<s.length;i++)
//		{
//			if(i==3)
//			{
//				System.out.print(","+s[i]);
//			}
//			else
//			{
//				System.out.print(s[i]+" ");
//			}
//		}
		System.out.println(toString(s));
		

	}

}
