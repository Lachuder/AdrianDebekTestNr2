package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Visit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class VisitsDataStorage {

    public static Visit[] readVisitsFromFile(File file) {
        Visit[] resultArray = new Visit[0];
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
                    resultArray[resultArray.length - 1] = createVisitObjectFromDataInString(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultArray;
    }

    private static Visit createVisitObjectFromDataInString(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        String[] temp = input.replaceAll("\\s+", " ").split(" ");
        int doctorId = Utility.convertStringToInt(temp[0]);
        int patientId = Utility.convertStringToInt(temp[1]);
        LocalDate visitDate = LocalDate.parse(temp[2], formatter);
        return new Visit(doctorId, patientId, visitDate);
    }

}
