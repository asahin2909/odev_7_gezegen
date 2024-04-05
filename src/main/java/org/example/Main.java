package org.example;

public class Main {
    public static void main(String[] args) {
        for (Gezegen gezegen : Gezegen.values()) {
            System.out.println(gezegen.getSiralama() + ". " + gezegen.getIsim() + ": Uzaklık=" + gezegen.getUzaklik() + " milyon km, Yarıçap=" + gezegen.getYaricap() + " km, Dönme Süresi=" + gezegen.getDonmeSuresi() + " gün");
        }
    }
}
