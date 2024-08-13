package pl.kurs.zadanie04;

public class Runner {
    public static void main(String[] args) {



        Kwadrat k1 = Figura.stworzKwadrat(10);
        Kwadrat k2 = Figura.stworzKwadrat(15);
        Kwadrat k3 = Figura.stworzKwadrat(30);

        Kwadrat k4 = new Kwadrat(40);
        Kwadrat k5 = new Kwadrat(50);


        System.out.println("k1 = " + k1);
        System.out.println("k2 = " + k2);
        System.out.println("k3 = " + k3);
        System.out.println("k4 = " + k4);
        System.out.println("k5 = " + k5);

        Kwadrat k6 = Figura.stworzKwadrat(60);
        System.out.println("k6 = " + k6);

       // k6.setNumerFigury(666);
    }
}
