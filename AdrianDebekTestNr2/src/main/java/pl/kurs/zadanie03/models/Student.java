package pl.kurs.zadanie03.models;

public class Student extends Person {

    private String schoolGroup;
    private double scholarship;

    public Student(String firstName, String lastName, String peselIdentificationNumber, String city, String schoolGroup, double scholarship) {
        super(firstName, lastName, peselIdentificationNumber, city);
        this.schoolGroup = schoolGroup;
        this.scholarship = scholarship;
    }

    public String getSchoolGroup() {
        return schoolGroup;
    }

    public void setSchoolGroup(String schoolGroup) {
        this.schoolGroup = schoolGroup;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return super.toString() +
                "schoolGroup='" + schoolGroup + '\'' +
                ", scholarship=" + scholarship +
                '}';
    }
}
