package pl.kurs.zadanie03.models;

public class Employee extends Person {

    private String position;
    private double salary;

    public Employee(String firstName, String lastName, String peselIdentificationNumber, String city, String position, double salary) {
        super(firstName, lastName, peselIdentificationNumber, city);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                " position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
