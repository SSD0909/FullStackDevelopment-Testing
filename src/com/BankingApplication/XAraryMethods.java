package com.BankingApplication;

import java.util.ArrayList;
import java.util.Arrays;

public class XAraryMethods
{
    public static void main(String[] args){

        String[] friendsArray = {"John", "Chris", "Eric", "Luke"};

        ArrayList<String> friendsArrayList =
                new ArrayList<>( Arrays.asList("John", "Chris", "Eric", "Luke"));
        // Get element

     // Get element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(2));// Get element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(2));
        //find anything in arraylist we use get and add() is used to add elements in arraylist
     // Get Size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());
        
      //Add an Element
        friendsArrayList.add("Mitch");
        System.out.println(friendsArrayList.get(1));
        
     // Set an Element
        friendsArray[0] = "Carl";
        System.out.println(friendsArray[0]);
        friendsArrayList.set(0, "Carl");
        System.out.println(friendsArrayList.get(0));
        
      //Remove an Element
        friendsArrayList.remove(1);
        System.out.println(friendsArrayList.get(1));

        System.out.println(friendsArray);
        System.out.println(friendsArrayList);

    }
}

