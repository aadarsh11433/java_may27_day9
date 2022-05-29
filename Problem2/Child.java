package com.Problem2;

import java.util.Scanner;

public final class Child extends Parent {

	
	
	public Child(int number) {
		
		super(number);
		
	}

	@Override
	void method1() {
		
		System.out.println("Inside overriden method 1 of class parent in child class");
		System.out.println(super.number);
	}
	
	void method4() {
		System.out.println("Inside method 4 of class child");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num  in 1-10 (both inclusive)");
		int num = sc.nextInt();
		
		
		if(num > 0 && num < 11) {
			Parent parent1 = new Child(num);
//			parent1.method1();
			parent1.method1();
			parent1.method2();
		    parent1.method3();
		    
		    ((Child) parent1).method4();
		    
		}
		else {
			
			
			System.out.println("Invalid number From input ");
			
		}
		

	
	}

}
