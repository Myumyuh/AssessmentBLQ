package com.blq;

import java.util.Scanner;

public class No9Multiply {
    public static void main(String[] args) {

        Scanner inputan = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int inputanangka = inputan.nextInt();
        System.out.println();

        int tempNumb = inputanangka;
        for (int i = 0; i < tempNumb; i++){
            System.out.print(inputanangka + " ");
            inputanangka = inputanangka + tempNumb;
        }

    }
}
