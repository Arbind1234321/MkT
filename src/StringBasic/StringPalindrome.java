package StringBasic;

public class StringPalindrome {

	public static void main(String[] args) {
		 String str="madam1";
		 int l=str.length();
		 String rev="";
		 for(int i=l-1;i>=0;i--)
		 {
			 char ch=str.charAt(i);
			    rev=rev+ch;
		 }
		 if(str.equals(rev))
		 {
			 System.out.println("palindrome");
		 }
		 else {
			System.out.println("not palindrome");
		}
		
		 

	}

}
