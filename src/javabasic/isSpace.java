package javabasic;

public class isSpace {

	public static void main(String[] args) {
		String str="Mynameiarbind";
		
		char ch[]= str.toCharArray();
		boolean flag=true;
		for (int i = 0; i < ch.length; i++) 
		{
			 boolean s=Character.isSpace(ch[i]);
			 if(s)
			 {
				 System.out.println("contain space");
				 flag=false;
				 break;
			 }
		}
		if(flag)
		{
			
			System.out.println("Not contain space");
		}
		
	    

	}

}
