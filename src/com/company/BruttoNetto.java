package com.company;

public class BruttoNetto {
    public static void main(String[] args) {
        int nettopreis = 200;
        double steuersatz = 0.05, ergebnis =0;
        ergebnis = nettopreis + nettopreis*steuersatz;

        System.out.println(ergebnis);

    }
}
