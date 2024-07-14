package pl.kurs.zadanie02.services;

public interface Utility {

    static int convertStringToInt(String input) {
        return Integer.parseInt(input);
    }
    static String[] convertStringElementsToArray(String input) {
        return input.replaceAll("\\s+", " ").split(" ");
    }
}
