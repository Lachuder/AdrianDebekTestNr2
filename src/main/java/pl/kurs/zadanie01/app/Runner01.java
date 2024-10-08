package pl.kurs.zadanie01.app;

import pl.kurs.zadanie01.models.Baby;
import pl.kurs.zadanie01.models.Mother;
import pl.kurs.zadanie01.services.BabiesService;
import pl.kurs.zadanie01.services.MaternityService;
import pl.kurs.zadanie01.services.MothersService;

import java.io.File;
import java.util.Arrays;

public class Runner01 {

    public static void main(String[] args) {

        Mother[] mothers = MothersService.readMothersFromFile(new File("mamy.txt"));
        Baby[] babies = BabiesService.readBabiesFromFile(new File("noworodki.txt"), mothers);
        MothersService.assignBabiesToMothers(babies);
        System.out.println("MaternityService.findTallestBoy(babies) = " + MaternityService.findTallestBoy(babies));
        System.out.println("MaternityService.findTallestGirl(babies) = " + MaternityService.findTallestGirl(babies));
        System.out.println("MaternityService.getNamesOfMothersBeforeAge25WithBabiesOver4000G(mothers) = " + Arrays.toString(MaternityService.getNamesOfMothersBeforeAge25WithBabiesOver4000G(mothers)));
        System.out.println("MaternityService.findDaughtersWithNameAfterMotherAndGetBirthDate(babies) = " + Arrays.toString(MaternityService.findDaughtersWithNameAfterMotherAndGetBirthDate(babies)));
        System.out.println("MaternityService.findMothersOfTwins(mothers) = " + Arrays.toString(MaternityService.findMothersOfTwins(mothers)));


    }

}
