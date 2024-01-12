package com.ex_09_Arrays.ArrayStringInterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="SILLY SPIDER";
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
		Set<Map.Entry<Character,Integer> >hmap= map.entrySet();
		for(Map.Entry<Character,Integer> data: hmap) {
			
			if(data.getValue()==1) {
				
				System.out.print("The first non-repeated character is "+data.getKey());
				System.exit(0);
			}
			
		}
	}

}
