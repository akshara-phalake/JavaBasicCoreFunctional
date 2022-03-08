package com.examples.basiccore;

import java.util.Scanner;

public class PrimeFactorisation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        System.out.println("The prime factors of " +n +" =");
        while (n % 2 == 0) {                                // If n is even, print 2. Divide n by 2
            System.out.print(2 + " ");
            n = n/2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {        //If n is odd, i will take values from 3 till squareroot of n, i=i+2 gives odd numbers only
            while (n % i == 0) {                            //If n is divisible by i
                System.out.print(i + " ");                  //Print i
                n = n/i;                                    //Divide n by i
            }                                               //for loop continues
        }
        if (n > 2)                                          //Now if n is greater than 2, it will be a prime number greater than 2
            System.out.print(n);                            //Print the value of n

    }
}
