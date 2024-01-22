package com.blq;

import java.util.Random;
import java.util.Scanner;

public class No19JanKenPon {
    public static void main(String[] args) { // Batu Kertas Gunting
        Scanner inputanJarak = new Scanner(System.in);
        System.out.print("Jarak : ");
        int Distance = inputanJarak.nextInt();
        System.out.println();
        System.out.println("Jika menang, maju 2 langkah, jika kalah, mundur 1 langkah, jika jarak sudah 0 maka yang maju paling akhir adalah pemenangnya, 3 kali permainan");

        Boolean flag = false;
        String winlose = "Draw";
        int bkg = 0;
        Random rand = new Random();
        int max = 3, min = 1;
        int count = 0;
        while (flag == false){
            int enemy = rand.nextInt(max - min + 1) + min;
            System.out.println("1. Batu");
            System.out.println("2. Kertas");
            System.out.println("3. Gunting");
            Scanner inputBKG = new Scanner(System.in);
            System.out.print("Memilih : ");
            bkg = inputBKG.nextInt();

            System.out.print("Musuh : "+ enemy);
            if (bkg == 1){
                if (enemy == 2){
                    Distance--;
                    winlose = "Lose";
                }if (enemy == 3){
                    Distance--;
                    winlose = "Win";
                }
            } else if (bkg == 2){
                if (enemy == 1){
                    Distance--;
                    winlose = "Win";
                }if (enemy == 3){
                    Distance--;
                    winlose = "Lose";
                }
            } else if (bkg == 3){
                if (enemy == 1){
                    Distance--;
                    winlose = "Lose";
                }if (enemy == 2){
                    Distance--;
                    winlose = "Win";
                }
            }
            System.out.println();
            System.out.println("Jarak "+Distance);
            if (Distance == 0 || count == 3){
                flag = true;
            } else if (Distance !=0 && count == 3){
                flag = true;
                winlose = "Draw";
            }
            count++;
            System.out.println();
        }

        if (winlose.equals("Draw")){
            System.out.println("It's a Draw!");
        } else {
            System.out.println("You "+ winlose + "!!");
        }


    }
}
