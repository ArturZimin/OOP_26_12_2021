package by.zimin.person;

import java.util.Objects;

public class Person {

    private String name;
    private SkinColor skinColor;
    private Gender gender;


    public Person(String name, SkinColor skinColor, Gender gender) {
        this.name = name;
        this.skinColor = skinColor;
        this.gender = gender;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SkinColor getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(SkinColor skinColor) {
        this.skinColor = skinColor;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && skinColor == person.skinColor && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, skinColor, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", skinColor=" + skinColor +
                ", gender=" + gender +
                '}';
    }
}
