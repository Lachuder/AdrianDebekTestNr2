package pl.kurs.zadanie03.models;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String peselIdentificationNumber;
    private String city;

    public Person(String firstName, String lastName, String peselIdentificationNumber, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselIdentificationNumber = peselIdentificationNumber;
        this.city = city;
    }

    public String getPeselIdentificationNumber() {
        return peselIdentificationNumber;
    }
    public abstract double getIncome();

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", peselIdentificationNumber='" + peselIdentificationNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
