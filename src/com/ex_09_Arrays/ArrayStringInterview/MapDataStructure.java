package com.ex_09_Arrays.ArrayStringInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// maps are key value pair
		///keys are unique and the values can have duplicate
//Questions on Map 
		//find all input string has unique characters in it
		//find all non repeated characters in string
		//find first non repeated character in string
		//find max occuring caracter
		//print duplicate characters
		//remove duplicate characters
		
		String x="STEPHY DANIEL";
		x=x.replace(" ", "");
		
		char[]a=x.toCharArray();
		int size=a.length;
		int i=0;
		Map<Character,Integer> map=new HashMap<Character, Integer>();
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
		Set<Map.Entry<Character,Integer> >hmap= map.entrySet();
		for(Map.Entry<Character,Integer> data: hmap) {
			
			System.out.print(data.getKey());
			System.out.println(data.getValue());
		}
	}
	

}
