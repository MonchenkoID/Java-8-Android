package com.github.monchenkoid.java_eight.annotations.functionalinterface.function;

import android.util.Log;

import java.util.function.Predicate;

/**
 * @author Iryna Monchenko
 * @version on 04.05.2016
 */
public class JavaPredicate {

    private static final String TAG = JavaPredicate.class.getSimpleName();
    static Predicate<Double> function = x -> x > 10;
    static Predicate<Double> function2 = x -> x < -10;

    public static void run() {
        Log.i(TAG, String.valueOf(function.test(new Double(9))));// prints false
        Log.i(TAG, String.valueOf(function2.test(new Double(-20))));// prints true
    }

}
