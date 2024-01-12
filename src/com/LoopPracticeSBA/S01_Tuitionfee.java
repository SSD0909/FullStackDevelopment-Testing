package com.LoopPracticeSBA;

public class S01_Tuitionfee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int totalCost=0;
int tuition=10000;
int tuitiontenthyear=0;

int tax=5;
for(int i=1;i<=14;i++) {
	
	int tuitiontax=tuition*(tax)/100;
	//System.out.println(tuitiontax);
	tuition=tuition+tuitiontax;
	//System.out.println(tuition);
	if(i>10) 
		totalCost=totalCost+tuition;
	
	if(i==10) 
		tuitiontenthyear=tuition;
	
}
System.out.println("Tution for the ten years : $"+tuitiontenthyear);
System.out.println("Total cost for four years worth tuition after ten years is : $ "+totalCost);
	}

}
