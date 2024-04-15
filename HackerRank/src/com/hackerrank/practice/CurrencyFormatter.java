package com.hackerrank.practice;

import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        double us = payment;
        double india = payment;
        double china = payment;
        double france = payment;
        // Write your code here.
        char chin = '\uFFE5';
        char fran = '\u20AC';
        
        System.out.printf("US: $%.2f", us);
        System.out.println();
        System.out.printf("India: Rs.%.2f" , india);
        System.out.println();
        System.out.printf("China: %c%.2f" ,chin ,china);
        System.out.println();
        System.out.printf("France: %.2f %c" ,france ,fran);
     
        
    }
}
