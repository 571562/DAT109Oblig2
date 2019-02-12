package no.hvl.dat109.oblig2;

import java.util.ArrayList;

public class Kopp {

    private int id;
    private int sum;
    private final int ANTAL_TERNINGAR = 2;

    private ArrayList<Terning> terninger;

    public Kopp() {
        id = 0;
        sum = 0;
        terninger = new ArrayList<>();

        for(int i = 0; i < ANTAL_TERNINGAR; i++) {
            terninger.add(new Terning());
        }
    }

    public void trill() {
        sum = 0;
        for(int i = 0; i < ANTAL_TERNINGAR; i++) {
            terninger.get(i).trill();
            sum += terninger.get(i).getVerdi();
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
