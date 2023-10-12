package seminars.second.hw;

import java.util.OptionalDouble;

public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public abstract OptionalDouble testDrive();

    public abstract void park();
}
