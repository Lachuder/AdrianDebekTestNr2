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

        //- znajdź lekarza ktory miał najwięcej wizyt
        System.out.println("DoctorService.doctorWithMostVisits(visits) = " + DoctorService.findDoctorWithMostVisits(doctors));

        //- znajdź pacjenta który miał najwięcej wizyt
        System.out.println("PatientService.patientWithMostVisits(visits) = " + PatientService.findPatientWithMostVisits(patients));

        //- która specalizacja cieszy się największym powodzeniem?
        System.out.println("DoctorService.findMostPopularSpecialization(doctors) = " + DoctorService.findMostPopularSpecialization(doctors));

        //- którego roku było najwięcej wizyt?
        System.out.println("VisitsService.getYearWithMostVisits(visits) = " + VisitsService.getYearWithMostVisits(visits));
        System.out.println("DoctorService.findOldestDoctor(doctors) = " + DoctorService.findOldestDoctor(doctors));

        //- wypisz top 5 najstarszych lekarzy
        System.out.println("DoctorService.getFiveOldestDoctors(doctors) = " + DoctorService.getFiveOldestDoctors(doctors));

        //- wypisz top 5 lekarzy co mieli najwiecej wizyt
        System.out.println("DoctorService.getFiveDoctorsWithMostVisits(doctors) = " + DoctorService.getFiveDoctorsWithMostVisits(doctors));

        //- zwroc pacientow ktorzy byli u minumum 5ciu roznych lekarzy
        System.out.println("PatientService.getPatientsWithMinimumFiveDifferentDoctors(patients) = " + PatientService.getPatientsWithMinimumFiveDifferentDoctors(patients));

        //- zwroc lekarzy ktorzy przyjeli tylko jednego pacjenta
        System.out.println("DoctorService.getDoctorsWithOnlyOnePatient(doctors) = " + DoctorService.getDoctorsWithOnlyOnePatient(doctors));


    }

}
