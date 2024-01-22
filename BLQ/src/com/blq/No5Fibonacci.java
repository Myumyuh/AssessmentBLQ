package com.blq;

import java.util.Scanner;

public class No5Fibonacci {
    public static void main(String[] args) {

        int fib0 = 0;
        int fib1 = 1;
        int tempNum = 0;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Enter Max Number : ");
        int fibLength = inputan.nextInt();
        System.out.print("0 1 ");
        for (int i = 2; i < fibLength; i++){
            tempNum = fib1;
            fib1 = fib0 + fib1;
            fib0 = tempNum;
            System.out.print(fib1 + " ");
        }
    }
}
