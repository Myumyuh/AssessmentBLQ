package com.blq;

import java.util.Scanner;

public class No14FormatJam {
    public static void main(String[] args) {
        Boolean flag = false;
        int jam = 0;
        int menit = 0;
        int detik = 0;
        String ampm = "am";
        while (flag == false){
            Scanner Jam = new Scanner(System.in);
            System.out.print("Jam : ");
            jam = Jam.nextInt();

            Scanner Menit = new Scanner(System.in);
            System.out.print("Menit : ");
            menit = Menit.nextInt();

            Scanner Detik = new Scanner(System.in);
            System.out.print("Detik : ");
            detik = Detik.nextInt();

            Scanner AMPM = new Scanner(System.in);
            System.out.print("AM atau PM : ");
            ampm = AMPM.nextLine();
            ampm = ampm.toLowerCase();

            if (jam <= 12 && menit <60 && detik <60 && (ampm.equals("am")||ampm.equals("pm")) ){
                flag = true;
            }
        }
        System.out.println();
        if (ampm.equals("pm")){
            jam = jam + 12;
        }

        System.out.println(jam+":"+menit+":"+detik);


    }
}
