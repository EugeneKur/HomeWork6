package ru.geekbrains.jca.homework6;

public class Animal {
    protected String type;
    protected String name;
    protected int maxrundistancerun;
    protected int maxrundistanceswim;


    public Animal (String name, String type, int maxrundistancerun, int maxrundistanceswim) {
        this.name = name;
        this.type = type;
        this.maxrundistancerun = maxrundistancerun;
        this.maxrundistanceswim = maxrundistanceswim;
    }

    public void run (int distance) {
        if (distance < maxrundistancerun)
        System.out.printf("%s %s run %dm\n", type, name, distance);
        else System.out.printf("%s %s can't run %dm\n", type, name, distance);
    }

    public void swim (int distance) {
        if (maxrundistanceswim == 0)
            System.out.printf("%s %s сan't swim \n", type, name);
        else if (distance < maxrundistanceswim)
            System.out.printf("%s %s swim %dm\n", type, name, distance);
        else System.out.printf("%s %s can't swim %dm\n", type, name, distance);
    }

}
