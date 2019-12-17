package com.homework;

public class ExmOverloading {

	public int print(int a,float b){
		
		System.out.println("a :"+a +" b :"+b);
		
		return 0;
	}
	
	
	
	public int print(float a ,int b){
		
		System.out.println("a : "+a + " b :"+b);
		
		return 0;
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExmOverloading a1=new ExmOverloading();
		a1.print(10,10.0f);
		a1.print(10.0f, 10);
	//	a1.print(10, 10);
		
	}

}
