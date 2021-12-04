package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsoleLast {

    // Class değişkeni olduğu için ilk değer vermemize gerek yok.
    // Method değişkeni olsaydı yas için = 0 isim için = "" olarak ilk değerini vermemiz gerekirdi.
    static String isim;
    static int yas;

    Scanner sc = new Scanner(System.in);

    public String isimSor() {
        String ad = "";
        System.out.print("İsminizi Giriniz: ");
        ad = sc.nextLine();

        return ad;
    }

    public int yasSor() {
        try {
            int localYas = 0;

            // Kullanıcıdan sayısal veri isterken nextLine kullanıp,
            // daha sonra Integer.parseInt ile int'e çevirmek hata alma olasılığımızı azaltır.
            System.out.print("Yaşınızı Giriniz: ");
            localYas = Integer.parseInt(sc.nextLine());

            return localYas;
        } catch (NumberFormatException e) {
            System.err.println("HATA: Yaş alanına sayı girmek zorundasınız!");
            System.out.println();
            return -99;
        }

    }

    public void sonucYazdir() {
        if (yas <= 35)
            System.out.println("Yolun 1. yarısındasın " + isim);

        else

            System.out.println("Yolun 2. yarısındasın " + isim);
    }

    public static void main(String[] args) {

        ReadFromConsoleLast son = new ReadFromConsoleLast();

        isim = son.isimSor();
        yas = son.yasSor();

        while (yas < 0) {
            yas = son.yasSor();
        }

        son.sonucYazdir();

    }
}
