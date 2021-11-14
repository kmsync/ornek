package com.bilgeadam.ornek;

public class StatikDeneme {

    int sayi1; // Instance Veriable
    static int sayi2;  // Class Veriable (Statik Olduğu için)

    public static void main(String[] args) {

        // Statik olmayan değişkene, statik metoddan erişilemez.
        // Erişmek istiyorsak, class'ın kendi objesini oluşturarak erişebiliriz.

        // Local Variable tanımlanırsa onu biz initialize etmek zorundayız.
        // Yani ilk değeri biz vermek zorundayız.

        int sayi3 = 0;

        StatikDeneme sd = new StatikDeneme();

        System.out.println("Sayı1: " + sd.sayi1);
        System.out.println("Sayı2: " + sayi2);
        System.out.println("Sayı3: " + sayi3);

    }
}
