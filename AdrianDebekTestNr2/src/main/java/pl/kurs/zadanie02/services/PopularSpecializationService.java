package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Doctor;

public class PopularSpecializationService {

    public static String[] findMostPopularSpecialization(Doctor[] docArray) {
        int max = 0;
        int arrayLength = 0;
        String[] result = new String[arrayLength + 1];
        for (int i = 0; i < docArray.length; i++) {
            int counter = 0;
            for (int j = 0; j < docArray.length; j++) {
                if (docArray[i].getSpecialization().equals(docArray[j].getSpecialization())) {
                    counter++;
                    if (counter > max) {
                        max = counter;
                        result[arrayLength] = docArray[i].getSpecialization().name();
                    }
                }
            }
        }
        return result;
    }

//    private static String checkForDouble(Doctor[] array, String input) {
//        int max = 0;
//        String result = null;
//        for (int i = 0; i < array.length; i++) {
//            int counter = 0;
//            for (int j = 0; j < array.length; j++) {
//                if (array[i].getSpecialization().name().equals(input)) {
//                    continue;
//                } else if (array[i].getSpecialization().equals(array[j].getSpecialization())) {
//                    counter++;
//                    if (counter > max) {
//                        max = counter;
//                        result = array[i].getSpecialization().name();
//                    }
//                }
//            }
//        }
//        return result;
//    }

}
