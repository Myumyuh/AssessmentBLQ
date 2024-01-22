package com.blq;

import java.util.Scanner;

public class No6Palindrome {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Enter Word : ");
        String tempWord = inputan.nextLine();
        System.out.println();
        char[] tempChars = tempWord.toCharArray();
        Boolean flag = true;
        int j = 0;

        for (int i = 0; i < tempChars.length; i++){
            j = tempChars.length - 1 - i;
            if (tempChars[i] != tempChars[j]){
                flag = false;
            }
        }
        if (flag == true){
            System.out.println("Kata tersebut adalah Kata Palindrome");
        } else {
            System.out.println("Kata tersebut bukanlah Kata Palindrome");
        }
    }
}
