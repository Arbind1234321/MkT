package javabasic;
interface one{
	
	void add();
	void add1();
}
abstract class Abc implements one{
	abstract  void sub();
	 abstract void sub1();
}
abstract class XYZ extends Abc {
	 abstract  void cd();
	 abstract void df();
	  void eat()
	  {
		  System.out.println("Eating");
	  }
	  void laugh() {
		  System.out.println("laughing");
	  }
}

public class DemoInterface extends XYZ {
	void mul() {
		System.out.println("hii");
	}
 void mul1() {
	 System.out.println("helo");
 }
	public static void main(String[] args) {
		

	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void add1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void sub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void sub1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void cd() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void df() {
		// TODO Auto-generated method stub
		
	}

}
