package com.Problem2;

public class Parent {

	
	final int number;
	
	
	
	
	public Parent(int number) {
		super();
		this.number = number;
	}

	void method1() {
		System.out.println("Inside method 1 of class parent");
		System.out.println(this.number);
	}
	
	 final void method2() {
		System.out.println("Inside method 2 of class parent");
		
	}
	
	void method3() {
		System.out.println("Inside method 3 of class parent");
		
	}
	
}
