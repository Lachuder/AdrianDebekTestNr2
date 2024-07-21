package pl.kurs.zadanie04;

public abstract class Figura {

    private static int numerFigury;
    private static int counter = 1;
    public static int getNumerFigury() {
        return numerFigury;
    }

    public static Kwadrat stworzKwadrat(int dlugoscBoku) {
        count(counter);
        return new Kwadrat(dlugoscBoku);
    }
    public static Kolo stworzKolo(int srednica) {
        count(counter);
        return new Kolo(srednica);
    }
    public static Prostokat stworzProstokat(int dlugoscBokuA, int dlugoscBokuB) {
        count(counter);
        return new Prostokat(dlugoscBokuA,dlugoscBokuB);
    }
    private static int count(int input){

        return numerFigury += input;
    }
    @Override
    public String toString() {
        return "Figura nr " + numerFigury + ": ";
    }
}
