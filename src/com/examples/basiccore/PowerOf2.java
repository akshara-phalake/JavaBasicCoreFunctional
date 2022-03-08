package com.examples.basiccore;
import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value of n (less than 31) ");
        int power = in.nextInt();
        if ((power >= 0) && (power < 31)) {
            for (int i = 0; i <= power; i++) {
                int value = (int) Math.pow(2,i);
                System.out.println("2 ^ "+ i +" = " +value);
            }
        }
		else {
            System.out.println("Invalid input.");
        }
    }
}
