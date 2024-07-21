package pl.kurs.zadanie04;

import java.util.Arrays;
import java.util.List;

public class Runner04 {
    public static void main(String[] args) {


//        a) Napisz kod w taki sposób aby poniższy fragment zadziałał i dał dokładnie taki wynik jak oczekuje:
// List<Figura> figury = Arrays.asList(Figura.stworzKwadrat(10), Figura.stworzKolo(20), Figura.stworzProstokat(10,20));
// for(Figura f : figury {
//   System.out.println(f);
// }
//System.out powinien wypisac:
//Figura nr 1: Kwadrat o boku 10.
//Figura nr 2: Koło o promienu 10.
//Figura nr 3: Prostokat o bokach 10x20.


//        Kwadrat kwadrat1 = new Kwadrat(10); //0
//        Kolo kolo1 = new Kolo(20); //0
//        System.out.println("kwadrat1 = " + kwadrat1);
//        System.out.println("kolo1 = " + kolo1);

//        Figura.stworzKwadrat(10);//1
//        Figura.stworzKolo(20);// 2
//        Figura.stworzProstokat(10, 20);// 3

        List<Figura> figury = Arrays.asList(Figura.stworzKwadrat(10), Figura.stworzKolo(20), Figura.stworzProstokat(10, 20));
        for (Figura f : figury) {
            System.out.println(f);
        }

//        System.out.println();
//        System.out.println("kwadrat2 = " + Figura.stworzKwadrat(10));
//        System.out.println("kolo2 = " + Figura.stworzKolo(20));
//        System.out.println("prostokat = " + Figura.stworzProstokat(10, 20));

    }
}
