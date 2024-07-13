package pl.kurs.zadanie03.services;

import pl.kurs.zadanie03.models.Person;

public class SchoolService {

    private static int counter = 0;
    private static Person[] arrayOfPerson = new Person[counter + 1];

    public SchoolService() {
    }

    public static void addPerson(Person person) {
        arrayOfPerson[arrayOfPerson.length - 1] = person;
        counter++;
    }

//    private static boolean getPlec(Person[] people) {
//
//    }

    public static Person[] getArrayOfPerson() {
        return arrayOfPerson;
    }
}
