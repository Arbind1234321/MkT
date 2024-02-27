package StringBasic;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="arbind1233";
     char ch[]=str.toCharArray();
     int count =0;
     int counta=0;
     for(int i=0;i<str.length();i++)
     {
    	 if(ch[i] >= 'a'&&ch[i]<='z')
    	 {
    		 count++;
    	 }
    	 else
    	 {
    		 counta++;
    	 }
     }
     System.out.println(count);
     
     System.out.println(counta);
	}

}
