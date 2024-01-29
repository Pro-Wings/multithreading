package com.prowings.multithreading.interferance;

public class Counter {

	 private static volatile int c = 0;

	    public void increment() {
	        c++;
	    }

	    public void decrement() {
	        c--;
	    }

	    public int value() {
	        return c;
	    }
}
