package pl.kurs.zadanie04;

public class Kolo extends Figura {

    private int promien;

    public Kolo(int srednica) {
        this.promien = srednica / 2;
    }
    @Override
    public String toString() {
        return "Figura nr " + Figura.getNumerFigury() + ": Kolo o promieniu " + promien + ".";
    }
//    @Override
//    public String toString() {
//        return "Figura nr 0: Kolo o promieniu " + promien + ".";
//    }
}
