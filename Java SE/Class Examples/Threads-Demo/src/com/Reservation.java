package com;

class Operator implements Runnable {

	int noOfSeats = 1;
	int wanted;
	double price = 500;
	double amount;

	public Operator(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {
		bookTicket();
	}

	public void bookTicket() {
		String tName = Thread.currentThread().getName();
		System.out.println("Available Seats are: " + noOfSeats);

		synchronized (this) {

			System.out.println(tName + " Trying to Book " + wanted + " Seats");
			if (wanted <= noOfSeats) {
				try {
					Thread.sleep(3000);
					noOfSeats = noOfSeats - wanted;
					System.out.println(wanted + " Seats Booked to " + tName);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				System.out.println("Sorry. No Seats Avaiable for " + tName);
			}
		} // synch block
		
		//--------
		synchronized (this) {
			//
		}
		//---------------
		synchronized (this) {
			// 
		}

	}

}

public class Reservation {

	public static void main(String[] args) {

		Operator op = new Operator(1);

		Thread p1 = new Thread(op);
		Thread p2 = new Thread(op);

		p1.setName("Passenger-1");
		p2.setName("Passenger-2");

		p1.start();
		p2.start();

	}

}
