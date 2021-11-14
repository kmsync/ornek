package com.bilgeadam.ornek;

public class Kisi {

    private int no;
    private String ad;
    private String soyad;
    private double maas;

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

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    // constructer overloading
    // obje oluşrururken hangi constructer uyuyorsa, onu çalıştırıyor
    public Kisi() {
    }

    public Kisi(int no, String ad, String soyad, double maas) {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }

    public double yillikMaasGetir() {

        double yillikMaas = this.maas * 12;

        return yillikMaas;
    }

    public String adSoyadGetir() {
        return this.ad + " " + this.soyad;
    }

    @Override
    public String toString() {
        return
                "No: " + no + "\n" +
                        "Ad: " + ad + "\n" +
                        "Soyad: " + soyad + "\n" +
                        "Maas: " + maas + "\n" +
                        "Yıllık Maaş: " + yillikMaasGetir() + "\n" +
                        "Ad Soyad: " + adSoyadGetir() + "\n";
    }

    //    public double yillik (int maas, int yil) {
    //
    //        return maas * yil;
    //    }

    //    public static void main(String[] args) {
    //
    //    Kisi k = new Kisi();
    //
    //
    // }
}
