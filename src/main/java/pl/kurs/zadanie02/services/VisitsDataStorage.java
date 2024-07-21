package pl.kurs.zadanie02.services;

import pl.kurs.zadanie02.models.Doctor;
import pl.kurs.zadanie02.models.Patient;
import pl.kurs.zadanie02.models.Visit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class VisitsDataStorage {

    public static List<Visit> readVisitsFromFile(File file, List<Doctor> doctorList, List<Patient> patientList) {
        List<Visit> resultList = new ArrayList<>();
        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)
        ) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("I")) {
                    continue;
                } else {
                    resultList.add(createVisitObjectFromDataInString(line, doctorList, patientList));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultList;
    }

    private static Visit createVisitObjectFromDataInString(String input, List<Doctor> doctorList, List<Patient> patientList) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        String[] temp = input.replaceAll("\\s+", " ").split(" ");
        Doctor doctor = findDoctorById(doctorList, Utility.convertStringToInt(temp[0]));
        Patient patient = findPatientById(patientList, Utility.convertStringToInt(temp[1]));
        LocalDate visitDate = LocalDate.parse(temp[2], formatter);
        return new Visit(doctor, patient, visitDate);
    }

    private static Doctor findDoctorById(List<Doctor> input, int id) {
        Doctor result = null;
        for (Doctor docs : input) {
            if (docs.getId() == id) {
                result = docs;
            }
        }
        return result;
    }

    private static Patient findPatientById(List<Patient> input, int id) {
        Patient result = null;
        for (Patient pats : input) {
            if (pats.getId() == id) {
                result = pats;
            }
        }
        return result;
    }

}
