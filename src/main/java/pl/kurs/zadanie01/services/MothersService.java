package pl.kurs.zadanie01.services;

import pl.kurs.zadanie01.models.Baby;
import pl.kurs.zadanie01.models.Mother;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class MothersService {

    public static Mother[] readMothersFromFile(File file) {
        Mother[] resultArray = new Mother[0];
        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                resultArray[resultArray.length - 1] = createMotherObjectFromDataInString(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultArray;
    }

    private static Mother createMotherObjectFromDataInString(String line) {
        String[] temp = line.replaceAll("\\s+", " ").split(" ");
        int index = Utility.convertStringToInt(temp[0]);
        String firstName = temp[1];
        int age = Utility.convertStringToInt(temp[2]);
        return new Mother(index, firstName, age);
    }

    public static void assignBabiesToMothers(Baby[] babies) {
        for (Baby baby : babies) {
            baby.getMother().addBaby(baby);
        }
    }


}
