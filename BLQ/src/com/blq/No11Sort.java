package com.blq;

import java.util.Scanner;

public class No11Sort {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan banyak angka : ");
        int arrayLength = inputan.nextInt();
        System.out.println();
        int[] arrayInt = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++){
            Scanner inputanper = new Scanner(System.in);
            System.out.print("Masukkan angka ke-"+ (i+1) + " : ");
            arrayInt[i] = inputan.nextInt();
        }
        System.out.println();

        int temp = 0;
        Boolean flag = false;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = i; j < arrayInt.length; j++) {
                if(arrayInt[i] > arrayInt[j]){
                    temp = arrayInt[i];
                    arrayInt[i] = arrayInt[j];
                    arrayInt[j] = temp;
                }
            }
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
    }
}
