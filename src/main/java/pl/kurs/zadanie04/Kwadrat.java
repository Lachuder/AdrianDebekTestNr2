package pl.kurs.zadanie04;

public class Kwadrat extends Figura {

    private int bokA;

    public Kwadrat(int bokA) {
        this.bokA = bokA;
    }

//    @Override
//    public String toString() {
//        return "Figura nr " + Figura.getNumerFigury() + ": Kwadrat o boku " + bokA + ".";
//    }

    @Override
    public String toString() {
        return super.toString() + "Kwadrat o boku " + bokA + ".";
    }
}
