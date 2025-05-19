package StringBasic;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) 
	{
		String str="Dinesh";
		char [] c=str.toCharArray();
		int k=0;
		for(int i=c.length-1;i>=0;i--) {
			//System.out.print(c[i]);
			c[k++]=c[i];//hesesh
			
		}
		System.out.println(Arrays.toString(c));
		

	}

}
