package DemoJava;

public class Demo122 
{
	static int sec;
	public static void main(String[] args) {
		
	   String str="arbind kumar";
	  String as="";
	  
	   int count=0;
	 for(int i=0;i<str.length();i++)
	 {
		 char c=str.charAt(i);
		
		if(c=='a')
		{
			count++;
		}
		if(count==2)
		{
			sec=i;
			break;
			
		}
		 
	 }
	 for(int i=0;i<str.length();i++)
	 {
		 
		 if(count==1)
		 {
			 System.out.println("no duplicate element");
			 break;
		 }
		 char c=str.charAt(i);
		if(i==sec)
		{
			
		}
		else {
			as=as+c;
		}
		 
	 }
	 System.out.println(as);
	 
	 	 
		
	}
}
