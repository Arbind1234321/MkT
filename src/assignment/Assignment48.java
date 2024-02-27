package assignment;
//In a string "mango" calculate how many are alpha and how many are numeric
public class Assignment48 {

	public static void main(String[] args) {
		String str="Mango1";
		char ch[]=str.toCharArray();
	     int count =0;
	     int counta=0;
	     for(int i=0;i<str.length();i++)
	     {
	    	 if(ch[i] >= 'a'&&ch[i]<='z' ||ch[i]>='A'&&ch[i]<='Z')
	    	 {
	    		 count++;
	    	 }
	    	 else
	    	 {
	    		 counta++;
	    	 }
	     }
	     System.out.println("Total number of alphabet : "+count);
	     
	     System.out.println("Total number of numeric : "+counta);
		}
		

	

}
