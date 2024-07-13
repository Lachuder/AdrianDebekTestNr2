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
//    public boolean getPlec() {
//
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPeselIdentificationNumber() {
        return peselIdentificationNumber;
    }

    public void setPeselIdentificationNumber(String peselIdentificationNumber) {
        this.peselIdentificationNumber = peselIdentificationNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

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
