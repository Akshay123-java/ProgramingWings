package com.innerclas;

public class InnerClassExample {
	
	
	

  static   int id =200;
    String name="AkshayProgrammer" ;
    
    class Innerex{

    	 int i=500;
    	
    	public void print(){
    		
    		System.out.println("THis is the element of inner  class :->" +i);
    		
    		System.out.println("This is the member of outer class =->" +id +"  " +name);
    		
    	}
    	
    }
    
    
    static  class InnerSecond{
    	
    	static String n="Akshay";
    	
    	int j=50;
    	
    	public void scan(){
    		
    		System.out.println("Static variable are from outer class it print inside a static inner class  :-> " +id);
    		
    		System.out.println("instance variable from inner  class in static inner class type :-> " +n);
    		
    		
    		
    	}
    	
    	
    	
    	
    
    
    	
    	
   
    }
    
    
    public void localMeth(){
    	
    	int k=20;
    	
    	class LocalClassExam{
    		
    		int lum=50;
    	
    		public void meth(){
    			
    			System.out.println("THis is the variable of local inner class :->"+lum);
    			
    			System.out.println("This is the variable of outer class :-> "+name);
    			
    			
    		}
    		
    
    		
    		
    	}
    }
    
    
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		InnerClassExample in =new InnerClassExample();
		InnerClassExample.Innerex a1= in.new Innerex();
		
		InnerSecond a2= new InnerSecond();
		
		
		a1.print();
		a2.scan();
		
		System.out.println("End a progrma =-> ");
		
	}

}
