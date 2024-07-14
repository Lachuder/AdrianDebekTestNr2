package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Doctor;

public class OldestDoctorsService {

//    public static Doctor[] findTopFiveOldestDoctor(Doctor[] docArray) {
//        Doctor[] result = new Doctor[5];
//        result[0] = findOldestDoctor(docArray);
//        int counter = 0;
//        for (int i = 0; i < docArray.length; i++) {
//            for (int j = i; j < docArray.length; j++) {
//
//                }
//            }
//        return result;
//    }

//    TODO zdaję sobie sprawę, że to nie jest najlepszy sposób, ze względu na możliwość rozpoczynania się numeru PESEL od zer

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
