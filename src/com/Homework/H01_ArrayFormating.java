package com.Homework;

public class H01_ArrayFormating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] test= {{"Floating", "double", "0064" },{"Floating", "float", "0032"},
		{"Integral", "long", "0064"},{"Integral", "int", "0032"},{"Integral", "char", "0016"},
		{ "Integral", "short", "0016"},{"Integral", "byte", "0008"},{"Boolean", "boolean", "0001"}
		};
		
		//String[]test={"Floating", "double", "0064" };
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("| %10s | %-8s | %4s | %n ", "CATEGORY", "NAME", "BITS");
		System.out.printf("-----------------------------------------------%n");
		for(int i=0;i<8;i++) {
			for(int j=0; j<test[i].length;j++) {
			System.out.printf("| %10s ", test[i][j],"| %-8s " , test[i][j]," | %4s | %n ",test[i][j]);
			
		}
			System.out.printf("%n");
		
	}
		System.out.printf("------------------------------------------------%n");
}
}
