package com.examples.basiccore;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the letter : ");
        char input = in.next().charAt(0);
        switch (input) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(input + " is vowel");
                break;
            default:
                System.out.println(input + " is consonant");
        }

    }
}
