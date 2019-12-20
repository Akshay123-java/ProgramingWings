package com.string;

public class StringExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    String s1 = "abc";
		    String s2 = "abc";
		    String s3 = new String("abc");
		    String s4 = s3.intern();
		    System.out.println("s1: "+System.identityHashCode(s1));
		    System.out.println("s2: "+System.identityHashCode(s2));
		    System.out.println("s3: "+System.identityHashCode(s3));
		    System.out.println("s4: "+System.identityHashCode(s4));
		    
		    System.out.println(s1==s2);
		    System.out.println(s1==s3);
		    System.out.println(s1==s4);
		    System.out.println(s3==s4);
		    

	}

}
