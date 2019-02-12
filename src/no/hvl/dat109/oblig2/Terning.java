package no.hvl.dat109.oblig2;

import java.util.Random;

public class Terning {


    private int id;
    private int verdi;

    Random rand = new Random();

    public Terning() {
        id = 0;
        verdi = 0;
        trill();
    }

    public void trill() {
        verdi = rand.nextInt(6) + 1;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVerdi() {
        return verdi;
    }

    public void setVerdi(int verdi) {
        this.verdi = verdi;
    }
}
