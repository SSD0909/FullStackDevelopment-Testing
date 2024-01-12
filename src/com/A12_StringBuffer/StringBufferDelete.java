package com.A12_StringBuffer;

public class StringBufferDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer bf= new StringBuffer("987456123");

		System.out.println(bf.toString());

			bf.delete(0,5);
		//delete till 4th index and give output	
			System.out.println(bf.toString());
	}

}
