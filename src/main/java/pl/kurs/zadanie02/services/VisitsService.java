package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Visit;

import java.util.List;

public class VisitsService {

    public static void saveDoctorVisits(List<Visit> visits) {
        for (Visit vis : visits) {
            vis.getDoctor().addVisit(vis);
        }
    }

    public static void savePatientsVisits(List<Visit> visits) {
        for (Visit vis : visits) {
            vis.getPatient().addVisit(vis);
        }
    }

    public static int getYearWithMostVisits(List<Visit> visInput) {
        int max = 0;
        int result = 0;
        for (int i = 0; i < visInput.size(); i++) {
            int counter = 0;
            for (int j = 0; j < visInput.size(); j++) {
                if (visInput.get(i).getVisitDate().getYear() == visInput.get(j).getVisitDate().getYear()) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                        result = visInput.get(i).getVisitDate().getYear();
                    }
                }
            }
        }
        return result;
    }

}
