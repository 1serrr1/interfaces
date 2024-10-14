package org.example;

interface Animal {
    void eat();
    void sleep();
}

abstract class Mammal implements Animal {
    abstract void walk();
}

class Lion extends Mammal {

    public void eat() {
        System.out.println("Лев ест мясо.");
    }

    public void sleep() {
        System.out.println("Лев спит.");
    }

    void walk() {
        System.out.println("Лев ходит.");
    }
}

class Elephant extends Mammal {

    public void eat() {
        System.out.println("Слон ест траву.");
    }

    public void sleep() {
        System.out.println("Слон спит.");
    }

    void walk() {
        System.out.println("Слон ходит медленно.");
    }
}
