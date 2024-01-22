package com.blq;

public class No16Hattori {
    public static void main(String[] args) {
        System.out.println("Hattori menempuh : N N T N N N T T T T T N T T T N T N");

        char[] hattoriNaikTurun = {'N', 'N', 'T', 'N', 'N', 'N', 'T', 'T', 'T', 'T', 'T', 'N', 'T', 'T', 'T', 'N', 'T','N'};

        int terrainLevel = 0;
        int Gunung = 0;
        int Lembah = 0;
        int temp=0;
        for (int i = 0; i < hattoriNaikTurun.length ; i++) {
            temp = terrainLevel;
            if (hattoriNaikTurun[i] == 'N'){
                terrainLevel++;
            } else if (hattoriNaikTurun[i] == 'T'){
                terrainLevel--;
            }
            if (temp > 0){
                Gunung++;
            } else if (temp < 0){
                Lembah++;
            }
        }

        System.out.println("Hattori telah melewati "+ Gunung+" Gunung dan "+ Lembah +" Lembah");
    }
}
