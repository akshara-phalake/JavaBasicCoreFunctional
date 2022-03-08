package com.examples.basiccore;
import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = input.nextInt();
        System.out.println("Enter the second number:");
        b = input.nextInt();
        System.out.println("Enter the third number:");
        c = input.nextInt();
        if(a>=b && a>=c)
            System.out.println(a+" is the largest Number");
        else if (b>=a && b>=c)
            System.out.println(b+" is the largest Number");
        else
            System.out.println(c+" is the largest number");
    }
}
