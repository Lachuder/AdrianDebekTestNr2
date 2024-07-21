package pl.kurs.zadanie02.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
    private final List<Visit> listOfVisits = new ArrayList<>();

    public Patient(int id, String lastName, String firstName, String peselIdentificationNumber, LocalDate birthDate) {
        super(id, lastName, firstName, peselIdentificationNumber, birthDate);
    }

    public List<Visit> getListOfVisits() {
        return listOfVisits;
    }

    public void addVisit(Visit visit) {
        listOfVisits.add(visit);
    }
    @Override
    public String toString() {
        return super.toString();
    }

}
