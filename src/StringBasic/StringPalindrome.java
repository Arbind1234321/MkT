package StringBasic;

public class StringPalindrome {
	
	public static boolean ispslindrom(String str)
	{
		int n=str.length();
		for(int i=0;i<n;i++,n--)
		if(str.charAt(i)!=str.charAt(n-1))
			return false;
		return true;
	}

	public static void main(String[] args) {
		 String str="abaaaba";
//		 int l=str.length();
//		 String rev="";
//		 for(int i=l-1;i>=0;i--)
//		 {
//			 char ch=str.charAt(i);
//			    rev=rev+ch;
//		 }
//		 if(str.equals(rev))
//		 {
//			 System.out.println("palindrome");
//		 }
//		 else {
//			System.out.println("not palindrome");
//		}
        boolean k= ispslindrom(str);
        if(k)
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("not palindrome");
        }
		 

	}

}
