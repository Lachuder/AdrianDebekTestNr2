package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.data.Specialization;
import pl.kurs.zadanie02.models.Doctor;
import pl.kurs.zadanie02.models.Patient;
import pl.kurs.zadanie02.models.Visit;

import java.time.LocalDate;
import java.util.*;

public class DoctorService {

    public static Doctor findDoctorWithMostVisits(List<Doctor> input) {
        Doctor result = null;
        int temp = 0;
        for (Doctor docs : input) {
            if (docs.getListOfVisits().size() > temp) {
                temp = docs.getListOfVisits().size();
                result = docs;
            }
        }
        return result;
    }

    public static Specialization findMostPopularSpecialization(List<Doctor> docList) {
        int max = 0;
        Specialization result = null;
        for (int i = 0; i < docList.size(); i++) {
            int counter = 0;
            for (int j = 0; j < docList.size(); j++) {
                if (docList.get(i).getSpecialization().equals(docList.get(j).getSpecialization())) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                        result = docList.get(i).getSpecialization();
                    }
                }
            }
        }
        return result;
    }

    public static Doctor findOldestDoctor(List<Doctor> docList) {
        Doctor result = null;
        LocalDate temp = docList.get(0).getBirthDate();
        for (Doctor doc : docList) {
            if (doc.getBirthDate().isBefore(temp)) {
                temp = doc.getBirthDate();
                result = doc;
            }
        }
        return result;
    }

    public static List<Doctor> getFiveOldestDoctors(List<Doctor> docList) {
        List<Doctor> result = new ArrayList<>();
        docList.sort(new Doctor.DoctorAgeComparator());
        for (int i = 0; i < docList.size(); i++) {
            result.add(docList.get(i));
            if (result.size() == 5) break;
        }
        return result;
    }

    public static List<Doctor> getFiveDoctorsWithMostVisits(List<Doctor> docList) {
        List<Doctor> result = new ArrayList<>();
        docList.sort(new Doctor.DoctorNumberOfVisitsComparator().reversed());
        for (int i = 0; i < docList.size(); i++) {
            result.add(docList.get(i));
            if (result.size() == 5) break;
        }
        return result;
    }

    public static List<Doctor> getDoctorsWithOnlyOnePatient(List<Doctor> docList) {
        List<Doctor> result = new ArrayList<>();
        for (Doctor doctor : docList) {
            HashSet<Patient> temp = new HashSet<>();
            for (Visit visit : doctor.getListOfVisits()) {
                temp.add(visit.getPatient());
            }
            if (temp.size() == 1) {
                result.add(doctor);
            }
        }
        return result;
    }


}
