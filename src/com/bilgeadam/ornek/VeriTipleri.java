package com.bilgeadam.ornek;

public class VeriTipleri {

    public static void main(String[] args) {

        int yas = 30;
        String sehir = "Ankara";

        char cinsiyet = 'E';

        if (yas<35) {
            System.out.println("Genç");
        }
        else {
            System.out.println("Yaşlı");
        }

        // i++ ==> i = i+1
        for (int i=1; i<=10; i++) {
            System.out.println(i+"-Merhaba");
        }

       // for (int h>0; h++);
        if(sehir.indexOf("a") >= 0)
        {
            System.out.println("tane içinde aranan harf VAR!");
        }
        else {
            System.out.println("İçinde aranan harf YOK!");
        }

        String deneme = "Bora Yüret";

        System.out.println(deneme.substring(0,6));
    }
}