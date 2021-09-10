package ru.geekbrains.jca.homework6;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class HomeWork6 {
    public static void main(String[] args) {

//        Animal[] animals = {
//                new Cat("Murzik"),
//                new Dog("Rex"),
//       };
//
//       for (int i = 0; i < animals.length; i++) {
//            animals[i].run();
//            animals[i].run();
//        }


        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Barsik");
        Dog dog1 = new Dog("Rex");
        Dog dog2 = new Dog("Rey");
        Dog dog3 = new Dog("Bim");
        Dog dog4 = new Dog("Bom");

        cat1.run(40);
        cat1.swim(6);
        cat2.run(60);
        cat2.swim(7);
        dog1.run(50);
        dog1.swim(81);
        dog2.run(20);
        dog2.swim(31);
        dog3.run(35);
        dog3.swim(100);
        dog4.run(150);
        dog4.swim(500);

        cat2.sumcat();
        dog3.sumdog();



    }
}
