package com.ex_09_Arrays.ArrayStringInterview;

public class VowelsConsonantsSpecialcharacterCountinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x="PERSCHOLAS JAVA LEAARNING";

char[]a=x.toCharArray();
int size=a.length;
//i is initialized to traverse through array
//count variable for each vowel, consonant and special character

int i=0;
int vowcount=0;

int consocount=0;
int specialcount=0;

while(i!=size) {
	
	if(a[i]>='A'&& a[i]<='Z') {
		
		if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U') {
			++vowcount;
			
		}
		
		else {
			++consocount; 
		}
		
	}
	
	else {
			++specialcount;
	}
	++i;
		}


System.out.println(a);
System.out.println("vowcount :"+vowcount);
System.out.println("consocount :"+consocount);
System.out.println("specialcount :"+specialcount);
	}
	
	
			
		
	}


