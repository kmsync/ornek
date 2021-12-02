package com.bilgeadam.ornek;

import java.util.Scanner;

public class ReadFromConsole {

    public static void main(String[] args) {

        // Scanner objesiyle konsoldan veri okuyabiliyoruz.
        Scanner sc = new Scanner(System.in);

        System.out.print("İsminizi Giriniz: ");

        String isim = sc.nextLine();

        System.out.print("Yaşınızı Giriniz: ");

        int yas = sc.nextInt();
        //int yas = (int)Double.parseDouble(sc.nextLine());



        if (yas <= 35){
            System.out.println(yas + " yaşında yolun 1. yarısındasın " + isim);
        }
        else
        {
            System.out.println(yas + " yaşında yolun 2. yarısındasın " + isim);
        }
    }
}
