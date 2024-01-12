package com.ex_09_Arrays.ArrayStringInterview;

public class Stringloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for(int;terminat;incre){}
		//init while(termina){incr}
		//init do { incre}while(termin)
		
		int []a= {10,20,30,40};
		
		int size=a.length;
		int sum=0;
		int i=0;
		while(i!=size) {
			
			sum=sum+a[i];
			++i;
		}
System.out.println(sum);

int sum1=0;
for(int data: a) {
	
	sum1=sum1+data;
}
System.out.println(sum1);
	}

}
