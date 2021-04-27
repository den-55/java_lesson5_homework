package ru.company;

import ru.company.enums.Gender;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    List<People> people = new ArrayList<People>();

    public void createObjects() {
        people.add(new People(Gender.MALE, 12, new Clothes("D&G", 45, Color.BLUE, 1)));
        people.add(new People(Gender.MALE, 12, new Clothes("D&G", 45, Color.BLUE, 1)));
        people.add(new People(Gender.MALE, 13, new Clothes("Armani", 43, Color.BLACK, 2)));
        people.add(new People(Gender.MALE, 11, new Clothes("Elephant", 40, Color.CYAN, 3)));
        people.add(new People(Gender.MALE, 20, new Clothes("Boat", 41, Color.DARK_GRAY, 1)));
        people.add(new People(Gender.MALE, 25, new Clothes("Gucci", 45, Color.RED, 2)));
        people.add(new People(Gender.MALE, 21, new Clothes("Lion", 39, Color.LIGHT_GRAY, 4)));
        people.add(new People(Gender.MALE, 22, new Clothes("Tiger", 46, Color.ORANGE, 4)));
        people.add(new People(Gender.MALE, 15, new Clothes("Dog", 39, Color.GREEN, 2)));
        people.add(new People(Gender.MALE, 26, new Clothes("Cat", 41, Color.BLUE, 1)));
        people.add(new People(Gender.MALE, 15, new Clothes("Louis Vuitton", 42, Color.YELLOW, 1)));
        people.add(new People(Gender.MALE, 11, new Clothes("Yudashkin", 46, Color.MAGENTA, 3)));
        people.add(new People(Gender.FEMALE, 20, new Clothes("Doll", 40, Color.WHITE, 3)));
        people.add(new People(Gender.FEMALE, 18, new Clothes("D&G", 39, Color.ORANGE, 1)));
        people.add(new People(Gender.FEMALE, 19, new Clothes("Toy", 37, Color.GREEN, 4)));
        people.add(new People(Gender.FEMALE, 23, new Clothes("Girl", 41, Color.WHITE, 4)));
        people.add(new People(Gender.FEMALE, 21, new Clothes("Alex", 42, Color.DARK_GRAY, 1)));
        people.add(new People(Gender.FEMALE, 24, new Clothes("Victoria", 41, Color.BLUE, 1)));
        people.add(new People(Gender.FEMALE, 17, new Clothes("Tom", 38, Color.RED, 1)));
        people.add(new People(Gender.FEMALE, 15, new Clothes("Jerry", 39, Color.GREEN, 2)));
        people.add(new People(Gender.FEMALE, 18, new Clothes("Jess", 42, Color.LIGHT_GRAY, 3)));
        people.add(new People(Gender.FEMALE, 14, new Clothes("Nika", 41, Color.ORANGE, 4)));
        people.add(new People(Gender.FEMALE, 12, new Clothes("Gloria", 43, Color.MAGENTA, 4)));
        people.add(new People(Gender.FEMALE, 13, new Clothes("M&M", 45, Color.BLACK, 2)));
        people.add(new People(Gender.FEMALE, 15, new Clothes("B&G", 41, Color.CYAN, 2)));
        people.add(new People(Gender.FEMALE, 16, new Clothes("Secrets", 39, Color.RED, 3)));
        people.add(new People(Gender.FEMALE, 21, new Clothes("Pink", 37, Color.ORANGE, 3)));
        people.add(new People(Gender.FEMALE, 24, new Clothes("Java", 41, Color.YELLOW, 1)));
        people.add(new People(Gender.FEMALE, 16, new Clothes("Alana", 39, Color.GRAY, 2)));
        people.add(new People(Gender.FEMALE, 17, new Clothes("Betti", 42, Color.DARK_GRAY, 2)));
        people.add(new People(Gender.FEMALE, 18, new Clothes("Brenda", 43, Color.PINK, 4)));
        people.add(new People(Gender.FEMALE, 19, new Clothes("Yudashkin", 36, Color.WHITE, 3)));
        people.add(new People(Gender.FEMALE, 20, new Clothes("Gucci", 37, Color.BLUE, 3)));
        people.add(new People(Gender.FEMALE, 21, new Clothes("Lara", 39, Color.BLACK, 1)));
        people.add(new People(Gender.FEMALE, 14, new Clothes("Liza", 43, Color.WHITE, 2)));
        people.add(new People(Gender.FEMALE, 12, new Clothes("Megan", 44, Color.ORANGE, 2)));
        people.add(new People(Gender.FEMALE, 11, new Clothes("Pamela", 41, Color.GREEN, 4)));
        people.add(new People(Gender.FEMALE, 13, new Clothes("Barbi", 40, Color.MAGENTA, 4)));
        people.add(new People(Gender.FEMALE, 19, new Clothes("Perl", 39, Color.DARK_GRAY, 1)));
        people.add(new People(Gender.FEMALE, 17, new Clothes("Tiffani", 43, Color.BLACK, 2)));
    }


    public void howManyGirlsAndBoys() {
        Stream<People> stream = people.stream();
        long countGirls = stream.filter(x -> x.getGender() == Gender.FEMALE).count();
        Stream<People> stream1 = people.stream();
        long countBoys = stream1.filter(x -> x.getGender() == Gender.MALE).count();
        System.out.println("В классе " + countGirls + " человек женского пола и " + countBoys + " человек мужского пола");
    }

    public void middleAge() {
        int middleAge = (int) people.stream().mapToInt(x -> x.getAge()).average().getAsDouble();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Средний возраст: " + middleAge);
    }

    public void sortClothes() {
        List<People> brand = people.stream().sorted(Comparator.comparing(o -> o.getClothes().getBrand())).collect(Collectors.toList());
        System.out.println("---------------------------------------------Список людей в порядке возрастания по имени одежды-----------------------------------------------------------");
        brand.forEach(System.out::println);
    }

    public void sortSize() {
        List<People> size = people.stream().sorted((o1, o2) -> o2.getClothes().getSize().compareTo(o1.getClothes().getSize())).collect(Collectors.toList());
        System.out.println("-----------------------------------------Список людей в порядке убывания по размеру одежды----------------------------------------------------------------");
        size.forEach(System.out::println);
    }

    public void sortPocket() {
        List<People> pocket = people.stream().filter(x -> x.getClothes().getPocketCount() == 2).collect(Collectors.toList());
        System.out.println("-----------------------------------------Список людей, у которых 2 кармана--------------------------------------------------------------------------------");
        pocket.forEach(System.out::println);
    }

    public void sortColor() {
        List<People> color = people.stream().filter(x -> x.getClothes().getColor() == Color.GREEN || x.getClothes().getColor() == Color.BLACK).collect(Collectors.toList());
        System.out.println("-----------------------------------------Список людей, у которых цвет одежды зелёный и чёрный-------------------------------------------------------------");
        color.forEach(System.out::println);
    }



}
