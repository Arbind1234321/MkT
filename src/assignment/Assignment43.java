package assignment;

import java.util.Arrays;

//Create an array with double and Boolean data types?
public class Assignment43 {

	public static void main(String[] args) {
		 boolean b[]=new boolean[3];
		 b[0]=false;
		 b[1]=true;
		 b[2]=false;
		 for (int i = 0; i < b.length; i++) 
		 {
			System.out.println(b[i]);
		 }
		 double d[]=new double[4];
		 d[0]=10.0;
		 d[1]=12.09;
		 d[2]=16;
		 d[3]=19.00;
		  Arrays.sort(d);
		  for (int i = 0; i < d.length; i++) 
			 {
				System.out.println(d[i]);
			 }
	//	System.out.println(Arrays.toString(d));
		 
	}

}
