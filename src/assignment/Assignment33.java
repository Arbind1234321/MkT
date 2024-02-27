package assignment;

class parent {
	void money() {
		System.out.println("parent have money");
	}
}
class child1 extends parent {
	void sweet() {
		System.out.println("child1 have sweet");
	}
}
public class Assignment33 extends parent {
	void Apple() {
		System.out.println("Assignment34 have Apple");
	}
	public static void main(String[] args) {
		Assignment33 a = new Assignment33();// calling super class method from Assignment
		a.money();
		child1 c = new child1();// calling super class method from child1
		c.money();
		c.sweet();
	}
}
