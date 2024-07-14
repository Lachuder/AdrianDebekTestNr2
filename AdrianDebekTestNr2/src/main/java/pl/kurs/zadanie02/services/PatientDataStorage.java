package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Patient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class PatientDataStorage {

    public static Patient[] readPatientsFromFile(File file) {
        Patient[] resultArray = new Patient[0];
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
                    resultArray[resultArray.length - 1] = createPatientObjectFromDataInString(line);;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultArray;
    }
    //122 Nowakowska Joanna 73050512356 1973-05-05
    private static Patient createPatientObjectFromDataInString(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        String[] temp = input.replaceAll("\\s+", " ").split(" ");
        int id = Utility.convertStringToInt(temp[0]);
        String lastName = temp[1];
        String firstName = temp[2];
        String peselIdentificationNumber = temp[3];
        LocalDate birthDate = LocalDate.parse(temp[4], formatter);
        return new Patient(id,lastName,firstName,peselIdentificationNumber,birthDate);
    }

}
