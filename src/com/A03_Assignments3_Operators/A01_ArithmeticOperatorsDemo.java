package com.A03_Assignments3_Operators;

public class A01_ArithmeticOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y =10, z= 5;
		
		x=y+z;
		System.out.println("+ operator is resulted in " +x);
		
		x=y-z;
		System.out.println("- operator is resulted in " +x);
		
		x=y*z;
		System.out.println("* operator is resulted in " +x);
		
		x=y/z;
		
		System.out.println("/ operator is resulted in " +x);
		
		x=y%z;
		System.out.println("% operator is resulted in " +x);
		
		x= y++;//x=10; y=11----x will get the 10 value and y will get the 11 
		System.out.println("Postfix ++operator is resulted in " +x);
		
		x=++z;
		System.out.println("Prefix ++ operator is resulted in " +x);
		
		x=-y;
		System.out.println("Unary operator is resulted in " +x);
		
		int tooBig=Integer.MAX_VALUE +1;// -2147483648 which is
        // Integer.MIN_VALUE.

		
		int tooSmall=Integer.MIN_VALUE -1;
		// 2147483647 which is
        // Integer.MAX_VALUE.

		
		System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);
        
        System.out.println(5.0/0.0);//prints infinity
        System.out.println(-4.0/0.0);//prints -infinity
        System.out.println(4.0/0.0);//prints infinity
        System.out.println(0.0/0.0);//prints NAN
        
        double d1= 12/8;
        
        System.out.println("d1 is "+d1);
        
        
double d2= 12.0F/8;
        
        System.out.println("d2 is "+d2);
		
		

	}

}
