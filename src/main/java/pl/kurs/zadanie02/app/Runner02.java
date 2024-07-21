package pl.kurs.zadanie02.app;

import pl.kurs.zadanie02.models.Doctor;
import pl.kurs.zadanie02.models.Patient;
import pl.kurs.zadanie02.models.Visit;
import pl.kurs.zadanie02.services.*;

import java.io.File;
import java.util.List;

public class Runner02 {

    public static void main(String[] args) {


        List<Doctor> doctors = DoctorDataStorage.readDoctorsFromFile(new File("lekarze.txt"));
        List<Patient> patients = PatientDataStorage.readPatientsFromFile(new File("pacjenci.txt"));
        List<Visit> visits = VisitsDataStorage.readVisitsFromFile(new File("wizyty.txt"), doctors, patients);
        VisitsService.saveDoctorVisits(visits);
        VisitsService.savePatientsVisits(visits);

        System.out.println("DoctorService.doctorWithMostVisits(visits) = " + DoctorService.findDoctorWithMostVisits(doctors));
        System.out.println("PatientService.patientWithMostVisits(visits) = " + PatientService.findPatientWithMostVisits(patients));
        System.out.println("DoctorService.findMostPopularSpecialization(doctors) = " + DoctorService.findMostPopularSpecialization(doctors));
        System.out.println("VisitsService.getYearWithMostVisits(visits) = " + VisitsService.getYearWithMostVisits(visits));
        System.out.println("DoctorService.findOldestDoctor(doctors) = " + DoctorService.findOldestDoctor(doctors));
        System.out.println("DoctorService.getFiveOldestDoctors(doctors) = " + DoctorService.getFiveOldestDoctors(doctors));
        System.out.println("DoctorService.getFiveDoctorsWithMostVisits(doctors) = " + DoctorService.getFiveDoctorsWithMostVisits(doctors));
        System.out.println("PatientService.getPatientsWithMinimumFiveDifferentDoctors(patients) = " + PatientService.getPatientsWithMinimumFiveDifferentDoctors(patients));
        System.out.println("DoctorService.getDoctorsWithOnlyOnePatient(doctors) = " + DoctorService.getDoctorsWithOnlyOnePatient(doctors));

    }

}
