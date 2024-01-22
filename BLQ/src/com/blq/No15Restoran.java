package com.blq;

import java.util.Scanner;

public class No15Restoran {
    public static void main(String[] args) {
        float Abed = 0;
        float Brian = 0;
        float Chel = 0;
        float Raka = 0;
        Boolean flag = false;

        while (flag == false){
            System.out.println("Menu");
            System.out.println("1. Tuna Sandwich        42k");
            System.out.println("2. Spaghetti Carbonara  50k");
            System.out.println("3. Tea Pitcher          30k");
            System.out.println("4. Pizza                70k");
            System.out.println("5. Salad                30k");
            System.out.println("6. Done                    ");

            Scanner inputan = new Scanner(System.in);
            System.out.print("No Menu : ");
            int inputint = inputan.nextInt();
            switch (inputint){
                case 1:
                    Abed = Abed + 14000;
                    Brian = Brian + 14000;
                    Chel = Chel + 14000;
                    break;
                case 2:
                    Abed = Abed + 12500;
                    Brian = Brian + 12500;
                    Chel = Chel + 12500;
                    Raka = Raka + 12500;
                    break;
                case 3:
                    Abed = Abed + 7500;
                    Brian = Brian + 7500;
                    Chel = Chel + 7500;
                    Raka = Raka + 7500;
                    break;
                case 4:
                    Abed = Abed + 17500;
                    Brian = Brian + 17500;
                    Chel = Chel + 17500;
                    Raka = Raka + 17500;
                    break;
                case 5:
                    Abed = Abed + 7500;
                    Brian = Brian + 7500;
                    Chel = Chel + 7500;
                    Raka = Raka + 7500;
                    break;
                case 6:
                    flag = true;
                    break;
            }
        }
        System.out.println("Mereka membayar :");
        System.out.println("Abed  : "+Abed);
        System.out.println("Brian : "+Brian);
        System.out.println("Chel  : "+Chel);
        System.out.println("Raka  : "+Raka);
    }
}
