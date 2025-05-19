package com.pattern;

public class Test 
{
void  unlock()//password  //pattrn//  
{
	System.err.println("unlock");
}
void  unlock( int number)//password  //pattrn//  
{
	System.out.println("Unlock");
}
void  unlock(String pattern)//password  //pattrn//  
{
	System.out.println("unlock");
}
void  unlock( Object Fringprint)//password  //pattrn//  
{
	System.out.println("unlock");
}
     public void eat()
     {
    	 System.err.println(" Eating");
     }
     public void eat(int a)
     {
    	 System.out.println(" Eating  food");
     }
     public void eat(String name)
     {
    	 System.out.println(" Eating   non veg");
     }
     
     public static void main(String[] args) {
		Test t=new Test();
		//t.eat();
		//t.eat("Arbind");//comilar
		t.eat();
	}
   
}
