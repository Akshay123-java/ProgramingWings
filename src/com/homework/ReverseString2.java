package com.homework;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abcdef";
		String reverse="";
		
		for(int i=s1.length()-1;i>=0;i--){
			
			reverse=reverse+s1.charAt(i);
	

		}
		
		System.out.println("Reverse a String  by Loop method :"+reverse);
		
		
	}

}
