package com.examples.javabasicfunctional;
import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
        int year = 0;
        System.out.println("Enter the year (should be a 4 - digit number) :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if((year > 1000) && (year < 9999)) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                System.out.println("Year " +year +" is a leap year");
            else
                System.out.println("Year " +year +" is not a leap year");
        }
        else{
            System.out.println("Invalid input. Enter a 4 digit number");
        }
    }
}
