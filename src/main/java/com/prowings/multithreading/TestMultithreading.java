package com.prowings.multithreading;

public class TestMultithreading {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();
	
		System.out.println("T1 state : "+t1.getState());
		System.out.println("T1 isAlive : "+t1.isAlive());
		System.out.println("T1 isDemon : "+t1.isDaemon());
//		t1.setName("mythread1");
		System.out.println(t1.getName());
//		t1.setPriority(9);
		System.out.println("Priority : "+t1.getPriority());
		System.out.println(">>>>>>>>>>>");
//		t1.start();

		MyThread2 m2 = new MyThread2();

		Thread t2 = new Thread(m2, "MyThread2");
		
//		t2.setPriority(1);
		System.out.println(t2.getName());

		t1.start();
		t2.start();
		System.out.println("T1 state : "+t1.getState());
		System.out.println("T1 isAlive : "+t1.isAlive());
		Thread.sleep(2000);
		System.out.println("T2 state : "+t2.getState());
	}

}
