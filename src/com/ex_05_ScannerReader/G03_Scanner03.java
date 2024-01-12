package com.ex_05_ScannerReader;

import java.util.Scanner;

public class G03_Scanner03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the timezone offset to GMT : ");
		int offset = sc.nextInt();
		
		long totalMilliseconds=System.currentTimeMillis();
		
		long totalseconds=totalMilliseconds/1000;
		
		long currentSecond=totalseconds % 60;
		
		long totalminutes = totalseconds /60;
		
		long currentMinute = totalminutes %60;
		
		long totalHours=totalminutes /60;
		
		long currentHour=totalHours %24;
		currentHour = currentHour +offset;
		
		System.out.println("Current time is " +currentHour+":"+currentMinute+":"+currentSecond);
sc.close();
	}

}
