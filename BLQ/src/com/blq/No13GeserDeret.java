package com.blq;

import java.util.Scanner;

public class No13GeserDeret {
    public static void main(String[] args) {
        System.out.println("Deret : 3 9 0 7 1 2 4");

        Scanner inputan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int inputanangka = inputan.nextInt();
        System.out.println();

        int[] intArray = {3, 9, 0, 7, 1, 2, 4};
        int[] tempArray = new int[inputanangka];
        for (int i = 0; i < inputanangka; i++) {
            tempArray[i] = intArray[i];
        }
        for (int i = 0; i < intArray.length-inputanangka; i++) {
            intArray[i]=intArray[i+inputanangka];
        }

        for (int i = 0; i < inputanangka; i++) {
            intArray[i+inputanangka+1]=tempArray[i];
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
