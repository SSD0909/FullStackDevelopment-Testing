package com.ex_00_Basics1;


public class B09_Typecasting_downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//converting a larger type to a smaller size type manually
int varInt=2;
byte varByte=(byte)varInt;//need to downcast : add (byte) at the beginning
System.out.println(varByte);
float varFloat=10.5f;
int varInt2=(int)varFloat;//need to downcast : add (byte) at the beginning
System.out.println(varInt2);
	}

}
