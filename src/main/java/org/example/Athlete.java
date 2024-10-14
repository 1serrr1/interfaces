package org.example;

interface Athlete {
    void train();
    void compete();
}

abstract class Runner implements Athlete {
    abstract double getBestTime();
}

class Sprinter extends Runner {
    private double bestTime;

    public Sprinter(double bestTime) {
        this.bestTime = bestTime;
    }

    public void train() {
        System.out.println("Спринтер тренируется на скорость.");
    }

    public void compete() {
        System.out.println("Спринтер соревнуется в беге на 100 метров.");
    }

    double getBestTime() {
        return bestTime;
    }
}

class MarathonRunner extends Runner {
    private double bestTime;

    public MarathonRunner(double bestTime) {
        this.bestTime = bestTime;
    }

    public void train() {
        System.out.println("Марафонец тренируется на выносливость.");
    }

    public void compete() {
        System.out.println("Марафонец участвует в забеге на 40 км.");
    }

    double getBestTime() {
        return bestTime;
    }
}
