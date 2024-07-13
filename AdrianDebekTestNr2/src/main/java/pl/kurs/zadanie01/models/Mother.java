package pl.kurs.zadanie01.models;

import java.util.Arrays;
import java.util.Objects;

public class Mother extends Person {

    private int age;
    private Baby[] babies = new Baby[0];

    public Mother(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Baby[] getBabies() {
        return babies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mother mother = (Mother) o;
        return age == mother.age && Arrays.equals(babies, mother.babies);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(age);
        result = 31 * result + Arrays.hashCode(babies);
        return result;
    }

    public void addBaby(Baby baby) {
        this.babies = Arrays.copyOf(this.babies, this.babies.length + 1);
        babies[babies.length - 1] = baby;
    }


    @Override
    public String toString() {
        return super.toString() +
                ", age=" + age +
                '}';
    }
}
