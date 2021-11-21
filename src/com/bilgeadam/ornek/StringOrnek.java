package com.bilgeadam.ornek;

public class StringOrnek {

    public static void main(String[] args) {

        // IndexOf
        String kelime1 = "Trabzon";

        System.out.println(kelime1.indexOf("z") + 1);

        String kelime2 = "Trabzon Lisesi";

        System.out.println(kelime2.indexOf(" ") + 1);

        // Substring
        String kelime3 = "Trabzon";

        System.out.println(kelime3.substring(3));

        System.out.println(kelime3.substring(2, 4));

        String kelime4 = "Trabzon";


        // Length
        System.out.println(kelime4.length() + 1);

        String kelime5 = "          Trabzon          ";

        System.out.println(kelime5.length() + 1);

        // Trim, başındaki ve sonundaki boşlukları atar.
        System.out.println(kelime5.trim().length() + 1);

    }
}
