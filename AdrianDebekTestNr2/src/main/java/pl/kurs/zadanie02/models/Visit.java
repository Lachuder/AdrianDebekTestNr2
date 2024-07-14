package pl.kurs.zadanie02.models;

import java.time.LocalDate;

public class Visit {
    private int doctorId;
    private int patientId;
    private LocalDate visitDate;

    public Visit(int doctorId, int patientId, LocalDate visitDate) {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.visitDate = visitDate;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
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
