package com.string;

public class StringExmple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="ABC";
		String s2="ABC";
		String s3="ABC";
	//	String s6="";
    	//String s7=s6.intern();
    	//System.out.println(s7);
		String s4=new String("ABC");
		
		System.out.println(s3==s4); // false
		System.out.println(s1==s2); // True 
		String s5=s4;
		System.out.println(s5==s4); // true
		System.out.println(s4==s3);
		

	}

}
