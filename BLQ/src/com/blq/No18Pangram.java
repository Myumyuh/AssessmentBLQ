package com.blq;

import java.util.Scanner;

public class No18Pangram {
    public static void main(String[] args) {
        char[] abjad = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        Scanner inputan = new Scanner(System.in);
        System.out.print("Kalimat : ");
        String inputString = inputan.nextLine();
        inputString = inputString.toLowerCase();
        char[] charArray = inputString.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length ; i++) {
            for (int j = 0; j < abjad.length; j++) {
                if (charArray[i] == abjad[j]){
                    abjad[j] = Character.MIN_VALUE;
                    count++;
                }
            }
        }
        if (count == 26){
            System.out.println("Kalimat tersebut adalah kalimat Pangram");
        } else {
            System.out.println("Kalimat tersebut bukanlah kalimat Pangram");
        }
    }
}
