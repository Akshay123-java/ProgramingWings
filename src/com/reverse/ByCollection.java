package com.reverse;

import java.util.Scanner;

public class ByCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String a1,reverse="";
		 Scanner a2= new Scanner(System.in);
		 a1=a2.nextLine();
		 
		 int l1=a1.length();
		 System.out.println(l1);
		 for(int i=l1-1;i>=0;i--){
			 
			 reverse=reverse+a1.charAt(i);
			 System.out.println(" Reverse of a string is :"+reverse);
		 }
		 
		 
		 
		 
	}

}
