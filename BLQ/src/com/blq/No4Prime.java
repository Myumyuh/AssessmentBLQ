package com.blq;

import java.util.Scanner;

public class No4Prime {
    public static void main(String[] args) {
        Boolean flag = true;
        int tempNum = 1;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Enter Max Number : ");
        int primeLength = inputan.nextInt();
        System.out.println();
        for (int i = 2; i <= primeLength; i++){
            flag = true;
            tempNum = i;
            for (int j = 2; j <= i; j++){
                if (j != i) {
                    if (i % j == 0){
                        flag = false;
                    }
                }
            }
//            System.out.print(tempNum + " ");
            if (flag == true){
                System.out.print(tempNum + " ");
            }
        }
    }
}
