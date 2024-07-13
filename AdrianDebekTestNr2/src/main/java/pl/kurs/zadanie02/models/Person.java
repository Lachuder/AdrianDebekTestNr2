package pl.kurs.zadanie02.models;

import java.time.LocalDate;

public abstract class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String peselIdentificationNumber;
    private LocalDate birthDate;

    public Person(int id, String firstName, String lastName, String peselIdentificationNumber, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselIdentificationNumber = peselIdentificationNumber;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", peselIdentificationNumber='" + peselIdentificationNumber + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
