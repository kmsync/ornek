package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsoleLast {

    // Class değişkeni olduğu için ilk değer vermemize gerek yok.
    // Method değişkeni olsaydı yas için = 0 isim için = "" olarak ilk değerini vermemiz gerekirdi.
    String isim;
    int yas;

    Scanner sc = new Scanner(System.in);

    public String isimSor()
    {
        String ad = "";
        System.out.println("İsminizi Giriniz:");
        ad = sc.nextLine();

        return  ad;
    }

    public int yasSor()
    {
        int localYas = 0;
        System.out.println("Yaşınızı Giriniz:");
        localYas = sc.nextInt();

        return localYas;
    }

    public void sonucYazdir()
    {
        if (yas <= 35)
            System.out.println("Yolun 1. yarısındasın " + isim);

        else

        System.out.println("Yolun 2. yarısındasın " + isim);
    }

    public static void main(String[] args) {

        ReadFromConsoleLast son = new ReadFromConsoleLast();

        son.isimSor();
        son.yasSor();
        son.sonucYazdir();

//        int yas = 0;
//
//        // Scanner objesiyle konsoldan veri okuyabiliyoruz.
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("İsminizi Giriniz: ");
//
//        String isim = sc.nextLine();
//
//        System.out.print("Yaşınızı Giriniz: ");
//
//        try {
//            yas = sc.nextInt();
//        } catch (InputMismatchException e) {
//            System.err.println("HATA!! Yaş alanına tam sayı girmek zorundasınız!");
//            System.exit(-1);
//        }
//
//        //int yas = (int)Double.parseDouble(sc.nextLine());
//
//
//        if (yas <= 35) {
//            System.out.println(yas + " yaşında yolun 1. yarısındasın " + isim);
//        } else {
//            System.out.println(yas + " yaşında yolun 2. yarısındasın " + isim);
//        }

    }
}
