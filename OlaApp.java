package com.olaapp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class OlaApp {

	public static void main(String[] args) {
		double gst = 0.07;
		double peakper = 0.0125;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mobile number");
		long MobileNumber = sc.nextLong();
		System.out.println("Password");
		String password = sc.next();

		System.out.println("Cab Types");
		System.out.println("1.Micro (Rs.10/km) \n 2.Mini (Rs.15/km) \n 3.Prime (Rs.20/km)");

		System.out.println("\n Price Estimator");
		System.out.println("Enter the type of cab:");
		int type = sc.nextInt();
		if (type == 1) {
			System.out.println("Enter number of km:");
			int a = sc.nextInt();
			double rs = a * 10;
			double bill = (rs * gst) + rs;
			System.out.println("Your total Bill Amount Rs:" + bill);
			System.out.println("Booking");
			System.out.println("Journey Date:");
			String JourneyDate = sc.next();
			LocalDate JD = LocalDate.parse(JourneyDate);
			System.out.println("Pickup Time");
			String PickUpTime = sc.next();
			LocalTime PT = LocalTime.parse(PickUpTime);
			System.out.println("Journey Date:" + JD);
			System.out.println("Pickup Time:" + PT);
			int PThour = PT.getHour();
			if (PThour >= 17 && PThour <= 19) {
				double peakrs = (bill * peakper) + bill;
				System.out.println("Bill amount in peak hours:" + peakrs);
				System.out.println("Enter your dob:");
				String Dob = sc.next();
				LocalDate DOB = LocalDate.parse(Dob);
				int ageyear = DOB.getYear();
				LocalDate rec = LocalDate.now();
				int curyear = rec.getYear();
				int age = curyear - ageyear;
				if (age > 60) {
					System.out.println("You are a senior Citizen. So, 50% discount !");
					double price = peakrs * 0.5;
					System.out.println("You have to pay:" + price);
					System.out.println("Happy Journey...!");
				}

				else {
					System.out.println("You have to pay" + peakrs);
					System.out.println("Happy Journey...!");
				}

			} else {
				System.out.println("Enter your dob:");
				String Dob = sc.next();
				LocalDate DOB = LocalDate.parse(Dob);
				int ageyear = DOB.getYear();
				LocalDate rec = LocalDate.now();
				int curyear = rec.getYear();
				int age = curyear - ageyear;
				if (age > 60) {
					System.out.println("You are a senior Citizen. So, 50% discount !");
					double peakrs = (bill * peakper) + bill;
					double price = peakrs * 0.5;
					System.out.println("You have to pay:" + price);
					System.out.println("Happy Journey...!");
				} else {
					System.out.println("You have to pay" + bill);
					System.out.println("Happy Journey..!");
				}

			}

		}
		if (type == 2) {
			System.out.println("Enter number of km:");
			int a = sc.nextInt();
			double rs = a * 15;
			double bill = (rs * gst) + rs;
			System.out.println("Your total Bill Amount Rs:" + bill);
			System.out.println("Booking");
			System.out.println("Journey Date:");
			String JourneyDate = sc.next();
			LocalDate JD = LocalDate.parse(JourneyDate);
			System.out.println("Pickup Time");
			String PickUpTime = sc.next();
			LocalTime PT = LocalTime.parse(PickUpTime);
			System.out.println(JD);
			System.out.println(PT);
			int PThour = PT.getHour();
			if (PThour >= 17 && PThour <= 19) {
				double peakrs = (bill * peakper) + bill;
				System.out.println("Bill amount in peak hours:" + peakrs);
				System.out.println("Enter your dob:");
				String Dob = sc.next();
				LocalDate DOB = LocalDate.parse(Dob);
				int ageyear = DOB.getYear();
				LocalDate rec = LocalDate.now();
				int curyear = rec.getYear();
				int age = curyear - ageyear;
				if (age > 60) {
					System.out.println("You are a senior Citizen. So, 50% discount !");
					double price = peakrs * 0.5;
					System.out.println("You have to pay:" + price);
					System.out.println("Happy Journey...!");
				}

				else {
					System.out.println("You have to pay" + peakrs);
					System.out.println("Happy Journey...!");
				}

			} else {
				System.out.println("Enter your dob:");
				String Dob = sc.next();
				LocalDate DOB = LocalDate.parse(Dob);
				int ageyear = DOB.getYear();
				LocalDate rec = LocalDate.now();
				int curyear = rec.getYear();
				int age = curyear - ageyear;
				if (age > 60) {
					System.out.println("You are a senior Citizen. So, 50% discount !");
					double peakrs = (bill * peakper) + bill;
					double price = peakrs * 0.5;
					System.out.println("You have to pay:" + price);
					System.out.println("Happy Journey...!");
				} else {
					System.out.println("You have to pay" + bill);
					System.out.println("Happy Journey..!");
				}

			}

		}
		if (type == 3) {
			System.out.println("Enter number of km:");
			int a = sc.nextInt();
			double rs = a * 20;
			double bill = (rs * gst) + rs;
			System.out.println("Your total Bill Amount Rs:" + bill);
			System.out.println("Booking");
			System.out.println("Journey Date:");
			String JourneyDate = sc.next();
			LocalDate JD = LocalDate.parse(JourneyDate);
			System.out.println("Pickup Time");
			String PickUpTime = sc.next();
			LocalTime PT = LocalTime.parse(PickUpTime);
			System.out.println(JD);
			System.out.println(PT);
			int PThour = PT.getHour();
			if (PThour >= 17 && PThour <= 19) {
				double peakrs = (bill * peakper) + bill;
				System.out.println("Bill amount in peak hours:" + peakrs);
				System.out.println("Enter your dob:");
				String Dob = sc.next();
				LocalDate DOB = LocalDate.parse(Dob);
				int ageyear = DOB.getYear();
				LocalDate rec = LocalDate.now();
				int curyear = rec.getYear();
				int age = curyear - ageyear;
				if (age > 60) {
					System.out.println("You are a senior Citizen. So, 50% discount !");
					double price = peakrs * 0.5;
					System.out.println("You have to pay:" + price);
					System.out.println("Happy Journey...!");
				}

				else {
					double peakrs3 = (bill * peakper) + bill;
					System.out.println("You have to pay" + peakrs3);
					System.out.println("Happy Journey...!");
				}

			} else {
				System.out.println("Enter your dob:");
				String Dob = sc.next();
				LocalDate DOB = LocalDate.parse(Dob);
				int ageyear = DOB.getYear();
				LocalDate rec = LocalDate.now();
				int curyear = rec.getYear();
				int age = curyear - ageyear;
				if (age > 60) {
					System.out.println("You are a senior Citizen. So, 50% discount !");
					double peakrs = (bill * peakper) + bill;
					double price = peakrs * 0.5;
					System.out.println("You have to pay:" + price);
					System.out.println("Happy Journey...!");
				} else {
					System.out.println("You have to pay" + bill);
					System.out.println("Happy Journey..!");
				}

			}

		}
		if (type > 3) {
			System.out.println("Please Choose the right Cab");
		}

	}
}
