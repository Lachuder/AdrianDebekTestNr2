package pl.kurs.zadanie01.models;

import java.time.LocalDate;

public class Baby extends Person {
//    1 c Agnieszka 1999-11-20 2450 48 33
    private String gender;
    private LocalDate birthDate;
    private int weight;
    private int height;
    private int babyIndexOfMother;
    private Mother mother;

    public Baby(int id, String name, String gender, LocalDate birthDate, int weight, int height, Mother mother) {
        super(id, name);
        this.gender = gender;
        this.birthDate = birthDate;
        this.weight = weight;
        this.height = height;
        this.mother = mother;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBabyIndexOfMother() {
        return babyIndexOfMother;
    }

    public void setBabyIndexOfMother(int babyIndexOfMother) {
        this.babyIndexOfMother = babyIndexOfMother;
    }

    public Mother getMother() {
        return mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return super.toString() +
                " gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", weight=" + weight +
                ", height=" + height +
                ", mother=" + mother +
                '}';
    }
}
