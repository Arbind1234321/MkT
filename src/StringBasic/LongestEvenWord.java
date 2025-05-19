package StringBasic;

public class LongestEvenWord
{
	public static void main(String[] args) {
		// int [] arr= {3,4,6,8,-9};//72 {8,6} O(n2) constant space 0(1)
		//
		
		String str="The idea behind concept is to build  are located123 within a minute walk or ride";
		
		String word[]=str.split(" ");//length even checking maximum length word
		int maxcount=0;
		String w="";
		for(String t:word)
		{
			int n=t.length();
			if(n%2==0)
			{
				if(n>maxcount)
				{	
				  w=t;	
				  maxcount=n;
				}
			}
		}
		
		System.out.println(w);
	}
	
	
}
	

