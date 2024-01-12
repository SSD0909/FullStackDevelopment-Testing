package com.ArrayList;

import java.util.Arrays;

public abstract class SBA2_FootballPlayer implements Sport {
	
	
	final int NO_OF_PLAYERS = 11;
    int[] playerIDs;
    SBA2_FootballPlayer()
    {
        playerIDs = new int[NO_OF_PLAYERS + 1];
        Arrays.fill(this.playerIDs, 1);
        this.playerIDs[0] = -1;
        System.out.println("A new American Foot Ball team has been formed");

    }
    
    public void displayArray(int[] anyIntArray)
    {
        System.out.println();
        System.out.println("***Display Array Content***");
        System.out.println();
        for (int i = 0; i < anyIntArray.length; i++)
        {
            System.out.println("Index ID "+(i)+" "+ anyIntArray[i]);
        }
    }

    public void averageAge(int[] ages) {
    	
    	
    	double average, sum=0;
    	
    	for (int age: ages) {
    		sum+=age;
    		
    			}
    	double l=ages.length-1;
    	average=sum/l;
    	System.out.format("Average is %.2f\n",average );
    }

    //moving one place to next

    //playerId is the index of the array 

    public  void decommisionPlayer(int playerID,int[] anyIntArray)
    {
        if(anyIntArray[playerID] == 1)
        {
            System.out.println("Player with id: "+playerID+" has been decommision");
            anyIntArray[playerID] = -1;
        }
        else System.out.println("Player has already been decommision");
    }

    //once player is sold
    //find player who has not retires amd sell player
    public  void sellPlayer(int fee,int id,int[] anyIntArray)
    {
        if(anyIntArray[id] == 1){
            System.out.println("Player with id: "+id+" has been transferred with a fee of "+fee);
            anyIntArray[id] = -1;
        }
        else System.out.println("Player has already retired");
    }
}
