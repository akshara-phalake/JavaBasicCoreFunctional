package com.examples.basiccore;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        System.out.println("Harmonic Series is ");
        if (n>0) {
            for (double i = 1; i <= n; i++) {
                sum += 1 / i;
                System.out.print("1/"+i +"+");
            }
            System.out.println("\n The harmonic sum is " + sum);
        }
        else{
            System.out.println("n cannot be zero");
        }
    }
}