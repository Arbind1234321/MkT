
package com.aniket;

public class TestDemo extends AbstractDemo {

	public static void main(String[] args) {
	    TestDemo t=new TestDemo();
	    t.eat();
	  System.out.println(  t.run());
	}

	@Override
	public void eat() {
	System.out.println("i am eating");
		
	}

	@Override
	public int run() {
		
		return 4;
	}

}
