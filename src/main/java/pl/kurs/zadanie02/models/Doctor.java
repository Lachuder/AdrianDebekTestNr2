package pl.kurs.zadanie02.models;

import pl.kurs.zadanie02.data.Specialization;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Doctor extends Person {

    private final Specialization specialization;
    private final String taxIdentificationNumber;
    private final List<Visit> listOfVisits = new ArrayList<>();

    public Doctor(int id, String lastName, String firstName, String peselIdentificationNumber, LocalDate birthDate, Specialization specialization, String taxIdentificationNumber) {
        super(id, lastName, firstName, peselIdentificationNumber, birthDate);
        this.specialization = specialization;
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public List<Visit> getListOfVisits() {
        return listOfVisits;
    }

    public void addVisit(Visit visit) {
        listOfVisits.add(visit);
    }

    @Override
    public String toString() {
        return super.toString() +
                " specialization=" + specialization +
                ", taxIdentificationNumber='" + taxIdentificationNumber + '\'' +
                '}';
    }

    public static class DoctorAgeComparator implements Comparator<Doctor> {
        @Override
        public int compare(Doctor doc1, Doctor doc2) {
            return doc1.getBirthDate().compareTo(doc2.getBirthDate());
        }

    }
    public static class DoctorNumberOfVisitsComparator implements Comparator<Doctor> {

        @Override
        public int compare(Doctor doc1, Doctor doc2) {
            return doc1.getListOfVisits().size() - doc2.getListOfVisits().size();
        }
    }

}
