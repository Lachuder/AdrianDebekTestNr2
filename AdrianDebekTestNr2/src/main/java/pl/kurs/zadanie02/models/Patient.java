package pl.kurs.zadanie02.models;

import java.time.LocalDate;

public class Patient extends Person {


    public Patient(int id, String firstName, String lastName, String peselIdentificationNumber, LocalDate birthDate) {
        super(id, firstName, lastName, peselIdentificationNumber, birthDate);
    }

}
