package pl.kurs.zadanie03.models;

import pl.kurs.zadanie03.data.PositionTitle;

public class Employee extends Person {

    private final PositionTitle positionTitle;
    private final double salary;

    public Employee(String firstName, String lastName, String peselIdentificationNumber, String city, PositionTitle positionTitle, double salary) {
        super(firstName, lastName, peselIdentificationNumber, city);
        this.positionTitle = positionTitle;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double getIncome() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                " position='" + positionTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
