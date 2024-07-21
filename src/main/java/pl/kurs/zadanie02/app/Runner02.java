package pl.kurs.zadanie02.app;

import pl.kurs.zadanie01.models.Baby;
import pl.kurs.zadanie01.models.Mother;
import pl.kurs.zadanie01.models.Person;
import pl.kurs.zadanie02.models.Doctor;
import pl.kurs.zadanie02.models.Patient;
import pl.kurs.zadanie02.models.Visit;
import pl.kurs.zadanie02.services.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner02 {

    public static void main(String[] args) {


        List<Doctor> doctors = DoctorDataStorage.readDoctorsFromFile(new File("lekarze.txt"));
        List<Patient> patients = PatientDataStorage.readPatientsFromFile(new File("pacjenci.txt"));
        List<Visit> visits = VisitsDataStorage.readVisitsFromFile(new File("wizyty.txt"), doctors, patients);
        VisitsService.saveDoctorVisits(visits);
        VisitsService.savePatientsVisits(visits);

        System.out.println("DoctorService.doctorWithMostVisits(visits) = " + DoctorService.doctorWithMostVisits(visits));
        System.out.println("PatientService.patientWithMostVisits(visits) = " + PatientService.patientWithMostVisits(visits));
        System.out.println("DoctorService.findMostPopularSpecialization(doctors) = " + DoctorService.findMostPopularSpecialization(doctors));
        System.out.println("VisitsService.getYearWithMostVisits(visits) = " + VisitsService.getYearWithMostVisits(visits));
        System.out.println("DoctorService.findOldestDoctor(doctors) = " + DoctorService.findOldestDoctor(doctors));


    }

}
