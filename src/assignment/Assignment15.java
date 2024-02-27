package assignment;
//How to call non-static method inside a main method
public class Assignment15 {
   void add() {
	   System.out.println("Hi i am non static method");// non static method called through object reference
   }
	public static void main(String[] args) {
	
		Assignment15 s=new Assignment15();
		s.add();
   
	}

}
