package com.ex_09_Arrays.ArrayStringInterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapMaximumOccuringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="God Bless Spider";
x=x.toUpperCase();
x=x.replace(" ", "");

char[]a=x.toCharArray();
int size=a.length;
int i=0;
Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
while(i!=size) {
	
	if(map.containsKey(a[i])==false) {
		
		map.put(a[i], 1);
		
	}
	else {
		int oldval=map.get(a[i]);
		int newval=oldval+1;
		map.put(a[i], newval);
	}
	++i;
	
	
}
char maxchar=' ';
int maxval=0;
Set<Map.Entry<Character,Integer> >hmap= map.entrySet();
for(Map.Entry<Character,Integer> data: hmap) {
	
	
	
	if(data.getValue()>maxval) {
		
		maxval=data.getValue();
		maxchar=data.getKey();
	}
}
System.out.print(maxchar);	
System.out.println(maxval);	
	}

}
