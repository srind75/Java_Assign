package com.functional.lambda;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("LocalDate : "+date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println(dd+"..."+mm+"..."+yy);
		System.out.printf("\n%d-%d-%d",dd,mm,yy);
		System.out.println();
		
		LocalTime time = LocalTime.now();
		System.out.println("LocalTime : "+time);
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.printf("\n%d:%d:%d:%d",h,m,s,n);
	}
}
