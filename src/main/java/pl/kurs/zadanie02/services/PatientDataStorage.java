package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Patient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatientDataStorage {

    public static List<Patient> readPatientsFromFile(File file) {
        List<Patient> resultList = new ArrayList<>();
        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("I")) {
                    continue;
                } else {
                    resultList.add(createPatientObjectFromDataInString(line));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultList;
    }

    private static Patient createPatientObjectFromDataInString(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        String[] temp = input.replaceAll("\\s+", " ").split(" ");
        int id = Utility.convertStringToInt(temp[0]);
        String lastName = temp[1];
        String firstName = temp[2];
        String peselIdentificationNumber = temp[3];
        LocalDate birthDate = LocalDate.parse(temp[4], formatter);
        return new Patient(id, lastName, firstName, peselIdentificationNumber, birthDate);
    }

}
