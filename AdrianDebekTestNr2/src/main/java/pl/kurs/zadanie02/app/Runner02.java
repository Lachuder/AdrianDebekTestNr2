package pl.kurs.zadanie02.app;

import pl.kurs.zadanie02.services.*;

public class Runner02 {

    public static void main(String[] args) {

        DoctorDataStorage doctorDataStorage = new DoctorDataStorage();
        PatientDataStorage patientDataStorage = new PatientDataStorage();
        VisitsDataStorage visitsDataStorage = new VisitsDataStorage();

        DataLoadService dataLoadService = new DataLoadService(doctorDataStorage, patientDataStorage, visitsDataStorage);

        dataLoadService.loadDoctorDataStorage();
        dataLoadService.loadPatientDataStorage();
        dataLoadService.loadVisitsDataStorage();

        DoctorMostFrequentVisitsService doctorMostFrequentVisitsService = new DoctorMostFrequentVisitsService(doctorDataStorage, visitsDataStorage);
        System.out.println("doctorMostFrequentVisitsService.mostDoctorVisits() = " + doctorMostFrequentVisitsService.doctorWithMostVisits());

        PatientMostFrequentVisitsService patientMostFrequentVisitsService = new PatientMostFrequentVisitsService(patientDataStorage, visitsDataStorage);
        System.out.println("patientMostFrequentVisitsService.patientWithMostVisits() = " + patientMostFrequentVisitsService.patientWithMostVisits());

        PopularSpecializationService popularSpecializationService = new PopularSpecializationService(doctorDataStorage);
        System.out.println("popularSpecializationService.findMostPopular() = " + popularSpecializationService.findMostPopular());

        MostFrequentVisitYearService mostFrequentVisitYearService = new MostFrequentVisitYearService(visitsDataStorage);
        System.out.println("mostFrequentVisitYearService.findMostFrequentYear() = " + mostFrequentVisitYearService.findMostFrequentYear());

        OldestDoctorsService oldestDoctorsService = new OldestDoctorsService(doctorDataStorage);
//        System.out.println("oldestDoctorsService.sortArrayOfDoctorsObjectsByPeselNumber() = " + Arrays.toString(oldestDoctorsService.sortArrayOfDoctorsObjectsByPeselNumber()));

    }

}
