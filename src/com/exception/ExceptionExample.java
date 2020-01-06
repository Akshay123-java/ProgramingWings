package com.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			
			System.out.println(10/0);
			
		}
		
		catch(ArithmeticException e){
			
			e.getStackTrace();
		/*	System.out.println(e.toString());
			System.out.println(e.getMessage());
		*/	
		}
		
	}

}
