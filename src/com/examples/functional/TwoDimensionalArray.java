package com.examples.functional;
import java.util.Scanner;
import java.util.Random;

public class TwoDimensionalArray {
    void setArray(int[][] array) {
        Random randomInt=new Random();
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                array[i][j]=randomInt.nextInt(100);
            }
        }
    }

    void getArray(int[][] array) {
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                System.out.printf("%d ",array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array dimension rows (m)");
        int m=scan.nextInt();
        System.out.println("Enter array dimension columns (n)");
        int n=scan.nextInt();
        int[][] array=new int [m][n];
        TwoDimensionalArray obj=new TwoDimensionalArray();
        obj.setArray(array);
        obj.getArray(array);
    }
}