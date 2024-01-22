package com.blq;

import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Enter Word : ");
        String tempWord = inputan.nextLine();
        System.out.println();
        char[] tempChars = tempWord.toCharArray();

        int temp = tempChars.length/2;

        for (int i = tempChars.length-1; i >= 0; i--) {
            for (int j = 0; j < tempChars.length; j++) {
                if (j != temp){
                    System.out.print("*");
                } else {
                    System.out.print(tempChars[i]);
                }
            }
            System.out.println();
        }
    }
}
