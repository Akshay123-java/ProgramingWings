package com.staticblock;

public class ChildStaticBlock extends StaticBLockExample {

	
	
	public ChildStaticBlock(int i) {
		super(i);
	System.out.println("This is the constructore of child class :"+i);
	}
	
	static{
		
		System.out.println("This is the static block of child class");
	}

	{
		
		System.out.println("This is the instatnce block of child class");
	}
	public static void main(String[] args) {
		
       System.out.println("This is the program execution start of  child class ");
       
		ChildStaticBlock a2=new ChildStaticBlock(30);
		
		System.out.println("Child class object end");
		
		System.out.println("The parent classs object inseration strat :->");
		
		StaticBLockExample a3 = new StaticBLockExample(80);
		
		System.out.println("Parent class object end");
		
		System.out.println("The parent classs refrencd variable and child  class object inseration strat :->");
		
		StaticBLockExample a4 =new ChildStaticBlock(10);
		
		System.out.println("end parent class refrence and child class object"); 
		
		System.out.println("This is the program execution end of child class");
	}

}
