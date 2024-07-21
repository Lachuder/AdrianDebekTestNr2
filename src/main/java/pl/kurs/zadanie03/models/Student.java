package pl.kurs.zadanie03.models;

import pl.kurs.zadanie03.data.GroupName;

public class Student extends Person {

    private final GroupName groupName;
    private final double scholarship;

    public Student(String firstName, String lastName, String peselIdentificationNumber, String city, GroupName groupName, double scholarship) {
        super(firstName, lastName, peselIdentificationNumber, city);
        this.groupName = groupName;
        this.scholarship = scholarship;
    }

    public double getScholarship() {
        return scholarship;
    }

    @Override
    public String toString() {
        return super.toString() +
                "schoolGroup='" + groupName + '\'' +
                ", scholarship=" + scholarship +
                '}';
    }
}
