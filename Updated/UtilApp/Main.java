package com.UtilApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String JourneyTime;
		System.out.println("Hint Mobile number:9751713840,Password:Nethaji");
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Mobile Number");
			String mobNum = input.next();
			System.out.println("Enter the password");
			String password = input.next();
			boolean validCheck = UtilApp.CheckLogin(mobNum, password);
			boolean validCheck1;
			if(validCheck==true) {
				System.out.println("Successfully Logged In\n");
				System.out.println("----------------------------------------");
				break;
			}

			else {
				System.out.println("Login failed..!");		
				validCheck1 = false;
			}
			if(validCheck1 = false) {
				break;
			}
		}
		System.out.println("CAB TYPES:");
		System.out.println("1.MICRO(Rs.10/km) \n2.MINI (Rs.15/km)\n3.PRIME (Rs.20/km)");
		int Cabtypes =input.nextInt();
		System.out.println("Enter km:");
		int km =input.nextInt();
		double price = UtilApp.amountperkm(Cabtypes,km);
		System.out.println("----------------------------------------");
		System.out.println("The Fare price of the travel is "+price);
		double gst =  UtilApp.gst(price);
		System.out.println("Including GST you have to pay:" +gst);
		System.out.println("----------------------------------------");
		while(true) {
			System.out.println("Enter your Journey date(YYYY-MM-DD)");
			String JourneyDate =input.next();
			System.out.println("Enter your PickUp time(HH-MM-SS):");
		    JourneyTime =input.next();
			boolean CheckDateTime= UtilApp.DateTimeCheck(JourneyDate,JourneyTime);
			if(CheckDateTime == true) {
				System.out.println("Your Journey Date is Confirmed");
				boolean PeakTime = UtilApp.CheckPeakTime(JourneyTime);
				if(PeakTime==true) {
					double PeakAmount = UtilApp.PeakTimePrice(gst);
					System.out.println("Price due to peak:" +PeakAmount);
					break;
					}
				else {
					
					System.out.print("Normal Price.He had to pay:" +gst);
					break;
				}
			}
		   else {
				CheckDateTime=false;
				System.out.println("Invalid Date & Time");
			}
			if(CheckDateTime=false) {
				break;
			}
		}
		System.out.println("----------------------------------------");
		System.out.println("Enter your DOB(YYYY-MM-DD):");
		String Dob = input.next();
		boolean SeniorCitizen = UtilApp.CheckSeniorCitizen(Dob);
		if(SeniorCitizen == true) {
			boolean PeakTime = UtilApp.CheckPeakTime(JourneyTime);
			if(PeakTime==true) {
				double PeakAmount = UtilApp.PeakTimePrice(gst);
				System.out.println("As You're a Senior Citizen and You're travelling in Peak time.\nSo You have to pay:" +PeakAmount/2);
				System.out.println("----------------------------------------");
				}
			else {
				double SeniorCitizenPrice= UtilApp.SeniorCitizenPrice(gst);
				System.out.println("Discount for Senior Citizen is 50 %.\nHe needs to pay:" +SeniorCitizenPrice);
				System.out.println("----------------------------------------");
			}
		}
		else {
			System.out.println("Not a Senior Citizen");
			boolean PeakTime = UtilApp.CheckPeakTime(JourneyTime);
			if(PeakTime==true) {
				double PeakAmount = UtilApp.PeakTimePrice(gst);
				System.out.println("Price due to peak:" +PeakAmount);
				}
			else {
				System.out.println("Finally You have to pay :" +gst);
				System.out.println("----------------------------------------");
			}
		}
		input.close();
		}
}