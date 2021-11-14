package com.bilgeadam.ornek;

public class HesapMakinesi {

    // Parantez içerisine yaılanlar parametrelerdir.
    public int topla(int sayi1, int sayi2) {

        return sayi1 + sayi2;
    }

    public int carp(int sayi1, int sayi2) {

        return sayi1 * sayi2;
    }

    // parametreleri int yerine double şeklinde de yazabiliriz.
    public double bol(int sayi1, int sayi2) {

        return sayi1 / (double) sayi2;
    }

    public int cikar(int sayi1, int sayi2) {

        return sayi2 - sayi1;
    }

    public static void main(String[] args) {

        HesapMakinesi hm = new HesapMakinesi();

        System.out.println(hm.topla(7, 9));
        System.out.println(hm.cikar(7, 9));
        System.out.println(hm.carp(7, 9));
        System.out.println(hm.bol(7, 9));

    }

}
