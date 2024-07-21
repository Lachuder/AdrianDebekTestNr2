package pl.kurs.zadanie04;

public class Prostokat extends Figura {

    private int bokA;
    private int bokB;

    public Prostokat(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public String toString() {
        return "Figura nr " + Figura.getNumerFigury() + ": Prostokat o bokach " + bokA + "x" + bokB + ".";
    }
}
