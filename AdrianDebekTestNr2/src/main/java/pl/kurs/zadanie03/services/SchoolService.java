package pl.kurs.zadanie03.services;

import pl.kurs.zadanie03.models.Employee;
import pl.kurs.zadanie03.models.Student;
import pl.kurs.zadanie03.services.Utility;
import pl.kurs.zadanie03.models.Person;

import java.util.Arrays;

public class SchoolService {
    private static Person[] arrayOfPerson = new Person[0];

    public static void addPerson(Person person) {
        arrayOfPerson = Arrays.copyOf(arrayOfPerson, arrayOfPerson.length + 1);
        arrayOfPerson[arrayOfPerson.length - 1] = person;
    }

        public static Person getPersonWithHighestIncome() {
        double max = 0;
        Person result = null;
        for (Person pers : arrayOfPerson) {
            if (pers instanceof Student && ((Student) pers).getScholarship() > max) {
                max = ((Student) pers).getScholarship();
                result = pers;
            }
            if (pers instanceof Employee && ((Employee) pers).getSalary() > max) {
                max = ((Employee) pers).getSalary();
                result = pers;
            }
        }
        return result;
    }

    public static int countFemalesInSchool() {
        int result = 0;
        for (Person pers : arrayOfPerson) {
            if (getPlec(pers)) {
                result++;
            }
        }
        return result;
    }

    private static boolean getPlec(Person person) {
        String[] tempString = Utility.getStringArrayWithDigitsFromPeselNumber(person.getPeselIdentificationNumber());
        return Integer.parseInt(tempString[9]) % 2 == 0 || Integer.parseInt(tempString[9]) == 0;
    }

    public static Person[] getArrayOfPerson() {
        return arrayOfPerson;
    }
}
