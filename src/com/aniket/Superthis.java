package com.aniket;

class Abcd {
	int x = 10;

	public Abcd(String a) {
		System.out.println("Parent con-- 0 parm");
	}

	public Abcd(int x) {
		this("a");
		System.out.println("Parent  con-- in tparm");
	}
}

public class Superthis extends Abcd {
	int y = 20;

	public Superthis() {//
	super(10);
	
		System.out.println("Child con-- 0 parm");

	}

	public Superthis(int x) {
    this();
		System.out.println("Child con-- int parm");
		System.out.println(super.x);

	}
//
//	public Superthis(String name) {
//		this(10);
//		System.out.println("Child con-- String parm");
//	}

	public static void main(String[] args) {
		Superthis t = new Superthis(30);
		

	}

}
