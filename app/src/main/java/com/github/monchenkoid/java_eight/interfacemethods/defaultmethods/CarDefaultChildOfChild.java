package com.github.monchenkoid.java_eight.interfacemethods.defaultmethods;


import android.util.Log;

/**
 * @author Iryna Monchanka
 * @version on 5/13/2016
 */

public class CarDefaultChildOfChild extends CarDefaultChild {

    private static final String TAG = CarDefaultChildOfChild.class.getSimpleName();

    @Override
    public void drive(int numUnits) {
        Log.i(TAG, String.format("Driving car %d kilometers%n", numUnits));
    }
}