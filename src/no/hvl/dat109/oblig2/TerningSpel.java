package no.hvl.dat109.oblig2;

import java.util.ArrayList;
import java.util.Comparator;

public class TerningSpel {

    private int id;

    private ArrayList<Spelar> spelarar;
    private Kopp kopp;

    public TerningSpel() {
        id = 0;
        spelarar = new ArrayList<>();
    }

    public void leggTilSpelar(String namn) {
        Spelar spelar = new Spelar(namn);
        spelarar.add(spelar);
        kopp = new Kopp();
    }

    public void spel() {
        for(int i = 0; i < spelarar.size(); i++) {
            spelarar.get(i).spelar(kopp);
            System.out.println(spelarar.get(i).toString());
        }
            finnVinnar();
    }

    public void finnVinnar() {
        Spelar vinnar = spelarar.stream().max(Comparator.comparing(Spelar::getVerdi)).orElse(null);
        System.out.println("--------------------");
        System.out.println("Vinnaren er " + vinnar.toString() );
        System.out.println();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
