package com.A12_StringBuffer;

public class StringInsertReplaceReverseDeleteMethodchain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer bf= new StringBuffer("1235");

		System.out.println(bf.toString());

			bf.replace(0,5,"6785").insert(0,"12345").reverse().delete(0, 3);
			
			System.out.println(bf.toString());
	}

}
