package com.github.monchenkoid.java_eight.methodreference;

import android.util.Log;

import java.util.function.Function;

/**
 * @author Iryna Monchenko
 * @version on 05.05.2016
 */
public class ReferenceUnBoundNonStatic {

    private static final String TAG = ReferenceUnBoundNonStatic.class.getSimpleName();
    private static final String STRING = "some string to be printed";

    public static void run() {
        methodReference();
        lambda();
        anonymousClass();
    }

    private static void anonymousClass() {
        print(new Function<String, String>() {
            @Override
            public String apply(String s) // receives argument in parameter
            {                             // and doesn't need to close over
                return s.toString();       // it
            }
        }, STRING);
    }

    private static void lambda() {
        print(s -> s.toString(), STRING);
    }

    private static void methodReference() {
        print(String::toString, STRING);
    }

    public static void print(Function<String, String> function, String value) {
        Log.i(TAG, function.apply(value));
    }
}