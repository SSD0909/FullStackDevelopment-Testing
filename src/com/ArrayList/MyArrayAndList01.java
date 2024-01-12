package com.ArrayList;

import java.util.ArrayList;

public class MyArrayAndList01 implements MyList{

	
	    ArrayList<String> mySecondArrayList;
	    
	    
	    public MyArrayAndList01()
	    {
	        this.mySecondArrayList = new ArrayList<>();
	    }
	    
	    public void convert(String[]a) {
	    	
	    	
	    	for(int i=0;i<a.length;i++) {
	    		
	    		this.mySecondArrayList.add(a[i]);
	    		System.out.println("The added array is"+a[i]+"at index :"+i);
	    	}
	    	
	    	
	    }
	    
	    public void replace(int idx) {
	    	
	    	System.out.println("I have to replace the String: "+this.mySecondArrayList.get(idx)+" with null String");
	    	this.mySecondArrayList.set(idx, "");
	    	System.out.println("I have replaced the string: "+mySecondArrayList.get(idx)+ " with a null string");
	    }
	    
	    public ArrayList<String> compact()
	    {
	    	ArrayList<String> compactArraylist=new ArrayList<String>();
	    	for(int i=0;i<mySecondArrayList.size();i++) {
	    		
	    		if(!mySecondArrayList.get(i).equals("")) 
	    			
	    			compactArraylist.add(mySecondArrayList.get(i));
	    		}
	    		return compactArraylist;
	    	}
	    	
	    	
	    
	    }

