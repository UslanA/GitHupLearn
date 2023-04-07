package Paket01;

import java.util.Arrays;

public class A02_Question {
    public static void main(String[] args) {
        /*
        Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        output: [10, 3, 12, 10, 9]

         */

        int[][] inputarr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        int [] outputarr = new int[0];

        for (int i = 0; i < inputarr.length; i++) {
            int toplam = 0;
            for (int j = 0; j < inputarr[i].length; j++) {
                toplam += inputarr[i][j];
            }
            outputarr = yeniSayiEkle(outputarr, toplam);
        }
        System.out.println(Arrays.toString(outputarr));

    }
    public static int[] yeniSayiEkle(int[] dizi, int sayi) {

        int[] newdizi = new int[dizi.length + 1];

        for (int i = 0; i < dizi.length; i++) {

            newdizi[i] = dizi[i];
        }
        newdizi[newdizi.length - 1] = sayi;

        return newdizi;
    }
}
