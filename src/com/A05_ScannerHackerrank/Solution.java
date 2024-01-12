package com.A05_ScannerHackerrank;

import java.util.Scanner;

public class Solution {
//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input three numbers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        scan.close();
    }
    
}
