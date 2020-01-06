package com.reverse;

public class StringToStringBuilderConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="absdef";
		StringBuilder s2=new StringBuilder();
		
		s2.append(s1);
		s2=s2.reverse();
		System.out.println("Revere of a String is :"+s2);

	}

}
