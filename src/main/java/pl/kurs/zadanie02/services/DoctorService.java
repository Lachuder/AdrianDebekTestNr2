package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.data.Specialization;
import pl.kurs.zadanie02.models.Doctor;
import pl.kurs.zadanie02.models.Visit;

import java.time.LocalDate;
import java.util.List;

public class DoctorService {

    public static Doctor doctorWithMostVisits(List<Visit> visInput) {
        Doctor result = null;
        int max = 0;
        for (int i = 0; i < visInput.size(); i++) {
            int counter = 0;
            for (int j = 0; j < visInput.size(); j++) {
                if (visInput.get(i).getDoctor().equals(visInput.get(j).getDoctor())) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                        result = visInput.get(i).getDoctor();
                    }
                }
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

    //    public static List findMostPopularSpecialization(List<Doctor> docList) {
//        int max = 0;
////        int arrayLength = 0;
//        List<String> result = new ArrayList<>(1);
////        String someString1 = null;
//        for (int i = 0; i < docList.size(); i++) {
//            int counter = 0;
//            for (int j = 0; j < docList.size(); j++) {
//                if (docList.get(i).getSpecialization().equals(docList.get(j).getSpecialization())) {
//                    counter++;
//                    if (counter > max) {
//                        max = counter;
////                        someString1 = docList.get(i).getSpecialization().name();
//                        result.set(0,docList.get(i).getSpecialization().name());
////                        result[arrayLength] = docList.get(i).getSpecialization().name();
//                    }
//                }
//            }
//        }
//        return result;
//    }
    public static Doctor findOldestDoctor(List<Doctor> docList) {
        Doctor result = null;
        LocalDate temp = docList.get(0).getBirthDate();
//        long min = 99_999_999_999L;
        for (Doctor doc : docList) {
            if (doc.getBirthDate().isBefore(temp)) {
                temp = doc.getBirthDate();
                result = doc;
            }
        }
//        for (Doctor doctor : docList) {
//            if (Long.parseLong(doctor.getPeselIdentificationNumber()) < min) {
//                min = Long.parseLong(doctor.getPeselIdentificationNumber());
//                result = doctor;
//            }
//        }
        return result;
    }
}
