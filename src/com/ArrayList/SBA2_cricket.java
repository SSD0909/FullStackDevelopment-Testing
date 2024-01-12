package com.ArrayList;

import java.util.Arrays;

public class SBA2_cricket {

	abstract class Cricket implements Sport
	{
	    final int NO_OF_PLAYERS = 11;
	    int[] playerIDs;

	    Cricket()
	    {
	        playerIDs = new int[NO_OF_PLAYERS + 1];
	        Arrays.fill(this.playerIDs, 1);
	        this.playerIDs[0] = -1;
	        System.out.println("A new cricket team has been formed");
	    }

	    public void averageAge(int[] ages)
	    {

	        System.out.format("The average age of the team is %.2f\n");
	    }

	    public void retirePlayer(int playerID)
	    {
	         System.out.println("Player has already retired");
	    }


	}

}
