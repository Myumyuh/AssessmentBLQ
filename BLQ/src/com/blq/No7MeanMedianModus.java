package com.blq;

import java.util.Arrays;
import java.util.Scanner;

public class No7MeanMedianModus {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan banyak angka : ");
        int arrayLength = inputan.nextInt();
        System.out.println();
        int[] arrayInt = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            Scanner inputanper = new Scanner(System.in);
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            arrayInt[i] = inputan.nextInt();
            System.out.println();
        }
        System.out.println();

        //Mean
        float mean = 0;
        for (int i = 0; i < arrayLength; i++){
            mean = mean + arrayInt[i];
        }
        System.out.println("Mean : "+ mean/arrayInt.length);

        //Median
        Arrays.sort(arrayInt);
        if ( arrayInt.length % 2 == 1){
            System.out.println("Median : "+ arrayInt[(arrayInt.length / 2)]);
        } else {
            System.out.println("Median : "+ arrayInt[arrayInt.length / 2 -1] + " & " + arrayInt[arrayInt.length / 2]);
        }

        //Modus
        int highestCount = 0;
        int tempCount = 0;
        for (int i = 0; i < arrayInt.length; i++){
            for (int j = 0; j < arrayInt.length; j++){
                if (arrayInt[j] == arrayInt[i]){
                    tempCount++;
                }
            }
            if (tempCount>highestCount){
                highestCount = arrayInt[i];
            }
            tempCount = 0;
        }
        System.out.println("Modus : " + highestCount);
    }
}
