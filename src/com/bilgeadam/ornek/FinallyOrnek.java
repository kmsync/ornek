package com.bilgeadam.ornek;

public class FinallyOrnek {

    public static void main(String[] args) {

        try {
            int sayi = 7;
            int sayi2 =2;

            System.out.println(sayi/sayi2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        // Program hata verse de vermese de finally kodu her zaman çalışır.
        finally {
            System.out.println("Bu program bitti!");
        }
    }
}
