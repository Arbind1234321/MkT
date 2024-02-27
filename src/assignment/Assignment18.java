package assignment;
//"Write a program with 4 Static method and 4 Non-Static method make sure all have same name
public class Assignment18 {
	static void add() {
		System.out.println("First static method");
	}
	static void add(int a) {
		System.out.println("Static method 2");
	}
	static void add(int a, int b) {
		System.out.println("Static method 3");
	}

	static void add(int a, String name) {
		System.out.println("Static method 4");
	}
	void add(String name) {
		System.out.println("Non Static method 1");
	}
	void add(double d) {
		System.out.println("Non Static method 2");
	}
	void add(int a, double d) {
		System.out.println("Non Static method 3");
	}
	void add(String a, String name) {
		System.out.println("Non Static method 4");
	}
	public static void main(String[] args) {
		Assignment18 s=new Assignment18();
		s.add("Arbind");
		add();

	}

}
