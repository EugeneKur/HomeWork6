package ru.geekbrains.jca.homework6;

public class Dog extends Animal {
    private static int number = 0;

    public Dog (String name) {
        super(name, "Dog", 100, 80);
        number++;
    }

    public void sumdog () {
        System.out.println("Create dogs: " + number);
    }
}
