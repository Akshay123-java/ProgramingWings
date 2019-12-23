package com.homework;

class A {
	
	A(int a){ 
		
		m1();
	
	}
	
	public void m1(){
		
		System.out.println("This is the method of class A");
	}
	
	
}
public class B extends A {
	
	int x=10;
	
	public B(int j)
	{
		super(j);
	}
	
	public void m1(){
		System.out.println("X :"+x);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1=new B(5);
		
		a1.m1();
	}

}
