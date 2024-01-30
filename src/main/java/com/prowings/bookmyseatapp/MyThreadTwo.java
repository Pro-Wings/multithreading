package com.prowings.bookmyseatapp;

public class MyThreadTwo extends Thread{
	
	Theater theater;
	int seat;

	public MyThreadTwo(Theater theater, int seat) {
		super();
		this.theater = theater;
		this.seat = seat;
	}

	public void run() {
		
		theater.bookSeats(seat);
		
	}
	
	

}
