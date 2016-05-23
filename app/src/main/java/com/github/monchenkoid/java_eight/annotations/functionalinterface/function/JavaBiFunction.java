package com.github.monchenkoid.java_eight.annotations.functionalinterface.function;

import android.util.Log;

import java.util.function.BiFunction;

/**
 * @author Iryna Monchenko
 * @version on 03.05.2016
 */
public class JavaBiFunction {

    private static final String TAG = JavaBiFunction.class.getSimpleName();

    public static void run() {
        String result = calc((a, b) -> ": " + (a * b), 3, 5);
        Log.i(TAG, result);
        concat();
    }

    public static String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
        return bi.apply(i1, i2);
    }

    public static void concat() {
        BiFunction<String, String, String> bi = (x, y) -> {
            return x + y;
        };

        Log.i(TAG, bi.apply("java2s.com", " tutorial"));
    }
}