package com.homework;

public class ExecutionSequance {
	
	
	{
		System.out.println("This is the instance block excuted ");
		
		}
	
	static{
		
		System.out.println("THis is the static block executed ");
	}
	
	

	public ExecutionSequance() {
		// TODO Auto-generated constructor stub
		
		System.out.println("This is constracter executed ");
	}

	public void m1(){
		
		System.out.println("this is instance method is executed");
	}
	
	public static void m2(){
		
		
		System.out.println("This is  static method executed ");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutionSequance a1=new ExecutionSequance();
		a1.m2();
		a1.m1();
	
		
		
   System.out.println("This is main method executed");
	}

}
