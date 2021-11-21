package com.bilgeadam.ornek;

public class AritmatikOrnek {

    public static void main(String[] args) {

        // Toplama "+"
        // Çıkarma "-"
        // Çarpma "*"
        // Bölme "/"
        // Mod "%"
        // Arttırma "++"
        // Eksiltme "--"

        int sayi1 = 7;
        int sayi2 = 2;

        double sonuc = sayi1/(double)sayi2;

        System.out.println(sonuc);

        System.out.println("***************************");

        // Modulus --> %

        System.out.println(5%2);

        int sayi3 = 21;

        if ((sayi3%2) == 1)
            System.out.println("Tek Sayı");
        else
            System.out.println("Çift Sayı");

        System.out.println("***************************");

        // ++ Operatörü

        // Post Increment
        int sayi4 = 9;

        System.out.println("Sayı4: " + sayi4++);

        System.out.println("Sayı4: " + sayi4);

        // Pre Increment
        int sayi5 = 19;

        System.out.println("Sayı5: " + ++sayi5);

        System.out.println("Sayı5: " + sayi5);



    }

}
