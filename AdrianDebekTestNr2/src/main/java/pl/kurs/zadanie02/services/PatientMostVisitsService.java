package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Patient;
import pl.kurs.zadanie02.models.Visit;

public class PatientMostVisitsService {

    public static Patient patientWithMostVisits(Patient[] patInput, Visit[] visInput) {
        Patient result = null;
        int max = 0;
        for (int i = 0; i < patInput.length; i++) {
            int counter = 0;
            for (int j = 0; j < visInput.length; j++) {
                if (patInput[i].getId() == visInput[j].getPatientId()) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                        result = patInput[i];
                    }
                }
            }
        }
        return result;
    }


}
