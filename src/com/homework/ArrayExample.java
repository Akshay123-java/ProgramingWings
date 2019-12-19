package com.homework;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1={10,20,30,50};
		
		for(int i =0; i<a1.length;i++){
		
		System.out.println(a1[i] +"");
		
		
		}
		
		int total=0;
		for (int i=0;i<a1.length ;i++){
			
			total +=a1[i];
		
		}
		System.out.println(total);
		
		int max=a1[0];
		
		for(int i=0; i<a1.length ;i++){
			
			if(a1[i]>max){
				
				max=a1[i];
			}
		}
		
		System.out.println("max is"+max);
	}

}
