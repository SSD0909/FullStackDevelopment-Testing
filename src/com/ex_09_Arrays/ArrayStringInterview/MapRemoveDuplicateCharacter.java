package com.ex_09_Arrays.ArrayStringInterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapRemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Logic is to gather all the strings inside a new string 
		

		String x= "SILLYSPIDERS";
		
		char[]a=x.toCharArray();
		int size=a.length;
		int i=0;
		Map<Character,Integer> map=new LinkedHashMap<Character, Integer>();
		while(i!=size) {
			//MAP.CONTAINSKEY(A[I])==FALSE....CHECKS IF THE KEY CONTAINSVALUE OR NOT, IF FALSE 
			//IT WILL PLACE THE ONE VALUE FOR THE KEY IN A[I]
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
		Set<Map.Entry<Character,Integer> >lhmap= map.entrySet();
		//The key are always unique and all keys are accumulated in a string
		
		String rem=" ";
		for(Map.Entry<Character,Integer> data: lhmap) {
			
				rem= rem+data.getKey();
			}
			System.out.println(rem);
		
		
	}

}
