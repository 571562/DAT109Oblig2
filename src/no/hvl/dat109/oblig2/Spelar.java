package no.hvl.dat109.oblig2;

import java.util.Scanner;

public class Spelar {

    private String namn;
    private int verdi;
    Scanner scan = new Scanner(System.in);

    public Spelar(String namn) {
        this.namn = namn;
        verdi = 0;
    }

    public void spelar(Kopp kopp) {
        kopp.trill();
        verdi = kopp.getSum();
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getVerdi() {
        return verdi;
    }

    public void setVerdi(int verdi) {
        this.verdi = verdi;
    }

    @Override
    public String toString() {
        return  namn + " med " + verdi + " poeng.";
    }
}
