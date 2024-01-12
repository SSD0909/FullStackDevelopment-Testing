package com.A09_WhileLoop;

public class A09_PredictFutureTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year=0;
double tuitionFee=10000;
double futurefee=2*tuitionFee;
//tax is 7% 
double tax=7;


while(tuitionFee<futurefee) {
	
	tax=(tuitionFee*7)/100;
    
	tuitionFee=tuitionFee+tax;
		
	year++;	
}
	System.out.println("The tuition fee will be doubled in "+year+"years");	
	}

}
