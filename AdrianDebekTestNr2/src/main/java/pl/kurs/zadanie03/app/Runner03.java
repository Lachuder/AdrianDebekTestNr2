package pl.kurs.zadanie03.app;

import pl.kurs.zadanie03.data.GroupName;
import pl.kurs.zadanie03.data.PositionTitle;
import pl.kurs.zadanie03.models.Employee;
import pl.kurs.zadanie03.models.Student;
import pl.kurs.zadanie03.services.SchoolService;

public class Runner03 {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Michal", "Sloniewski", "90051801234", "Warsaw", PositionTitle.TEACHER, 1_000);
        Employee employee2 = new Employee("Waldemar", "Pietrzak", "90061923456", "Warsaw", PositionTitle.MASTER, 1_000_000);
        Employee employee3 = new Employee("Katarzyna", "Nowak", "80010107065", "Kraków", PositionTitle.JANITOR, 100);

        Student student1 = new Student("Adrian", "Debek", "00032906074", "Warsaw", GroupName.SPORT, 100);
        Student student2 = new Student("Jan", "Kowalski", "85042001058", "Pcim", GroupName.LANGUAGE, 180);
        Student student3 = new Student("Anna", "Kucharska", "950951601008", "Oslztyn", GroupName.MATH, 150);

        SchoolService.addPerson(employee1);
        SchoolService.addPerson(employee2);
        SchoolService.addPerson(employee3);
        SchoolService.addPerson(student1);
        SchoolService.addPerson(student2);
        SchoolService.addPerson(student3);

        System.out.println("SchoolService.countFemalesInSchool() = " + SchoolService.countFemalesInSchool());
        System.out.println("SchoolService.getPersonWithHighestIncome() = " + SchoolService.getPersonWithHighestIncome());

    }

}
