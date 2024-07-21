package pl.kurs.zadanie01.models;

import java.time.LocalDate;

public class Baby extends Person {
    private final String gender;
    private final LocalDate birthDate;
    private final int weight;
    private final int height;
    private final Mother mother;

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }


    public Mother getMother() {
        return mother;
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
