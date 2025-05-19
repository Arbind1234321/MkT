package javabasic;

import DemoJava.Test1;

public class Demo1 extends Test1 {

	
	public void accessParent() {
        // Can access protected members from Parent
       
    
    }
	public static void main(String[] args) {
	
    Demo1 d= new Demo1();
    d.accessParent();
	}
	
	

}
