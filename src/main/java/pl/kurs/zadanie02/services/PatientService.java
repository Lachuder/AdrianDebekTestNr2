package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Patient;
import pl.kurs.zadanie02.models.Visit;

import java.util.List;

public class PatientService {

    public static Patient patientWithMostVisits(List<Visit> visInput) {
        Patient result = null;
        int max = 0;
        for (int i = 0; i < visInput.size(); i++) {
            int counter = 0;
            for (int j = 0; j < visInput.size(); j++) {
                if (visInput.get(i).getPatient().equals(visInput.get(j).getPatient())) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                        result = visInput.get(i).getPatient();
                    }
                }
            }
        }
        return result;
    }

}
