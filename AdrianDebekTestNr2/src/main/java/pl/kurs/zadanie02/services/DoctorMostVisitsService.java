package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Doctor;
import pl.kurs.zadanie02.models.Visit;

public class DoctorMostVisitsService {

    public static Doctor doctorWithMostVisits(Doctor[] docInput, Visit[] visInput) {
        Doctor result = null;
        int max = 0;
        for (int i = 0; i < docInput.length; i++) {
            int counter = 0;
            for (int j = 0; j < visInput.length; j++) {
                if (docInput[i].getId() == visInput[j].getDoctorId()) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                        result = docInput[i];
                    }
                }
            }
        }
        return result;
    }


}
