package org.example;

public enum Gezegen {
    MERKUR("Merkur", 1, 57.9, 2439.7, 58.6),
    VENUS("Venus", 2, 108.2, 6051.8, 243.0),
    DUNYA("Dünya", 3, 149.6, 6371.0, 1.0),
    MARS("Mars", 4, 227.9, 3389.5, 1.0),
    JUPITER("Jüpiter", 5, 778.6, 69911, 0.41),
    SATURN("Satürn", 6, 1433.5, 58232, 0.45),
    URANUS("Uranüs", 7, 2872.5, 25362, 0.72),
    NEPTUN("Neptün", 8, 4495.1, 24622, 0.67);

    private String isim;
    private int siralama;
    private double uzaklik; // Birim: milyon kilometre
    private double yaricap; // Birim: kilometre
    private double donmeSuresi; // Birim: gün

    Gezegen(String isim, int siralama, double uzaklik, double yaricap, double donmeSuresi) {
        this.isim = isim;
        this.siralama = siralama;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public String getIsim() {
        return isim;
    }

    public int getSiralama() {
        return siralama;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }
}
