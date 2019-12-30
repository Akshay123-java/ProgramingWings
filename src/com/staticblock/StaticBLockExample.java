package com.staticblock;

public class StaticBLockExample {

static   int i;
	
	public StaticBLockExample(int i) {
		super();
		this.i = i;
		System.out.println("This is the constracture of parent class :-> "+i);
	}
	
	static {
		 int i=20;
		
		System.out.println("This is the static block of parent :->" +i);
	}


	{
		 int i=30;
		System.out.println("This is the instance block of parent :->"+i);
		
	}

	public static void main(String[] args) {
	
		
		System.out.println("The program Execution is start of main method of parent class : ");
		
     StaticBLockExample a1=new StaticBLockExample(20);		
		
   System.out.println("The program execution End of parent class ");


	}

}
