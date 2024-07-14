package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Visit;

public class MostFrequentVisitYearService {

    public static int yearWithMostVisits(Visit[] visInput) {
        int max = 0;
        int result = 0;
        for (int i = 0; i < visInput.length; i++) {
            int counter = 0;
            for (int j = 0; j < visInput.length; j++) {
                if (visInput[i].getVisitDate().getYear() == visInput[j].getVisitDate().getYear()) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                        result = visInput[i].getVisitDate().getYear();
                    }
                }
            }
        }
        return result;
    }

}
