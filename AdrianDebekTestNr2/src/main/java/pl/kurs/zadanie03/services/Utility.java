package pl.kurs.zadanie03.services;

public interface Utility {

    static int convertStringToInt(String input) {
        return Integer.parseInt(input);
    }
    static String[] getStringArrayWithDigitsFromPeselNumber(String input) {
        return input.split("");
    }


}
