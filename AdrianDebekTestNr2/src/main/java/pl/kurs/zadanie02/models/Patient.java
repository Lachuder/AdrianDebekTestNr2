package pl.kurs.zadanie02.models;

import java.time.LocalDate;

public class Patient extends Person {


    public Patient(int id, String lastName, String firstName, String peselIdentificationNumber, LocalDate birthDate) {
        super(id, lastName, firstName, peselIdentificationNumber, birthDate);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
