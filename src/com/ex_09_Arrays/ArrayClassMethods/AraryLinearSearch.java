package com.ex_09_Arrays.ArrayClassMethods;

public class AraryLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       int[] list = {2, 5, 9, 12, 17, 37, 86};
	       int i = AraryLinearSearch.linearsearch(list, 17); // Returns 4
	       System.out.println(i);

	       int j = AraryLinearSearch.linearsearch(list, -4); // Returns -1
	       System.out.println(j);

	       int k = AraryLinearSearch.linearsearch(list, 3); // Returns -1
	       System.out.println(k);
	   }

	   public static int linearsearch(int[] list, int key) {
	       for (int i = 0; i < list.length; i++)
	           if (key == list[i])
	               return i;
	       return -1;

	}

}
