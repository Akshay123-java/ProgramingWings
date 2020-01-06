package com.interview;

public  final class ImmutableClass {
	
	final int  id;
	final String name;
	
	
	

	public ImmutableClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImmutableClass a=new ImmutableClass(10, "akshay");
		
		System.out.println(a.getId());
		System.out.println(a.getName());
		//a.id=20;  //get an error hear do not change the value of final variable and final class after creation of object
		
	}

}
