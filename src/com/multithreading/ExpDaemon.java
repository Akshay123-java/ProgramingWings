package com.multithreading;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class ExpDaemon extends Thread {
	
	public void run(){
		
		if (Thread.currentThread().isDaemon()){
			System.out.println("this thread is daemon thread "+Thread.currentThread().getName());
		}
		
		else{
			
			System.out.println("This thread is not a Daemon thread :" +Thread.currentThread().getName());
		}
		
		System.out.println("thread priority is :" +Thread.currentThread().getName());
		System.out.println("thread priority is :" +Thread.currentThread().getPriority());
		System.out.println("thread priority is :" +Thread.currentThread().getId());
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExpDaemon a1 =new ExpDaemon();
		ExpDaemon a2=new ExpDaemon();
		ExpDaemon a3=new ExpDaemon();
		
		a1.setDaemon(true);
		
		
		a1.start();
		
		a2.start();
		a3.start();
		
		
	}

}
