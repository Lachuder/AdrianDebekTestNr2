package pl.kurs.zadanie02.models;

import java.time.LocalDate;

public class Visit {
    private final int doctorId;
    private final int patientId;
    private final LocalDate visitDate;

    public Visit(int doctorId, int patientId, LocalDate visitDate) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.visitDate = visitDate;
    }

    public int getDoctorId() {
        return doctorId;
    }


    public int getPatientId() {
        return patientId;
    }


    public LocalDate getVisitDate() {
        return visitDate;
    }


    @Override
    public String toString() {
        return "Visit{" +
                "doctorId=" + doctorId +
                ", patientId=" + patientId +
                ", visitDate=" + visitDate +
                '}';
    }
}
