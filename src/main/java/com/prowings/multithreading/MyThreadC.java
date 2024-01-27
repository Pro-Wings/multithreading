package com.prowings.multithreading;

public class MyThreadC extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) 
		{// checking for daemon thread
			System.out.println("daemon thread work : "+Thread.currentThread().getName());
		} 
		else 
		{
			System.out.println("user thread work : "+Thread.currentThread().getName());
		}
	}

}
