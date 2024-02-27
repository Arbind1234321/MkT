package StringBasic;

public class Palindrome2 {

	public static void main(String[] args) {
		String str="madam1";
		 char ch[]=str.toCharArray();
		int l=str.length();
		boolean flag=true;
		for(int i=0;i<l-1;i++)
		{
			if(ch[i]!=ch[l-i-1])
			{
			System.out.println("not palindrome");
			flag=false;
			break;
			}
				
		}
		if(flag)
		{
			System.out.println("palindrome");
		}

	}

}
