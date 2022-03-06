package com.examples.javabasicfunctional;
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Dividend : ");
        int dividend=input.nextInt();
        System.out.println("Divisor : ");
        int divisor=input.nextInt();
        if(divisor != 0){
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;
            System.out.println("The Quotient is " +quotient +" and the Remainder is "+ remainder);
        }
        else
            System.out.println("Cannot be divided by 0");
    }
}
