package com.bilgeadam.ornek;

public class HataYakalama {

    public static void main(String[] args) {

        try {

            int sayi1 = 7;
            int sayi2 = 0;

            double sonuc = sayi1 / sayi2;

            System.out.println("Sonuç: " + sonuc);

        }
        catch (Exception e)
        {
            System.out.println("Hata Oluştu!");
            System.err.println("Hata Oluştu!");
        }
    }


}
