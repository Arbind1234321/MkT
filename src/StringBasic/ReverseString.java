package StringBasic;

import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {
	String str="Arbind Kumar bihar";
	String []arr=str.split(" ");
	int n=arr.length;
	Set<Character> set=new LinkedHashSet<>();
	for(int i=n-1;i>=0;i-- )
	{
	    String s=arr[i];
	    for(int j=0;j<s.length();j++)
	    {
	    	set.add(s.charAt(j));
	    }
	}
	
	for(Character t:set)
	{
		System.out.print(t);
	}
	//System.out.println(set);

	}

}
