package org.example;

interface Device {
    void turnOn();
    void turnOff();
}

abstract class ElectronicDevice implements Device {
    abstract int getPowerConsumption();
}

class TV extends ElectronicDevice {
    private int power;

    public TV(int power) {
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Телевизор включается.");
    }

    public void turnOff() {
        System.out.println("Телевизор выключается.");
    }

    int getPowerConsumption() {
        return power;
    }
}

class Computer extends ElectronicDevice {
    private int power;

    public Computer(int power) {
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Компьютер включается.");
    }

    public void turnOff() {
        System.out.println("Компьютер выключается.");
    }


    int getPowerConsumption() {
        return power;
    }
}