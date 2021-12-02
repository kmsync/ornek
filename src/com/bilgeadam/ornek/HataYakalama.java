package com.bilgeadam.ornek;

public class HataYakalama {

    public static void main(String[] args) {

        try {
            int sayi1 = 7;
            int sayi2 = 0;

            double sonuc = sayi1 / sayi2;

            System.out.println("Sonuç: " + sonuc);
        } catch (ArithmeticException ae) {
            System.err.println("HATA! Sıfıra bölme hatası! ");
        } catch (Exception e) {
            // serr kısayolu ile System.err.println kullanarak yazdırıyoruz.
            // Çünkü çıktı rengi hataya uygun olarak kırmızı olarak veriliyor.
            System.err.println("Hata Oluştu!" + " " + e.getMessage());
            System.out.println("*****************************");

            // Bu kodu verilen hatanın türünü görmek için kullanabiliriz.
            e.printStackTrace();
        }

    }

}
