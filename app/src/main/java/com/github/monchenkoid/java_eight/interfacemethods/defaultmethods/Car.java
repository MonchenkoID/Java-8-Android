package com.github.monchenkoid.java_eight.interfacemethods.defaultmethods;

import android.util.Log;

/**
 * @author Iryna Monchanka
 * @version on 5/13/2016
 */

public class Car implements Drivable {

    private static final String TAG = Car.class.getSimpleName();

    @Override
    public void demo() {
        start();
        drive(20);
        stop();
    }

    @Override
    public void drive(int numUnits) {
        Log.i(TAG, String.format("Driving car %d kilometers%n", numUnits));
    }

    @Override
    public void start() {
        Log.i(TAG, "Starting car");
    }

    @Override
    public void stop() {
        Log.i(TAG, "Stopping car");
    }

    @Override
    public void turnLeft() {
        Log.i(TAG, "Turning car left");
    }

    @Override
    public void turnRight() {
        Log.i(TAG, "Turning car right");
    }
}
