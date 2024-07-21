package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.data.Specialization;
import pl.kurs.zadanie02.models.Doctor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DoctorDataStorage {
    public static List<Doctor> readDoctorsFromFile(File file) {
        List<Doctor> resultList = new ArrayList<>();
        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("I")) {
                    continue;
                } else {
                    resultList.add(createDoctorObjectFromDataInString(line));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    private static Doctor createDoctorObjectFromDataInString(String input) {
        String[] temp = Utility.convertStringElementsToArray(input);
        int id = Utility.convertStringToInt(temp[0]);
        String lastName = temp[1];
        String firstName = temp[2];
        Specialization spec = Specialization.valueOf(temp[3].toUpperCase());
        LocalDate birthDate = LocalDate.parse(temp[4]);
        String taxIdentificationNumber = temp[5];
        String peselIdentificationNumber = temp[6];
        return new Doctor(id, lastName, firstName, peselIdentificationNumber, birthDate, spec, taxIdentificationNumber);
    }

}
