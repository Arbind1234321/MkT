package com.aniket;
class Abc{
	public void eat() {
		System.out.println(" i am fasting");
	}
}

public class RunTimePoly extends Abc {
	public void eat() {
		System.out.println(" i  am eating");
	}

	public static void main(String[] args) {
		Abc t=new RunTimePoly();
		t.eat();

	}

}
