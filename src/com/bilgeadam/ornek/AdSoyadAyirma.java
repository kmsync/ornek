package com.bilgeadam.ornek;

public class AdSoyadAyirma {

    public static void main(String[] args) {

        String isim = "Aziz Sancar";

        int boslukIndex = isim.indexOf(" ");

        String ad = isim.substring(0, boslukIndex);

        System.out.println("Ad: " + ad + " Uzunluk: " + ad.length());

        String soyad = isim.substring(boslukIndex + 1);

        System.out.println("Soyad: " + soyad + " Uzunluk: " + soyad.length());

    }
}
