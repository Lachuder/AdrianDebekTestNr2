package pl.kurs.zadanie03.services;

public interface Utility {

    static String[] getStringArrayWithDigitsFromPeselNumber(String input) {
        return input.split("");
    }


}
