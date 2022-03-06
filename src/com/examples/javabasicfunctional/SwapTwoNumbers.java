package com.examples.javabasicfunctional;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x,y,t;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number (x) :");
        x = input.nextInt();
        System.out.println("Enter the second number (y):");
        y = input.nextInt();
        t = x;
        x = y;
        y = t;
        System.out.println("The numbers after swapping are x : " + x + " and y : " + y);
    }
}
