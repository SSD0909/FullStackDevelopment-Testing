package com.A05_ScannerHackerrank;

public class Hacker3 {
	
    public static String lastLetters(String word) {
        // Write your code here
        String x=word;
        int len=x.length()-1;
        int secondlast=x.length()-2;
        return (x.charAt(len)+" "+x.charAt(secondlast) ) ; 

}
}