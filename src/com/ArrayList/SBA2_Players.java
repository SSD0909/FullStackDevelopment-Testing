package com.ArrayList;

public class SBA2_Players {
	
	
	
	public static void main(String[] args)
    {
		
        // create an array
        int[] agesArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int[] playerRanking = { -1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        
        displayArray(agesArray);
        averageAge(agesArray);
        decommisionPlayer(1,playerRanking);
        sellPlayer(600000,1,playerRanking);
    }
	//Display Array
static void displayArray(int[] anyIntArray)
{
    System.out.println();
    System.out.println("***Display Array Content***");
    System.out.println();
    for (int i = 0; i < anyIntArray.length; i++)
    {
        System.out.println("Index ID "+(i)+" "+ anyIntArray[i]);
    }
}

static void averageAge(int[] ages) {
	
	
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

public static void decommisionPlayer(int playerID,int[] anyIntArray)
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
public static void sellPlayer(int fee,int id,int[] anyIntArray)
{
    if(anyIntArray[id] == 1){
        System.out.println("Player with id: "+id+" has been transferred with a fee of "+fee);
        anyIntArray[id] = -1;
    }
    else System.out.println("Player has already retired");
}
}
