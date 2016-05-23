package com.github.monchenkoid.java_eight.annotations.functionalinterface.function;

import android.util.Log;

import java.util.function.BiPredicate;

/**
 * @author Iryna Monchenko
 * @version on 04.05.2016
 */
public class JavaBiPredicate {

    private static final String TAG = JavaBiPredicate.class.getSimpleName();

    public static void run() {
        BiPredicate<Integer, String> condition = (i, s)-> i>20 && s.startsWith("R");
        Log.i(TAG, String.valueOf(condition.test(10,"Ram")));
        Log.i(TAG, String.valueOf(condition.test(30,"Shyam")));
        Log.i(TAG, String.valueOf(condition.test(30,"Ram")));
    }

}
