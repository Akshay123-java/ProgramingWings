package com.string;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=new String ("Akshay");
		String s2=new String ("Akshay");
		String s3="Akshay";
		String s4="Akshay";
		String s5="Akshay";
		String s6= s1.intern();
		String s7= s3.toLowerCase();
		String s8= s3.toUpperCase();
	System.out.println(" s7 string :"+s7);
	
	
	//by compare operator we can check equals or not 
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
		 // only scp store and same memory address because refeance is pointing to same object
		System.out.println(s4==s5);
		
		// we are check the equals method to compare it only check the contains 
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		
		//using intern method we can push to scp 
		System.out.println(s6==s4);
		System.out.println(s1.equals(s6));
		
		//Without Ignore the case of small or capital of same contain y change their case
		
		System.out.println(s3.equals(s7));
	    System.out.println(s7.equals(s8));
		
		// Ignore the current case means capital or Small
		System.out.println(s7.equalsIgnoreCase(s8));
		System.out.println(s7.equalsIgnoreCase(s6));
		
		//using method of String 
		String s9=new String("Chidre");
		String s10="Chidre";
		String s11="Chidre";
		String s12=s9.intern();
		
		System.out.println(s9);
		System.out.println(s10);
		System.out.println(s11);
		System.out.println(s12);
		System.out.println(s9==s10);
		
		
		System.out.println();
		

	}

}
