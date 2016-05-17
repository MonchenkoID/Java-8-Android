package com.github.monchenkoid.java_eight.annotations;

import android.util.Log;

/**
 * @author Iryna Monchanka
 * @version on 5/17/2016
 */

public class FunctionalInterfaceSample {

    private static final String TAG = FunctionalInterfaceSample.class.getSimpleName();

    public static double calculate(BinaryCalculator calc, double v1, double v2) {
        return calc.calculate(v1, v2);
    }

    public static double calculate(UnaryCalculator calc, double v) {
        return calc.calculate(v);
    }

    public static void calculate() {
        Log.i(TAG,
                String.format("18 + 36.5 = %f%n",
                        FunctionalInterfaceSample.calculate((double v1, double v2) -> v1 + v2, 18, 36.5)));
        Log.i(TAG,
                String.format("89 / 2.9 = %f%n",
                        FunctionalInterfaceSample.calculate((v1, v2) -> v1 / v2, 89, 2.9)));
        Log.i(TAG,
                String.format("-89 = %f%n",
                        FunctionalInterfaceSample.calculate(v -> -v, 89)));
        Log.i(TAG,
                String.format("18 * 18 = %f%n",
                        FunctionalInterfaceSample.calculate((double v) -> v * v, 18)));
    }
}