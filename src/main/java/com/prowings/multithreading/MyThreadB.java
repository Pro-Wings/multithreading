package com.prowings.multithreading;

public class MyThreadB implements Runnable {

	public void run() {
		for (int j = 0; j < 2; j++) {
			try {
				// sleeping the thread for 300 milli seconds
				Thread.sleep(3000);
				System.out.println("The current thread name is: " + Thread.currentThread().getName());
			}
			// catch block for catching the raised exception
			catch (Exception e) {
				System.out.println("The exception has been caught: " + e);
			}
			System.out.println(j);
		}
	}
}
