package com.homework;

import java.util.Arrays;

public class ArrayExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] a1=new long[6];
		a1[0]=10;
		a1[1]=30;
		a1[2]=40;
		a1[3]=50;
		a1[4]=50;
		a1[5]=60;
		
		for(int i=0;i<a1.length ;i++){
			
			System.out.println(a1[i]);
		}
		
		
		System.out.println(Arrays.toString(a1));
		
	}

}
