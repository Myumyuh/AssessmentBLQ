package com.blq;

public class No21Lilin {
    public static void main(String[] args) {
        System.out.println("Kecepatan leleh Lilin per detik");
        System.out.println("1 1 2 3 5 8 13");
        System.out.println();
        System.out.println("Panjang Lilin");
        System.out.println("3 3 9 6 7 8 23");
        System.out.println();

        float[] kecepatanLilin = {1,1,2,3,5,8,13};
        float[] panjangLilin = {3,3,9,6,7,8,23};

        float[] waktuLeleh = new float[7];

        System.out.println("Jumlah waktu meleleh");
        for (int i = 0; i < waktuLeleh.length; i++) {
            waktuLeleh[i] = panjangLilin[i] / kecepatanLilin[i];
            System.out.print(waktuLeleh[i] +" ");
        }

        float minLilin = waktuLeleh[0];
        int pointer = 0;
        for (int i = 0; i < waktuLeleh.length; i++) {
            if (minLilin > waktuLeleh[i]){
                minLilin = waktuLeleh[i];
                pointer = i;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Maka lilin tercepat adalah lilin ke-"+ pointer + " dengan waktu "+ minLilin + " detik");
    }
}
