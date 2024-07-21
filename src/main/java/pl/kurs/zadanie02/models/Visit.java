package pl.kurs.zadanie02.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Visit {
    private final Doctor doctor;
    private final Patient patient;
    private final LocalDate visitDate;
    private List<Object> visits = new ArrayList<>();

    public Visit(Doctor doctor, Patient patient, LocalDate visitDate) {
        this.doctor = doctor;
        this.patient = patient;
        this.visitDate = visitDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "doctor=" + doctor +
                ", patient=" + patient +
                ", visitDate=" + visitDate +
                '}';
    }
}
