package pl.kurs.zadanie01.services;

import pl.kurs.zadanie01.models.Baby;
import pl.kurs.zadanie01.models.Mother;

import java.util.Arrays;

public class MaternityService {

    public static Baby findTallestBoy(Baby[] babies) {
        Baby result = null;
        int maxHeight = 0;
        for (int i = 0; i < babies.length; i++) {
            if (babies[i].getGender().equals("s") && babies[i].getHeight() > maxHeight) {
                maxHeight = babies[i].getHeight();
                result = babies[i];
            }
        }
        return result;
    }

    public static Baby findTallestGirl(Baby[] babies) {
        Baby result = null;
        int maxHeight = 0;
        for (int i = 0; i < babies.length; i++) {
            if (babies[i].getGender().equals("c") && babies[i].getHeight() > maxHeight) {
                maxHeight = babies[i].getHeight();
                result = babies[i];
            }
        }
        return result;
    }

    public static String[] getNamesOfMothersBeforeAge25WithBabiesOver4000G(Mother[] mothers) {
        String[] result = new String[mothers.length];
        int counter = 0;
        for (int i = 0; i < mothers.length; i++) {
            if (mothers[i].getAge() < 25) {
                for (int j = 0; j < mothers[i].getBabies().length; j++) {
                    if (mothers[i].getBabies()[j].getWeight() > 4000) {
                        result[counter] = mothers[i].getName();
                        counter++;
                    }
                }
            }
        }
        return Arrays.copyOf(result, counter);
    }

    public static String[] findDaughtersWithNameAfterMotherAndGetBirthDate(Baby[] babies) {
        String[] result = new String[babies.length];
        int counter = 0;
        for (int i = 0; i < babies.length; i++) {
            if (babies[i].getName().equals(babies[i].getMother().getName())) {
                result[counter] = babies[i].getName() + " " + babies[i].getBirthDate();
                counter++;
            }
        }
        return Arrays.copyOf(result, counter);
    }

    public static Mother[] findMothersOfTwins(Mother[] mothers) {
        Mother[] temp = findMothersOfTwoChildren(mothers);
        int counter = 0;
        Mother[] result = new Mother[mothers.length];
        for (Mother mom : temp) {
            if (mom.getBabies()[0].getBirthDate().equals(mom.getBabies()[1].getBirthDate())) {
                result[counter] = mom;
                counter++;
            }
        }
        return Arrays.copyOf(result, counter);
    }

    private static Mother[] findMothersOfTwoChildren(Mother[] mothers) {
        int counter = 0;
        Mother[] result = new Mother[mothers.length];
        for (int i = 0; i < mothers.length; i++) {
            if (mothers[i].getBabies().length == 2) {
                result[counter] = mothers[i];
                counter++;
            }
        }
        return Arrays.copyOf(result, counter);
    }


}
