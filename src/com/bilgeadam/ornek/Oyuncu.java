package com.bilgeadam.ornek;

public class Oyuncu {

    private int no;
    private String ad;
    private String soyad;

    // statik tanımlanırsa class variable'dır.
    // bir obje değeri değiştirirse, diğer objelerde değişen değeri alır.

    // statik tanımlanmazsa instance variable'dır.
    // her obje değişkenlerin ilk değeriyle başlar.
    // örnek, int ise her obje için bağımsız olarak sıfır değeriyle başlar.
    // bir objenin değişkende yaptığı değişliği diğerleri görmez.

    private static int sayac;

    public Oyuncu() {
        sayac = sayac + 1;
        // sayac += 1; (kısa tanımlanmış hali)
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }
}