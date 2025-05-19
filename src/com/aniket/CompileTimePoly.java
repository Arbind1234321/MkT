package com.aniket;

public class CompileTimePoly {
	public void eat(String name) {
		System.out.println("String argument");
	}

	public static void main(String[] args) {
		
		CompileTimePoly t=new CompileTimePoly();
		//t.eat("A");//String -argu
		t.eat();//no-argu
		t.eat(10);//int-argu
		
	}
	
	public void eat() {
		System.out.println("no -argu");
		
	}
public void eat(int a) {
		System.out.println("int argument");
	}


}
