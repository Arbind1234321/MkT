package assignment;
//Check any 2 strings are anagram or not
import java.util.Arrays;

public class Assignment46
{
	
	public static void main(String[] args) {
		String str1="madam";
		String str2="daamm";
	   if(str1.length()!=str2.length())
	   {
		   System.out.println("given string is not anagram");
	   }
	   else
	   {
		   char c[]=str1.toCharArray();
		   char ch[]=str2.toCharArray();
		   
		   Arrays.sort(c);
		   Arrays.sort(ch);
		   System.out.println(Arrays.toString(c));
		   System.out.println(Arrays.toString(ch));
		  // boolean ans=Arrays.equals(ch,c);
		   if(Arrays.equals(ch,c))
		   {
			   System.out.println("anagram");
		   }
		   else
		   {
			System.out.println("not anagram");   
		   }
	   }

	}

}
