package com.aniket;

public class Encapsulation {
	//Encapsulation: The  process of  binding data(Variable) and corresponding method(Function) into 
	//single unit(class) .
	
	//Wrapping of data and method into single  unit.(class)
	
	//Encapsulated class:
	  //A class with at least one private  data member.
	  //Business object or data transfer object class.
	//why  advantages
	  //= We can achieve security
	  //Enhancement will become easy.
	  //It improve code maintains.
	
	//  fully //tightly  encapsulated class
	  // A class is said to be tightly encapsulated  if and only if  each data member are private.
	  //class must be public 
	// each data member must have getter and setter it must be public.

	private int roll;
	private String name;
	public Encapsulation() {

	}
	
	public Encapsulation( String name) {
		this.name=name;
		System.out.println("hi");
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("hlewi");
	}
	
	

}
