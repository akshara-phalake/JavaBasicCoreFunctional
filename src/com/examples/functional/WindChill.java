package com.examples.functional;

import java.util.Scanner;
public class WindChill {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit :");
        double temp = scan.nextDouble();
        System.out.println("Enter the wind speed in miles per hour: ");
        double speed = scan.nextDouble();
        if(temp < 50 && speed < 120 && speed > 3) {
            double windChill = 35.74 + 0.62158 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
            System.out.println("The windchill is :"+ windChill);
        }
        else
            System.out.println("Invalid input");
    }
}