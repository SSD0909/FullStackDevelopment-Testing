package com.A12_StringBuffer;

public class StringBufferInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer bf= new StringBuffer("6789");

		System.out.println(bf.toString());

			bf.insert(1, "12345");
			//it can insert into a string based on the length
			System.out.println(bf.toString());
	}

}
