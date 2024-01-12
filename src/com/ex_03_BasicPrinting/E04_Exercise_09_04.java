package com.ex_03_BasicPrinting;

public class E04_Exercise_09_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Population Projection");
		System.out.println("Current Population : 312032486");
		System.out.println("One birth every 7 seconds.");
		System.out.println("One death every 13 seconds.");
		System.out.println("One new Immigrant every 45 seconds.");
		System.out.println("########################################");
		System.out.println("Yearly population projection formula : ");
		System.out.println("Current population + ((births per year)");
		System.out.println("                   -(deaths per year)");
		System.out.println("                   +(new immigrants per year))");
		System.out.println("                    * year.");
		System.out.println("##############################");
		System.out.println("Year 1 projection: ");
		System.out.println(312032486 + (((31536000/7)
				                     - (31536000/13)
				                     + (31536000/45))*1));
		
		System.out.println("##############################");
		System.out.println("Year 2 projection: ");
		System.out.println(312032486 + (((31536000/7)
                - (31536000/13)
                + (31536000/45))*2));
		System.out.println("##############################");
		System.out.println("Year 3 projection: ");
		System.out.println(312032486 + (((31536000/7)
                - (31536000/13)
                + (31536000/45))*3));
		System.out.println("##############################");
		System.out.println("Year 4 projection: ");
		System.out.println(312032486 + (((31536000/7)
                - (31536000/13)
                + (31536000/45))*4));
		System.out.println("##############################");
		System.out.println("Year 5 projection: ");
		System.out.println(312032486 + (((31536000/7)
                - (31536000/13)
                + (31536000/45))*5));
		System.out.println("##############################");

	}

}
