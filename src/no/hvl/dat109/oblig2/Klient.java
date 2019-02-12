package no.hvl.dat109.oblig2;

import java.util.Scanner;

public class Klient {

    static Scanner scan =  new Scanner(System.in);
    public static void main(String[] args) {
        TerningSpel ts = new TerningSpel();
        System.out.println("Skriv inn namet på spelar nr 1: ");
        ts.leggTilSpelar(scan.nextLine());
        System.out.println("Skriv inn namnet på spelar nr 2: ");
        ts.leggTilSpelar(scan.nextLine());
        ts.spel();
    }
}
