package pl.kurs.zadanie03.services;

public interface Utility {

    default int convertStringToInt(String input) {
        return Integer.parseInt(input);
    }
    default String[] getStringArrayWithDigitsFromPeselNumber(String input) {
        return input.split("");
    }


}
