package assignment;
//check if the given string contains space
public class Assignment_50 {

	public static void main(String[] args) {
		String str="My name is arbind";
		
		
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
