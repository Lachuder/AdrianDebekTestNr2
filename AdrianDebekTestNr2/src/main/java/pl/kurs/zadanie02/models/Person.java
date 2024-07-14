package pl.kurs.zadanie02.models;

import java.time.LocalDate;

public abstract class Person {

    private int id;
    private String lastName;
    private String firstName;
    private String peselIdentificationNumber;
    private LocalDate birthDate;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPeselIdentificationNumber() {
        return peselIdentificationNumber;
    }

    public void setPeselIdentificationNumber(String peselIdentificationNumber) {
        this.peselIdentificationNumber = peselIdentificationNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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
