package pl.kurs.zadanie02.models;

import java.time.LocalDate;

public abstract class Person {

    private int id;
    private final String lastName;
    private final String firstName;
    private final String peselIdentificationNumber;
    private final LocalDate birthDate;

    public Person(int id, String lastName, String firstName, String peselIdentificationNumber, LocalDate birthDate) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.peselIdentificationNumber = peselIdentificationNumber;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", peselIdentificationNumber='" + peselIdentificationNumber + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

}
