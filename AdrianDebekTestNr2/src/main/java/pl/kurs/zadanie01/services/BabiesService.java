package pl.kurs.zadanie01.services;

import pl.kurs.zadanie01.models.Baby;
import pl.kurs.zadanie01.models.Mother;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

public class BabiesService {

    public static Baby[] readBabiesFromFile(File file, Mother[] mothersArray) {
        Baby[] resultArray = new Baby[0];

        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                resultArray[resultArray.length - 1] = mapStringToBaby(line, mothersArray);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultArray;
    }

    private static Baby mapStringToBaby(String line, Mother[] mothersArray) {
        String[] temp = line.replaceAll("\\s+", " ").split(" ");
        int index = Utility.convertStringToInt(temp[0]);
        String gender = temp[1];
        String firstName = temp[2];
        String dateOfBirth = temp[3];
        int weight = Utility.convertStringToInt(temp[4]);
        int height = Utility.convertStringToInt(temp[5]);
        int motherId = Utility.convertStringToInt(temp[6]);
        return new Baby(index, firstName, gender, LocalDate.parse(dateOfBirth), weight, height, findMotherById(motherId, mothersArray));
    }

    private static Mother findMotherById(int id, Mother[] mothersArray) {
        Mother result = null;

        for (Mother mother : mothersArray) {
            if (mother.getId() == id)
                result = mother;
        }
        return result;

    }

}
