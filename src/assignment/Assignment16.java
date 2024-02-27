package assignment;
//Write a program to check if gender equals to male or female.If it is male and check if age is greater 
//than 18 or not.if it is greater than 18 then the person is eligible to vote otherwise not eligible to
//vote.If it is female and check if age is greater than 18 or not.If the age is greater than 18 then the person is
//eligible to vote otherwise not eligible to vote 
public class Assignment16 {
    //static String  gender;
	public static void main(String[] args) {
		
	   String gender="F";
	   int age=22;
	   if(gender=="M")
	   {
		  if(age>=18)
		  {
			 System.out.println("Male Eligible to vote"); 
		  }
		  else {
			  System.out.println("male Not eligible to vote");
		  }
	   }
	   else {
		   if(age>=18)
			  {
				 System.out.println("Female Eligible to vote"); 
			  }
			  else {
				  System.out.println("female Not eligible to vote");
			  }
	   }

	}

}
