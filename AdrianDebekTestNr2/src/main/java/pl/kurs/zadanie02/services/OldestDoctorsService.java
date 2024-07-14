package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Doctor;

public class OldestDoctorsService {

//    public static Doctor findOldestDoctor(Doctor[] docArray) {
//        Doctor result = null;
//        long min = 99_999_999_999L;
//        for (int i = 0; i < docArray.length; i++) {
//            for (int j = 0; j < docArray.length; j++) {
//                if (Long.parseLong(docArray[j].getPeselIdentificationNumber()) < min) {
//                    min = Long.parseLong(docArray[i].getPeselIdentificationNumber());
//                    result = docArray[i];
//                }
//            }
//        }
//        return result;
//    }

    public static Doctor findOldestDoctor(Doctor[] docArray) {
        Doctor result = null;
        long min = 99_999_999_999L;
        for (Doctor doctor : docArray) {
            if (Long.parseLong(doctor.getPeselIdentificationNumber()) < min) {
                min = Long.parseLong(doctor.getPeselIdentificationNumber());
                result = doctor;
            }
        }
        return result;
    }

}
