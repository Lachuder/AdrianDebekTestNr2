package pl.kurs.zadanie02.models;

import pl.kurs.zadanie02.data.Specialization;

import java.time.LocalDate;

public class Doctor extends Person {

    private Specialization specialization;
    private String taxIdentificationNumber;

    public Doctor(int id, String lastName, String firstName, String peselIdentificationNumber, LocalDate birthDate, Specialization specialization, String taxIdentificationNumber) {
        super(id, lastName, firstName, peselIdentificationNumber, birthDate);
        this.specialization = specialization;
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(String taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                " specialization=" + specialization +
                ", taxIdentificationNumber='" + taxIdentificationNumber + '\'' +
                '}';
    }
}
