package DemoJava;
class B  {
	public  void t() {
		System.out.println("tear");
	}
	void cry() {
		System.out.println("crying");
	}
	
	}
public class Abc extends B {
//Inheritance: Is-A Relationship // Has-A RelationShip.
// min  2 class
//root class   is Object class.
	public void m() {
		System.out.println("class Abc");
	}
	public void eat() {
		System.out.println("Eat");
	}
	public static void main(String[] args) {
		Abc b = new Abc();
		b.eat();// Tear crying Eat
		b.t();
	}
}



