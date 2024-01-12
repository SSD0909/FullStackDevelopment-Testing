package com.LoopPracticeSBA;

public class S01_ArrayForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=50;i<=55;i++) {
	
	System.out.println(i*3);
}
double [] array= {13.5,12.7,1.6};

for(int i=0;i<array.length;i++) {
	System.out.println(array[i]);
}
int counter=0;
while(counter<5) {
	
	System.out.println("hello"+counter);
//counter++;
	counter+=1;
}
int totalScore=101;
do {
	
	System.out.println("Hello");
	//totalScore++
	totalScore+=1;
}while(totalScore<100);
	}

}
