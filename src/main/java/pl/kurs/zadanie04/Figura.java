package pl.kurs.zadanie04;

public abstract class Figura {
    private static int counter = 0; // pola statyczne na samej gorze + static dotyczy klasy, a nie obiektu
    private int numerFigury;

    public int getNumerFigury() {
        return numerFigury;
    }
    private void setNumerFigury(int numerFigury) {
        this.numerFigury = numerFigury;
    }

    public static Kwadrat stworzKwadrat(int dlugoscBoku) {
        Kwadrat kwadrat = new Kwadrat(dlugoscBoku);
        ((Figura) kwadrat).setNumerFigury(++counter);
        return kwadrat;
    }
    public static Kolo stworzKolo(int srednica) {

        return new Kolo(srednica);
    }
    public static Prostokat stworzProstokat(int dlugoscBokuA, int dlugoscBokuB) {

        return new Prostokat(dlugoscBokuA,dlugoscBokuB);
    }

    @Override
    public String toString() {
        return "Figura nr " + numerFigury + ": ";
    }
}
