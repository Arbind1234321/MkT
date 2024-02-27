package assignment;

abstract class Demo {
	abstract void Add();

	void Fruit() {
		System.out.println("fruit");
	}
}
public class Assignment37 extends Demo {
	@Override
	void Add() {
      System.out.println("add");
	}
	void Sub() {
		System.out.println("sub");
	}
	public static void main(String[] args) {
      Assignment37 a=new Assignment37();
      a.Add();
      a.Sub();
	}

}
