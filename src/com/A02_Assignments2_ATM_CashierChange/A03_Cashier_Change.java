package com.A02_Assignments2_ATM_CashierChange;

import java.util.Scanner;

public class A03_Cashier_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializing value of coins as final so that it wont change at any time in the application
		
		final int NICKEL=5;
		final int QUARTER=25;
		final int DIME=10;

		
		
Scanner sc =new Scanner(System.in);

System.out.println("##########CASHIER CHANGE APPLICATION############");

// Getting user input for the Amount paid for the product

System.out.println("Please Enter the Amount Paid : ");
int amountPaid;
amountPaid=sc.nextInt();

// Getting user input to get the product Amount

System.out.println("Please Enter the Amount Due : ");
int productAmount;
productAmount=sc.nextInt();

System.out.println("#######################################");

// Change equation for the Amount paid and ProductAmount

int change = amountPaid-productAmount;


// Dollar and Pennies conversion for the change received by the User for the purchase

int dollarAmount = (change/100);
change=change-(dollarAmount*100);
System.out.println("The Change in Dollars is "+dollarAmount+" " +"The change in pennies is "+change);

System.out.println("#######################################");

//Quarters and Pennies conversion for the change received by the User for the purchase
int quarters=(change/QUARTER);
change=change-(quarters*QUARTER);
System.out.println("The Change in Quarters is "+quarters+" " +"The change in pennies is "+change);

System.out.println("#######################################");

//Dime and Pennies conversion for the change received by the User for the purchase
int dime=(change/DIME);
change=change-(dime*DIME);
System.out.println("The Change in Dime is "+dime+" " +"The change in pennies is "+change);

System.out.println("#######################################");

//Nickel and Pennies conversion for the change received by the User for the purchase
int nickel=(change/NICKEL);
change=change-(dime*NICKEL);
System.out.println("The Change in Nickel is "+nickel+" " +"The change in pennies is "+change);

System.out.println("#######################################");
sc.close();
	}


}
