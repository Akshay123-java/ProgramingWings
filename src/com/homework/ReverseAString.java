package com.homework;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abcdef";
		
		StringBuilder s2= new StringBuilder();
		
	  	s2.append(s1);
	  	
	  	System.out.println("Revers of a string by using String to StringBuilder :" +s2.reverse());
		
	}

}
