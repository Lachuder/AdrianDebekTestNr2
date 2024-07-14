package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.data.Specialization;
import pl.kurs.zadanie02.models.Doctor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

public class DoctorDataStorage {

    public static Doctor[] readDoctorsFromFile(File file) {
        Doctor[] resultArray = new Doctor[0];
        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("I")) {
                    continue;
                } else {
                    resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                    resultArray[resultArray.length - 1] = createDoctorObjectFromDataInString(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultArray;
    }
//23 Kadaj Monika pediatra 1965-03-16 879-122-69-94 65031687654
    private static Doctor createDoctorObjectFromDataInString(String input) {
        String[] temp = input.replaceAll("\\s+", " ").split(" ");
        int id = Utility.convertStringToInt(temp[0]);
        String lastName = temp[1];
        String firstName = temp[2];
        Specialization spec = Specialization.valueOf(temp[3].toUpperCase());
        LocalDate birthDate = LocalDate.parse(temp[4]);
        String taxIdentificationNumber = temp[5];
        String peselIdentificationNumber = temp[6];
        return new Doctor(id,lastName,firstName,peselIdentificationNumber,birthDate, spec,taxIdentificationNumber);
    }

}
