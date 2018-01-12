package com;

public class Demo extends Thread {

	@Override
	public void run() {
		fun1();

	}

	void fun1() {

		String tname = Thread.currentThread().getName();

		if (tname.equals("First")) {
			try {
				System.out.println(tname + " is sleeping for 5 secs");
				Thread.sleep(5000);
				System.out.println(tname + " is resumed from sleep");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 1; i <= 5; i++)
			System.out.println("I= " + i + " by " + tname);
	}

	public static void main(String[] args) {

		/*
		 * Demo d=new Demo(); d.fun1(); d.fun2();
		 */

		Demo d = new Demo();

		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		// t1.setPriority(MAX_PRIORITY);

		t1.setName("First");
		t2.setName("Second");

		t1.start();
		t2.start();

	}

}
