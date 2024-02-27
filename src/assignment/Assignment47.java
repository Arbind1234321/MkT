package assignment;
//In  a string "mango123" check which character is numeric and which is alpha
public class Assignment47 {

	public static void main(String[] args) {
	      String str="mango123";
	      char ch[]=str.toCharArray();
	      for (int i = 0; i < str.length(); i++)
	      {
			 boolean ans=Character.isDigit(ch[i]);
			
			 if(ans==false)
			 {
				 System.out.println("Index position is "+i+" Alphabet "+ch[i]);
			 }
			 else
			 {
				 System.out.println("Index position is "+i+" Digit " +ch[i]); 
			 }
		  }

		}
}
