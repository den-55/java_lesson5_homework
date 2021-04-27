package ru.company;

import ru.company.enums.Gender;


public class People {


    private Gender gender;
    private Integer age;
    private Clothes clothes;

    public People(Gender gender, Integer age, Clothes clothes) {
        this.gender = gender;
        this.age = age;
        this.clothes = clothes;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return "People{" +
                "gender=" + gender +
                ", age=" + age +
                ", clothes=" + clothes +
                '}';
    }
}
