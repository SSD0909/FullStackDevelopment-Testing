package com.ex_09_Arrays.ArrayStringInterview;

public class DeleteAllOccurancesofaCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="SPIDERSLIES";
		char [] a= s.toCharArray();
		
		int i=0;
		int size=s.length();
	
char key='S';
String res="";

while(i!=size) {
	if(a[i]!=key) {
		
		res=res+a[i];
	}
	++i;
}
System.out.println(res);
	}

}
