package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Doctor;
import pl.kurs.zadanie02.models.Patient;
import pl.kurs.zadanie02.models.Visit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PatientService {

    public static Patient findPatientWithMostVisits(List<Patient> input) {
        Patient result = null;
        int temp = 0;
        for (Patient pats : input) {
            if (pats.getListOfVisits().size() > temp) {
                temp = pats.getListOfVisits().size();
                result = pats;
            }
        }
        return result;
    }
    public static List<Patient> getPatientsWithMinimumFiveDifferentDoctors(List<Patient> patList) {
        List<Patient> result = new ArrayList<>();
        for (Patient patient : patList) {
            HashSet<Doctor> temp = new HashSet<>();
            for (Visit listOfVisit : patient.getListOfVisits()) {
                temp.add(listOfVisit.getDoctor());
            }
            if (temp.size() > 5) {
                result.add(patient);
            }
        }
        return result;
    }
}
