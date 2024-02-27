package assignment;
//Write a program with 2 Static method,2 Non-Static method,and one Constructor
public class Assignment17 {

	void fruit() {
		System.out.println("fruit ");
	}
	void sweet() {
		System.out.println("fruitis sweet ");
	}
	static void Apple() {
		System.out.println("fruit is Apple ");
	}
	static void mango() {
		System.out.println("fruits  sweet mango");
		
	}
	 Assignment17() {
		System.out.println("I am constructor");
	}
	 
	public static void main(String[] args) {
		Assignment17 s=new Assignment17();
		Apple();
		s.sweet();

	}

}
