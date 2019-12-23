package com.homework;

public class ExeSequance {

	public ExeSequance() {
		System.out.println("execution of conctactor");
	}
	{
		System.out.println("execution of instance block");
	}

	static
	{
		System.out.println("execution of staic block");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ExeSequance();
	}

}
