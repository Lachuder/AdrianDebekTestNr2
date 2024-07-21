package pl.kurs.zadanie03.services;

import pl.kurs.zadanie03.data.Plec;
import pl.kurs.zadanie03.models.Person;

import java.util.Arrays;

public class SchoolService {
    private static Person[] arrayOfPerson = new Person[0];

    public static void addPerson(Person person) {
        arrayOfPerson = Arrays.copyOf(arrayOfPerson, arrayOfPerson.length + 1);
        arrayOfPerson[arrayOfPerson.length - 1] = person;
    }
    public static Person getPersonWithHighestIncome() {
        Person result = null;
        double temp = 0;
        for (Person pers : arrayOfPerson) {
            if (pers.getIncome() > temp) {
                temp = pers.getIncome();
                result = pers;
            }
        }
        return result;
    }

//        public static Person getPersonWithHighestIncome() {
//        double max = 0;
//        Person result = null;
//        for (Person pers : arrayOfPerson) {
//            if (pers instanceof Student && ((Student) pers).getScholarship() > max) {
//                max = ((Student) pers).getScholarship();
//                result = pers;
//            }
//            if (pers instanceof Employee && ((Employee) pers).getSalary() > max) {
//                max = ((Employee) pers).getSalary();
//                result = pers;
//            }
//        }
//        return result;
//    }

    public static int countFemalesInSchool() {
        int result = 0;
        for (Person pers : arrayOfPerson) {
            if (getPlec(pers).equals(Plec.KOBIETA)) {
                result++;
            }
        }
        return result;
    }

    private static Plec getPlec(Person person) {
        String[] tempString = Utility.getStringArrayWithDigitsFromPeselNumber(person.getPeselIdentificationNumber());
        int genderDigit = Integer.parseInt(tempString[9]);
        return (genderDigit % 2 == 0) ? Plec.KOBIETA : Plec.MEZCZYZNA;
    }

    public static Person[] getArrayOfPerson() {
        return arrayOfPerson;
    }
}
