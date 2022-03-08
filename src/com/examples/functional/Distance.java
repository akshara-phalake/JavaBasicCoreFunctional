package com.examples.functional;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate :");
        int x = input.nextInt();
        System.out.println("Enter the y co-ordinate :");
        int y = input.nextInt();
        double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
        System.out.println("The distance of point from the origin is : "+ distance);
    }
}


