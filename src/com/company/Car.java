package com.company;

public class Car {

    // data
    int year;
    int maxSpeed;
    String brand;
    String model;
    int doors;
    int engineSize;
    boolean isElectric;
    boolean engineOn = false;

    // constructor
    public Car(int year, int maxSpeed, String brand, String model, int doors, int engineSize, boolean isElectric, boolean engineOn) {
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.model = model;
        this.doors = doors;
        this.engineSize = engineSize;
        this.isElectric = isElectric;
        this.engineOn = engineOn;
    }

    public Car(int year, int maxSpeed, String brand, String model, int doors, int engineSize) {
        this(year, maxSpeed, brand, model, doors, engineSize, false, false);
    }

    public Car(int maxSpeed, String brand, String model) {
        this(2024, maxSpeed, brand, model, 5, 1800);
    }

    // functions
    public void startEngine() {
        System.out.println(String.format("Starting the engine for car %s %s", brand, model));
        engineOn = true;
    }
}
