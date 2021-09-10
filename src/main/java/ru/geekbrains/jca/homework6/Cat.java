package ru.geekbrains.jca.homework6;

public class Cat extends Animal{
    private static int number = 0;

    public Cat (String name) {
        super(name, "Cat", 50, 0);
        number++;
    }

    public void sumcat () {
        System.out.println("Create cats: " + number);
    }

}
