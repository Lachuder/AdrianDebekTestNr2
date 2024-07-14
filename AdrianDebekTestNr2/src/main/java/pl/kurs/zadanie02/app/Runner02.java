package pl.kurs.zadanie02.app;

import pl.kurs.zadanie02.models.Doctor;
import pl.kurs.zadanie02.models.Patient;
import pl.kurs.zadanie02.models.Visit;
import pl.kurs.zadanie02.services.*;

import java.io.File;
import java.util.Arrays;

public class Runner02 {

    public static void main(String[] args) {


        Doctor[] doctors = DoctorDataStorage.readDoctorsFromFile(new File("lekarze.txt"));
        Patient[] patients = PatientDataStorage.readPatientsFromFile(new File("pacjenci.txt"));
        Visit[] visits = VisitsDataStorage.readVisitsFromFile(new File("wizyty.txt"));

        System.out.println("DoctorMostVisitsService.doctorWithMostVisits(doctors, visits) = " + DoctorMostVisitsService.doctorWithMostVisits(doctors, visits));
        System.out.println("PatientMostVisitsService.patientWithMostVisits(patients, visits) = " + PatientMostVisitsService.patientWithMostVisits(patients, visits));
        System.out.println("PopularSpecializationService.findMostPopular(doctors) = " + Arrays.toString(PopularSpecializationService.findMostPopularSpecialization(doctors)));
        System.out.println("MostFrequentVisitYearService.yearWithMostVisits(visits) = " + MostFrequentVisitYearService.yearWithMostVisits(visits));
        System.out.println("OldestDoctorsService.findOldestDoctor(doctors) = " + OldestDoctorsService.findOldestDoctor(doctors));

        System.out.println("Long.parseLong(\"00032906074\") = " + Long.parseLong("00032906074"));


    }

}
