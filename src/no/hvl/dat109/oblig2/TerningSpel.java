package no.hvl.dat109.oblig2;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public void spel(List<Spelar> spelarar) {
        for(int i = 0; i < spelarar.size(); i++) {
            spelarar.get(i).spelar(kopp);
            System.out.println(spelarar.get(i).toString());
        }
            System.out.println();
    }

    public void spel() {
        spel(spelarar);
        Spelar vinner = finnVinnar();
        System.out.println("--------------------");
        System.out.println("Vinnaren er " + vinner.toString());

    }


    public Spelar finnVinnar() {
        Spelar vinnar = spelarar.stream().max(Comparator.comparing(Spelar::getVerdi)).orElse(null);
        if(vinnar != null) {
            List<Spelar> vinnarar = spelarar.stream().filter(x -> x.getVerdi() == vinnar.getVerdi()).collect(Collectors.toList());
            while(vinnarar.size() > 1) {
                spel(vinnarar);
                Spelar nyvinnar = spelarar.stream().max(Comparator.comparing(Spelar::getVerdi)).orElse(null);
                vinnarar = spelarar.stream().filter(x -> x.getVerdi() == nyvinnar.getVerdi()).collect(Collectors.toList());

            }
             return vinnarar.get(0);
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
