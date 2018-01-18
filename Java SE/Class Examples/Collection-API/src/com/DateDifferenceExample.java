package com;

import java.util.Calendar;

public class DateDifferenceExample {
	public static void main(String[] args) {
		//
		// Creates two calendars instances
		//
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();

		//
		// Set the date for both of the calendar instance
		//
		cal1.set(1984, 10, 05);
		cal2.set(2012, 07, 16);

		//
		// Get the represented date in milliseconds
		//
		long milis1 = cal1.getTimeInMillis();
		long milis2 = cal2.getTimeInMillis();

		//
		// Calculate difference in milliseconds
		//
		long diff = milis2 - milis1;

		//
		// Calculate difference in seconds
		//
		long diffSeconds = diff / 1000;

		//
		// Calculate difference in minutes
		//
		long diffMinutes = diff / (60 * 1000);

		//
		// Calculate difference in hours
		//
		long diffHours = diff / (60 * 60 * 1000);

		//
		// Calculate difference in days
		//
		long diffDays = diff / (24 * 60 * 60 * 1000);

		System.out.println("In milliseconds: " + diff + " milliseconds.");
		System.out.println("In seconds: " + diffSeconds + " seconds.");
		System.out.println("In minutes: " + diffMinutes + " minutes.");
		System.out.println("In hours: " + diffHours + " hours.");
		System.out.println("In days: " + diffDays + " days.");
	}
}