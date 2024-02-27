package assignment;
class A{
	void fruit() {
		System.out.println("This is fruit");
	}
}
class B extends A{
	void Apple() {
		System.out.println("This is fruit is Apple");
	}
}
public class Assignment32 extends B{
	void sweet() {
		System.out.println("This is fruit is Apple and it is sweet");
	}
	public static void main(String[] args) {
		Assignment32 a=new Assignment32();
		a.fruit();
		a.Apple();
		a.sweet();
	}

}
