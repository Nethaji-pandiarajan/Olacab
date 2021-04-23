package com.UtilApp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class UtilApp {
	
	public static boolean CheckNumber(String mbno) {
		boolean check=false;
		if(mbno.matches("\\d{10}")) 
			check=true;
		return check;
	}
	
	public static boolean CheckLogin(String mbno,String pass) {
		boolean valid = false;
		if (mbno.equals("9751713840") && pass.equals("Nethaji")) {	
					return true;
		}
		return valid;		
	}
	
	public static double amountperkm(int Cabtypes, int km) {
		double rs = 0;
		switch(Cabtypes) {
		case 1:
			 rs=km*10;
			 break;
		case 2:
			rs=km*15;
			break;
		case 3:
			rs=km*20;
			break;
		default:
			System.out.println("Enter the correct value.");
			break;
		}
		return rs;
	}


	public static double gst(double price) {
		double gstprice;
		gstprice = (price*0.07) + price;
		return gstprice;
	}
	
	public static boolean DateTimeCheck(String date, String time) {
		LocalDate JourneyDate = LocalDate.parse(date);
		LocalTime JourneyTime = LocalTime.parse(time);
		LocalDate CurrentDate = LocalDate.now();
		LocalTime CurrentTime = LocalTime.now();
		boolean isValid = false;
		if(JourneyDate.isAfter(CurrentDate)) {
			return true;
		}		
		return isValid;
	}
	
	public static boolean CheckPeakTime(String JourneyTime) {
		LocalTime time = LocalTime.parse(JourneyTime);
		int hour =time.getHour();
		if (hour >=17 && hour <=19) {
			return true;
		}
		return false;
	}
	
	public static double PeakTimePrice(double gst) {
		double PeakTimeAmt = (1.25/100 *gst)+gst;
		return PeakTimeAmt;
	}
	
	public static boolean CheckSeniorCitizen(String date) {
		LocalDate dob = LocalDate.parse(date);
		int dobyear = dob.getYear();
		LocalDate CurrentDate = LocalDate.now();
		int CurrentYear = CurrentDate.getYear();
		int age = CurrentYear - dobyear;
		if(age> 60) {
			return true;
		}
		return false;
	}
	
	public static double SeniorCitizenPrice(double gst) {
		double SeniorCitizenPrice = gst/2;
		return SeniorCitizenPrice;
}

}