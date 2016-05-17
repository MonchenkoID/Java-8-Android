package com.github.monchenkoid.java_eight.interfacemethods.defaultmethods;

/**
 * @author Iryna Monchanka
 * @version on 5/13/2016
 */

public interface Drivable {

    public void drive(int numUnits);

    public void start();

    public void stop();

    public void turnLeft();

    public void turnRight();

    public default void demo() {
        start();
        drive(20);
        turnLeft();
        drive(10);
        turnRight();
        drive(8);
        stop();
    }
}